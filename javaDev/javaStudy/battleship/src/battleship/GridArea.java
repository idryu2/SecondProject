package battleship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GridArea.java: Base class to LeftField and RightField
 *
 * @author       William Dubel
 * @version      1.0     June 29, 2001
 */

class GridArea extends JPanel
{
	protected int area [][] =
			{{	0,	11,	0,	0,	0,	0,	0,	0,	0,	0	},
			{	0,	10,	0,	42,	40,	40,	0,	0,	0,	0	},
			{	0,	10,	0,	31,	0,	0,	0,	0,	0,	0	},
			{	0,	10,	0,	30,	00,	0,	0,	0,	0,	0	},
			{	0,	10,	0,	30,	0,	0,	0,	0,	0,	0	},
			{	0,	0,	0,	30,	0,	0,	0,	0,	0,	0	},
			{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
			{	0,	0,	0,	0,	0,	0,	0,	52,	50,	0	},
			{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
			{	0,	22,	20,	20,	20,	0,	0,	0,	0,	0	}};	//Just a test array for now
						//new int[10][10];

	protected boolean vertical = false;
	private String title;
	private Point selected;
	protected Point cursorLocation;
	private Rectangle gridRects[][] = new Rectangle[10][10];
	protected PlayingField mainHandle;

	public GridArea(String title, PlayingField mainHandle)
	{
		this.title = title;
		this.mainHandle = mainHandle;
		for (int y=0; y<10; y++)
			for (int x=0; x<10; x++) gridRects[x][y] = new Rectangle(x*25,y*25,25,25);

		addMouseMotionListener(new MouseMovingHandler());
		addMouseListener(new MouseHandler());

		setOpaque(false);
	}

	public Point getSelected()
	{
		Point temp = selected;
		selected = null;
		mainHandle.selectedShip = 0;		//be sure to get the ship before getSelected
		return temp;
	}

	public Dimension getPreferredSize()		{	return new Dimension(251,270);	}

	public void setArea(Point where, int contents)
	{
		area[(int)where.getX()][(int)where.getY()] = contents;
	}

	public int getArea(Point check)
	{
		return area[(int)check.getX()][(int)check.getY()];
	}

	protected boolean validPlacement()
	{
		if (vertical)
		{
			if ((int)cursorLocation.getY() + mainHandle.selectedShipSize > 10) return false;
			for (int i = 0; i < mainHandle.selectedShipSize; i++)
				if (false) return false;		//if overlapping
		}
		else
		{
			if ((int)cursorLocation.getX() + mainHandle.selectedShipSize > 10) return false;
			for (int i = 0; i < mainHandle.selectedShipSize; i++)
				if (false) return false;		//if overlapping
		}
		return true;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		GradientPaint gp = new GradientPaint(0.0f, 0.0f, new Color(40,200,140),
				   250.0f, 250.0f, new Color(40,180,210));
		g2.setPaint(gp);
		g2.fillRect(0, 0, 250, 250);

		g2.setColor(new Color(0,100,90));
		for (int i=1; i<10; i++)
		{
			g2.drawLine(i*25,0,i*25,250);
			g2.drawLine(0,i*25,250,i*25);
		}
		g2.setColor(Color.black);
		g2.draw3DRect(0,0,250,250,false);

		g2.setColor(new Color(0,60,60));
		//g2.setFont(PlayingField.gameFont);		//loading the font is slow
		g2.drawString(title, 125-(title.length()*4), 268);
	}

	private class MouseMovingHandler extends MouseMotionAdapter
	{
		private Rectangle lastSelected = new Rectangle();

		public void mouseMoved(MouseEvent e)
		{
			int x = (int)(e.getPoint().getX()/25);
			int y = (int)(e.getPoint().getY()/25);

			if(x<10 && y<10 && gridRects[x][y]!=lastSelected)
			{
				lastSelected = gridRects[x][y];
				cursorLocation = new Point(x,y);
				repaint();
			}
		}
	}

	private class MouseHandler extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			if(e.getModifiers() == e.BUTTON1_MASK)
			{
				selected = cursorLocation;
				mainHandle.addMessage("You selected: " + selected);	//delete this
			}
			if(e.getModifiers() == e.BUTTON3_MASK)
			{
				vertical = !vertical;		//toggles vertical ship placing state
				repaint();
			}
		}
	}
}