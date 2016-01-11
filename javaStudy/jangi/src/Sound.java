
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound implements Runnable{
	private AudioClip clip = null;
	private Thread th;
	private boolean isLoop;
	
	public Sound(String file, boolean isLoop) {
		URL audio = getClass().getResource(file);
		clip = Applet.newAudioClip(audio);
		this.isLoop = isLoop;
		th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(!isLoop){
			while(true){
				synchronized(th){
				try {
					th.wait();
				} catch(InterruptedException e){}
				}
				clip.play();
			}
		}
		else
			clip.loop();
	}
	public void wakeup(){
		synchronized(th){
			th.notify();
		}
	}
}
