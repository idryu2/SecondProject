package battleship;

/**
 * Title:        BattleShip
 * @author       William Dubel
 * @version      1.0 07/28/2001
 */

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Game extends Container
{
	protected PlayingField myField;

	private JPanel statusBar, messagePanel;
	private JTextField message;
	private JButton send;
	protected Point thePoint;
	protected int result;
	protected Connection myConnection;
	protected boolean demoRunning = true;

	Game(String borderTitle)
	{
		myField = new PlayingField(borderTitle);

		setLayout(new BorderLayout());
		add(myField, BorderLayout.CENTER);

		(messagePanel = new JPanel()).setLayout(new BorderLayout());
		messagePanel.setBorder(new TitledBorder("Message Dispatcher"));
		message = new JTextField();
		message.addKeyListener(new KeyAdapter()
	  {
		public void keyTyped (KeyEvent ke)
		{
			if (ke.getKeyChar()==ke.VK_ENTER)
			{
				if (myConnection!=null && myConnection.established())
				{
				   myConnection.sendObject(new ObjectPacket(message.getText()));
				}
				myField.addMessage("Dispatched: " + message.getText());
				message.setText("");
				if (BattleShip.soundOn()) Sound.sonar.play();
			}
		}
	  });

	  ButtonHandler handle = new ButtonHandler();
		send = new JButton("Send");
		send.addActionListener(handle);

		messagePanel.add(message, BorderLayout.CENTER);
		messagePanel.add(send, BorderLayout.EAST);
		add(messagePanel, BorderLayout.SOUTH);
	}

	private class ButtonHandler implements ActionListener
   {
	  public void actionPerformed( ActionEvent e )
	  {
			if (e.getSource() == send)
			{
				if (myConnection!=null && myConnection.established())
				{
					myConnection.sendObject(new ObjectPacket(message.getText()));
				}
				myField.addMessage("Dispatched: " + message.getText());
				message.setText("");
				if (BattleShip.soundOn()) Sound.sonar.play();
			}
		}
	}
}