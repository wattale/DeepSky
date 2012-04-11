package nasa.com;

import java.util.ArrayList;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.RelativeLayout;



public class NASAActivity extends Activity {
	 //private DrawActivity draw; 
	 ArrayList<Possition> xyCoordinate=new ArrayList<Possition>();
    Panel drawview; 
    FrameLayout Frame; 
    RelativeLayout relative ;
    StarConstellations strcon = new StarConstellations();

@Override 
public void onCreate(Bundle savedInstanceState) { 
	 final Context context = getApplicationContext(); 
       super.onCreate(savedInstanceState); 
       relative = new RelativeLayout(this); 
       RelativeLayout.LayoutParams answerAlign = new 
       RelativeLayout.LayoutParams( 
                       RelativeLayout.LayoutParams.WRAP_CONTENT, 
                       RelativeLayout.LayoutParams.WRAP_CONTENT); 
       RelativeLayout.LayoutParams clearAlign = new 
    	       RelativeLayout.LayoutParams( 
    	                       RelativeLayout.LayoutParams.WRAP_CONTENT, 
    	                       RelativeLayout.LayoutParams.WRAP_CONTENT); 
       RelativeLayout.LayoutParams suggestionsAlign = new 
    	       RelativeLayout.LayoutParams( 
    	                       RelativeLayout.LayoutParams.WRAP_CONTENT, 
    	                       RelativeLayout.LayoutParams.WRAP_CONTENT); 
       final Button answer = new Button(this); 
       answer.setText("Find"); 
       answerAlign.addRule(android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM); 
       relative.addView(answer, answerAlign); 
       answer.setOnClickListener(new OnClickListener() { 
               @Override 
               public void onClick(View v) { 
            	  // relative.addView(new Panel(this)); 
                   //setContentView(relative);  

       			try{
       			 
          	   String output = strcon.calculate(xyCoordinate);           	   
          	   Toast.makeText(NASAActivity.this,output, Toast.LENGTH_LONG).show();
       				}
       			catch(Exception e){
       				showDialog();
       			}
            	  
            	   
               } 
       }); 
       final Button clear=new Button(this);
       clear.setText("Clear");
       clearAlign.addRule(android.widget.RelativeLayout.ALIGN_PARENT_RIGHT);
       relative.addView(clear,clearAlign);
       clear.setOnClickListener(new OnClickListener() { 
           @Override 
           public void onClick(View v) {
        	   
        	   xyCoordinate.clear();
           	   relative.addView(new Panel(NASAActivity.this,xyCoordinate));
           	   strcon.clearCorelation();         	
           	   show();
        	   
           } 
   }); 
       final Button suggestions=new Button(this);
       suggestions.setText("Suggestions");
       suggestionsAlign.addRule(android.widget.RelativeLayout.ALIGN_LEFT);
       relative.addView(suggestions,suggestionsAlign);
       suggestions.setOnClickListener(new OnClickListener() { 
           @Override 
           public void onClick(View v) {
        	//String[] a=new String[1];
        	//ArrayList<String> m=strcon.test();
        	
        	
        	Intent intent=new Intent("nasa.com.ACTIVITYSUGGESTIONS");
        	//intent.putExtra("a", a);
        	//intent.putExtra("size", "5");
        	intent.putExtra("Arraydata", strcon.getCorrelaList());
        	startActivity(intent);
        	   
           } 
   }); 
       setContentView(relative);  
       //relative.addView(new Panel(this)); 
              
} 
private void show() {
	 setContentView(relative);  
	
}
public boolean onTouchEvent(MotionEvent event) {
    int eventaction = event.getAction();


    switch (eventaction) {
        case MotionEvent.ACTION_DOWN: 
        	
       	 float x=(float) event.getX();
       	 float y=(float) event.getY();
       	Possition tempCoordinate=new Possition(x,y);
       	 xyCoordinate.add(tempCoordinate);
        	//p=new Panel(this, xyCoordinate);
        	//Frame.addView(p);
           //setContentView(new Panel(this,xyCoordinate));//send to draw 
        	//Toast.makeText(this, "Amila", Toast.LENGTH_SHORT).show();
        	relative.addView(new Panel(this,xyCoordinate));
        	show();
            break;
            
        case MotionEvent.ACTION_MOVE:
            // finger moves on the screen
        	
            break;

        case MotionEvent.ACTION_UP:   
        	//finger moves up
      
            break;
           
    }
 
    // tell the system that we handled the event and no further processing is required
    return true; 
}

public void showDialog(){
	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	builder.setMessage("Thre is no such pattern. Try again!")
	.setCancelable(false)
	.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	public void onClick(DialogInterface dialog, int id) {
	xyCoordinate.clear();
    relative.addView(new Panel(NASAActivity.this,xyCoordinate));
    show();	
	dialog.cancel();
	}
	});
	AlertDialog alert = builder.create();
	alert.show();
	}
}