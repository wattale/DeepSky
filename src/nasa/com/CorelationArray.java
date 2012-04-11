package nasa.com;

import java.io.Serializable;

public class CorelationArray implements Comparable<CorelationArray>,Serializable{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	String name;
	float proValue;
	
	public CorelationArray(String name, float proValue) {
		super();
		this.name = name;
		this.proValue = proValue;
	}
	public String getName() {
		return name;
	}
	
	public float getProValue() {
		return proValue;
	}
	@Override
	public int compareTo(CorelationArray another) {
		// TODO Auto-generated method stub
		return (int)(this.proValue*100000000-another.getProValue()*100000000);
	}
	
	
}
