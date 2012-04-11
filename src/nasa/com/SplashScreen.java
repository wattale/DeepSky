package nasa.com;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen extends Activity {
	
	MediaPlayer song;
	protected int _splashTime = 5000; 
	
	private Thread splashTread;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.splash);
	    
	    song = MediaPlayer.create(SplashScreen.this, R.raw.track);
	    song.start();
	    final SplashScreen sPlashScreen = this; 
	    
	    // thread for displaying the SplashScreen
	    splashTread = new Thread() {
	        @Override
	        public void run() {
	            try {	            	
	            	synchronized(this){
	            		wait(_splashTime);
	            	}
	            	
	            } catch(InterruptedException e) {} 
	            finally {
	                finish();
	                
	                Intent i = new Intent();
	                i.setClass(sPlashScreen, NASAActivity.class);
	        		startActivity(i);
	                
	               //stop();
	            }
	        }
	    };
	    
	    splashTread.start();
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
	    if (event.getAction() == MotionEvent.ACTION_DOWN) {
	    	synchronized(splashTread){
	    		splashTread.notifyAll();
	    	}
	    }
	    return true;
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		song.release();
		super.onPause();
		finish();
	}
	
}
