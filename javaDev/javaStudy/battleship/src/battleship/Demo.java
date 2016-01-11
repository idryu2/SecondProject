package battleship;

/**
 * Demo.java:   Allows player to pick locations and select targets
 * @author      William Dubel
 * @version     1.0    June 29, 2001
 */

class Demo extends Game implements Runnable
{
	Demo()
	{
		super("BattleShip Game in Demo Mode");
		new Thread(this, "GameDemo").start();
	}

	public void run()
	{
		if (BattleShip.soundOn()) Sound.start.play();
		myField.placeShips();
		while (demoRunning)
		{
			thePoint = myField.getPoint();
			result = myField.getHit(thePoint);		//In real game this is sent to & recieved from opponent
			if (result>0) myField.setResult(thePoint, result);
			try	{	Thread.sleep(10);	}
			catch	(InterruptedException ie)	{	ie.printStackTrace();	}
		}
	}
}
