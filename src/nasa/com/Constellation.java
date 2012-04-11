package nasa.com;


import java.util.ArrayList;

public class Constellation {
	
	
	private ArrayList<Possition> possitions;
	private String name;
	
	public Constellation(ArrayList<Possition> possitions,String name){
		
		this.possitions=possitions;
		this.name= name;	
		
	}

	public ArrayList<Possition> getPossitions() {
		return possitions;
	}

	public String getName() {
		return name;
	}
	
	
}
