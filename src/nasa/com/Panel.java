package nasa.com;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.AvoidXfermode.Mode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class Panel extends View {
	static float x,y;
	private final int r = 5;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    ArrayList<Possition> xyCoordinates;
   static Canvas c;

	 public Panel(Context context,ArrayList<Possition> xy) {
         super(context);
         setFocusable(true);
         setFocusableInTouchMode(true);
         mPaint.setColor(Color.WHITE);
         xyCoordinates=xy;
         
     }

   public Panel(Context c){
	   super(c);
   }
	@Override
     public void onDraw(Canvas canvas) {
        
    	 super.onDraw(canvas);
    	c=canvas;
    	 for(int i=0; i<xyCoordinates.size(); i++)
         {
    	 canvas.drawCircle(xyCoordinates.get(i).getX(), xyCoordinates.get(i).getY()-70, r, mPaint);
    	//String x=""+ coordinates.get(i);
    	//Toast.makeText(this, x, Toast.LENGTH_SHORT).show();
         }
         
        }
	
	public void clear(){
		//super(canvas);
		//Toast.makeText(this, "Try", Toast.LENGTH_SHORT).show();
		c.drawColor(Color.WHITE);
		
	}
}
