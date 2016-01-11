package battleship;

import java.net.*;
import java.io.*;

/**
 * Connection.java	Creates a simple TCP connection to another Connection Object. Two applications
 * create instances of this class, first the application creating the server connection object,
 * second the client who wishes to connect to the server application. The connection class handles
 * only one connection per port per class instantiated, and has not been tested for thread safety.
 *
 * @author       William Dubel
 * @version      1.0     June 29, 2001
 */
public class Connection implements Runnable
{
	private String IPAddress;
	private int port;
	private boolean connected = false;
	private Socket link;
	private ObjectInputStream input;
	private ObjectOutputStream output;

	private volatile Object objectQueue[] = new Object[0];

	/**
	* Overloaded as the server connection, taking the port to listen to,
	* as well as a timeout in seconds.
	* @param        portNumber   the port this server connection listens to
	* @param        seconds   the timeout value in seconds
	* @exception    SocketException when the connection times out on connect
	*/
	public Connection(int portNumber, int seconds) throws SocketException
	{
		port = portNumber;
		try
		{
			ServerSocket socket = new ServerSocket(port, 1);
			socket.setSoTimeout(seconds*1000);
			link = socket.accept();
			output = new ObjectOutputStream( link.getOutputStream() );
			output.flush();

			input = new ObjectInputStream( link.getInputStream() );

			IPAddress = link.getInetAddress().toString();
			connected = true;
			Thread go = new Thread(this, "ObjectQueue");
			go.setDaemon(true);
			go.start();
		}
		catch (IOException e)
		{
			e.printStackTrace(); //code to handle error here
		}
	}

	/**
	* Overloaded as the server connection, taking the port to listen to.
	* @param        portNumber   the port this server connection listens to
	* @exception    SocketException should never be thrown.
	*/
	public Connection(int portNumber) throws SocketException
	{
		this(portNumber, 0);
	}

	/**
	* Connection overloaded as the client connection. An instance of the connection object must first
	* be instanced as a server connection on the address that is specified to this client object.
	* @param        address   the address of the server to connect to.
	* @param        portNumber   the port this server connection listens to
	* @exception    UnknownHostException if no server is listening on the specified port
	*/
	public Connection(String address, int portNumber) throws UnknownHostException
	{
		IPAddress = address;
		port = portNumber;
		try
		{
			link = new Socket(IPAddress, port);
			output = new ObjectOutputStream( link.getOutputStream() );
			output.flush();

			input = new ObjectInputStream( link.getInputStream() );

			connected = true;
			Thread go = new Thread(this, "ObjectQueue");
			go.setDaemon(true);
			go.start();
		}
		catch (IOException e)
		{
			e.printStackTrace(); //code to handle error here
		}
	}

	/**
	* This method is never called directly, it is started automatically as a thread.
	*/
	public void run()
	{
		while (connected)
		{
			try
			{
				Object temp[] = new Object[objectQueue.length+1];
				for (int i=0;i<objectQueue.length;i++) temp[i]=objectQueue[i];
				temp[temp.length-1] = input.readObject();
				objectQueue = temp;

				Thread.sleep(0);		//not necessary unless something goes wrong
			}
			catch(IOException e)
			{
				e.printStackTrace();
				connected = false;
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
				connected = false;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	* True when the connection between two addresses has been established, and attempts to indicate
	* if the connection is still alive.
	* @return       boolean
	*/
	public boolean established()
	{
		return connected;
	}

	/**
	* This returns an object if one is available in the incoming queue, null if otherwise.
	* @return       Object
	*/
	public Object getObject()
	{
		Object obj = null;

		if (objectQueue.length>0)
		{
			obj = objectQueue[0];

			Object temp[] = new Object[objectQueue.length-1];
			for (int i=0;i<temp.length;i++) temp[i]=objectQueue[i+1];
			objectQueue = temp;
		}
		return obj;
	}

	/**
	* This returns an object if one is available in the incoming queue, null if otherwise.
	* @param       obj       Any serializable object
	*/
	public void sendObject(Object obj)
	{
		if (connected)
		{
			try
			{
				output.writeObject(obj);
				output.flush();
			}
			catch(IOException e)
			{
				e.printStackTrace();
				connected = false;
				//javax.swing.JOptionPane.showMessageDialog(null, "Disconnected");
			}
		}
	}

	/**
	* Returns the port the connection is established on. Should be a zero if not yet connected.
	* @return       int
	*/
	public int getPort()   {   return port;   }

	/**
	* Returns the IP address of the connecting object.
	* @return       String
	*/
	public String getOtherIP()
	{
		return (connected) ? IPAddress : "Not Connected";
	}

	/**
	* Returns the IP address of this object. Available before connection is established.
	* @return       String
	*/
	static public String getMyIP()
	{
		try
		{
			return InetAddress.getLocalHost().toString();
		}
		catch(UnknownHostException e)
		{
			return "Unknown Host";
		}
	}

	/**
	* Cleans up resources.
	*/
	protected void finalize()
	{
		try
		{
			output.close();
			link.close();
			super.finalize();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}