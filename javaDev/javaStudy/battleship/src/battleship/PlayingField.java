package battleship;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

/**
 * The Playing Field Panel used by the Game class, holding all game data.
 *
 * @author       William Dubel
 * @version      1.0     June 29, 2001
 */

class PlayingField extends JPanel implements Serializable
{
	// Contants for the ships
	public static final int SPLASH = 0,
							CARRIER = 1,
							SEAWOLF = 2,
							BATTLESHIP = 3,
							SUBMARINE = 4,
							PATROL = 5,

							IDLE = 0,
							SHIP_PLACEMENT = 1,
							POINT_SELECTION = 2;

	transient private int 	mode = IDLE;
	transient public int	selectedShip = 0;
	transient public int	selectedShipSize = 0;

	transient private JButton carrierB, seawolfB, battleshipB, submarineB, patrolB;

	static Image target, logo, fire, splash;
	static Image [][] ships = new Image[6][3];	//0 based indices not used

	transient private JPanel fields, buttonPanel, statusPanel;
	transient private GridArea enemyOcean, myOcean;

	transient private JTextArea status;

	//static Font gameFont = new Font("Courier New", Font.BOLD, 14);	//Very slow

	/*//This should be deleted
	public static void main(String [] args)
	{
		JFrame me = new JFrame("TestPanels");
		PlayingField myGame = new PlayingField("BattleShip Game in Server Mode");
		me.getContentPane().add(myGame, BorderLayout.CENTER);
		me.setVisible(true);
		me.pack();
		myGame.placeShips();
		me.addWindowListener( new WindowAdapter()	{
			public void windowClosing( WindowEvent e )
			{ 	System.exit(0);	}	}	);
	}//*/

	public PlayingField(String gameTitle)
	{
		setLayout(new BorderLayout());
		ships[CARRIER][1] = (new ImageIcon("graphics/carrier.gif")).getImage();
		ships[SEAWOLF][1] = (new ImageIcon("graphics/seawolf.gif")).getImage();
		ships[BATTLESHIP][1] = (new ImageIcon("graphics/battleship.gif")).getImage();
		ships[SUBMARINE][1] = (new ImageIcon("graphics/submarine.gif")).getImage();
		ships[PATROL][1] = (new ImageIcon("graphics/patrol.gif")).getImage();
		ships[CARRIER][2] = (new ImageIcon("graphics/carrierv.gif")).getImage();
		ships[SEAWOLF][2] = (new ImageIcon("graphics/seawolfv.gif")).getImage();
		ships[BATTLESHIP][2] = (new ImageIcon("graphics/battleshipv.gif")).getImage();
		ships[SUBMARINE][2] = (new ImageIcon("graphics/submarinev.gif")).getImage();
		ships[PATROL][2] = (new ImageIcon("graphics/patrolv.gif")).getImage();
		splash = (new ImageIcon("graphics/splash.gif")).getImage();
		fire = (new ImageIcon("graphics/fire.gif")).getImage();
		target = (new ImageIcon("graphics/target.gif")).getImage();
		logo = (new ImageIcon("graphics/logo.jpg")).getImage();

		fields = new JPanel();
		enemyOcean = new LeftField(this);
		myOcean = new RightField(this);

		fields.setLayout(new FlowLayout());
		fields.add(enemyOcean);
		fields.add(new LogoPanel());
		fields.add(myOcean);
		fields.setBorder(new TitledBorder(gameTitle));

		status = new JTextArea("Welcome to BattleShip\n", 4, 0);
		(statusPanel = new JPanel()).setLayout(new BorderLayout());
		statusPanel.setBorder(new TitledBorder("Game Status Report"));
		statusPanel.add(new JScrollPane(status, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), BorderLayout.CENTER);

		add(fields, BorderLayout.CENTER);

		ButtonHandler itemHandler = new ButtonHandler();

		(carrierB = new JButton("Carrier", new ImageIcon(ships[CARRIER][1]))).addActionListener(itemHandler);
		(seawolfB = new JButton("Seawolf", new ImageIcon(ships[SEAWOLF][1]))).addActionListener(itemHandler);
		(battleshipB = new JButton("Battleship",new ImageIcon(ships[BATTLESHIP][1]))).addActionListener(itemHandler);
		(submarineB = new JButton("Submarine",new ImageIcon(ships[SUBMARINE][1]))).addActionListener(itemHandler);
		(patrolB = new JButton("Patrol",new ImageIcon(ships[PATROL][1]))).addActionListener(itemHandler);

		JPanel shipsTop = new JPanel(new GridLayout(1,2));
		shipsTop.add(carrierB);
		shipsTop.add(battleshipB);

		JPanel shipsBottom = new JPanel(new GridLayout(1,3));
		shipsBottom.add(seawolfB);
		shipsBottom.add(submarineB);
		shipsBottom.add(patrolB);

		JPanel ships = new JPanel(new GridLayout(2,1));

		ships.add(shipsTop);
		ships.add(shipsBottom);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.setBorder(new TitledBorder("Select A Ship To Place on the Home Field"));
		buttonPanel.add(ships, BorderLayout.CENTER);

		add(statusPanel, BorderLayout.SOUTH);
	}

	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent e )
		{
			((JButton)e.getSource()).setEnabled(false);
			if (e.getSource()==carrierB) {
				selectedShip = CARRIER;
				selectedShipSize = 5;
			}
			if (e.getSource()==battleshipB) {
				selectedShip = BATTLESHIP;
				selectedShipSize = 4;
			}
			if (e.getSource()==submarineB) {
				selectedShip = SUBMARINE;
				selectedShipSize = 3;
			}
			if (e.getSource()==seawolfB) {
				selectedShip = SEAWOLF;
				selectedShipSize = 3;
			}
			if (e.getSource()==patrolB) {
				selectedShip = PATROL;
				selectedShipSize = 2;
			}
		}
	}

	public int getMode()				{	return mode;			}

	public void setResult(Point coordinates, int result)
	{
		int temp = enemyOcean.getArea(coordinates);
		enemyOcean.setArea(coordinates, result + temp);
		enemyOcean.repaint();
	}

	public Point getPoint()
	{
		Point thePoint = null;

		mode = POINT_SELECTION;
		do
		{
			thePoint = enemyOcean.getSelected();
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException ie)	{ie.printStackTrace();}
		}
		while (thePoint==null);

		mode = IDLE;
		return thePoint;
	}

	public int getHit(Point coordinates)
	{
		int theArea = myOcean.getArea(coordinates);
		int ship = (theArea % 100) / 10;
		if ((theArea / 100) % 10 == 0)
		{
			if (ship>0)
			{
				String shipName = "Unknown";
				switch (ship)
				{
					case CARRIER:		shipName = "Carrier!";		break;
					case BATTLESHIP:	shipName = "Battleship!";	break;
					case SUBMARINE:		shipName = "Submarine!";	break;
					case SEAWOLF:		shipName = "Seawolf!";		break;
					case PATROL:		shipName = "Patrol!";		break;
				}
				addMessage("HIT!!! You hit the " + shipName);
				if (BattleShip.soundOn()) Sound.playHit();
			}
			else
			{
				addMessage("MISS!! You missed all enemy ships!");
				if (BattleShip.soundOn()) Sound.splash.play();
			}
			theArea += 100;
			myOcean.setArea(coordinates, theArea);
			myOcean.repaint();
		}
		else
		{
			addMessage("You selected a previously selected coordinate!");
			theArea = -theArea;
		}
		return theArea;
	}

	public void placeShips()
	{
		remove(statusPanel);
		add(buttonPanel, BorderLayout.SOUTH);
		validate();
		mode = SHIP_PLACEMENT;
		boolean moreShips = true;
		while (moreShips)
		{
			try	{	Thread.sleep(10);	}
			catch(InterruptedException ie)	{ie.printStackTrace();}
			moreShips = carrierB.isEnabled() || battleshipB.isEnabled() ||
				submarineB.isEnabled() || seawolfB.isEnabled() || patrolB.isEnabled();
		}
		selectedShipSize = 0;
		remove(buttonPanel);
		add(statusPanel, BorderLayout.SOUTH);
		SwingUtilities.updateComponentTreeUI(this);
		mode = IDLE;
	}

	public void addMessage(String message)
	{
		status.append(message + "\n");
		status.setCaretPosition(status.getText().length());
	}
}

class LeftField extends GridArea
{
	public LeftField(PlayingField handle)
	{
		super("Opponents Field", handle);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		int current;
		for (int y=0; y<10; y++) for (int x=0; x<10; x++)
		{
			if (area[x][y]!=0)
			{
				current = area[x][y]/10;
				if ((current/10)%10!=0)		//or could be written, ==1
				{
					if (current%10!=0) g2.drawImage(PlayingField.fire, 25*x, 25*y, this);
					else g2.drawImage(PlayingField.splash, 25*x, 25*y, this);
				}
			}
		}
		if (cursorLocation!=null) g2.drawImage(PlayingField.target,
					25*(int)cursorLocation.getX(), 25*(int)cursorLocation.getY(), this);
	}
}

class RightField extends GridArea
{
	public RightField(PlayingField handle)
	{
		super("Home Field", handle);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		int current;
		for (int y=0; y<10; y++) for (int x=0; x<10; x++)
		{
			if (area[x][y]!=0)
			{
				current = area[x][y];
				if (current%10!=0)
					g2.drawImage(PlayingField.ships[(current/10)%10][current%10], 	25*x, 25*y, this);
				current /= 10;
				if ((current/10)%10==1)
				{
					if (current%10!=0) g2.drawImage(PlayingField.fire, 25*x, 25*y, this);
					else g2.drawImage(PlayingField.splash, 25*x, 25*y, this);
				}
			}
		}
		if (mainHandle.selectedShipSize!=0 && validPlacement())
		{
			if (vertical) g2.fill3DRect(25*(int)cursorLocation.getX(),
				25*(int)cursorLocation.getY(), 25, 25*mainHandle.selectedShipSize, false);
			else g2.fill3DRect(25*(int)cursorLocation.getX(),
				25*(int)cursorLocation.getY(), 25*mainHandle.selectedShipSize, 25, false);
		}
	}
}

class LogoPanel extends JPanel
{
	public Dimension getPreferredSize()		{	return new Dimension(100,270);	}
	public void paintComponent(Graphics g)	{	g.drawImage(PlayingField.logo, 0, 0, this);	}
}