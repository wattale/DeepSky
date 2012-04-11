package nasa.com;

public class Possition implements Comparable<Possition>{
	
	
	private float x;
	private float y;
	
	public Possition(float x, float y){
		
		this.x = x;
		this.y = y;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}

	@Override
	public int compareTo(Possition another) {
		// TODO Auto-generated method stub		
		return  (int)( this.x-another.getX());
	}
	

}
