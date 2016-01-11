package battleship;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.*;
import java.io.*;

/**
 * HelpBrowser.java Provides a simple browser to display the help file from within the program
 *
 * @author       William Dubel
 * @version      1.0     July 29, 2001
 */

public class HelpBrowser extends JFrame
{
	private JEditorPane contents;

	public HelpBrowser()
	{
		super("BattleShip Help Browser");

		Container c = getContentPane();

		contents = new JEditorPane();

		contents.setEditable(false);
		contents.addHyperlinkListener( new HyperlinkListener()
		{
			public void hyperlinkUpdate( HyperlinkEvent e )
			{
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
				   getPage( e.getURL().toString() );
			}
		});
		c.add( new JScrollPane(contents), BorderLayout.CENTER);
		setSize(600,480);
		setVisible(true);
		try
		{
			getPage( new File("help.html").toURL().toString() );
		}
		catch(MalformedURLException mue){}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void getPage(String location)
	{
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR ));

		try
		{
			contents.setPage(location);
		}
		catch (IOException ioe)
		{
			JOptionPane.showMessageDialog(this, "Error loading file", "Bad File",
				JOptionPane.ERROR_MESSAGE );
		}
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR ));
	}
}