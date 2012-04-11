package nasa.com;


import java.util.ArrayList;
import java.util.Collections;


public class StarConstellations  {
	
	
	ArrayList<Constellation> storedConstallations = new ArrayList<Constellation>();
	
	ArrayList<Float> correlation = new ArrayList<Float>();
	
	private  ArrayList<CorelationArray> correlaList = new ArrayList<CorelationArray>();
	
public StarConstellations(){
	
		//correlaList.remove(0);
		ArrayList<Possition> Antlia = new ArrayList<Possition>();		
		Antlia.add(new Possition(36.075f, -378.46f));
		Antlia.add(new Possition(182.38f, -256.32f));
		Antlia.add(new Possition(408.85f, -227.28f));
		Antlia.add(new Possition(441.92f, -445.55f));		
		storedConstallations.add(new Constellation(Antlia, "Antlia"));
		
		ArrayList<Possition> Apus = new ArrayList<Possition>();		
		Apus.add(new Possition(25.052f, -273.34f));
		Apus.add(new Possition(120.25f, -441.51f));
		Apus.add(new Possition(179.37f, -349.43f));
		Apus.add(new Possition(433.9f, -485.6f));
		storedConstallations.add(new Constellation(Apus, "Apus"));
		
		ArrayList<Possition> Aquila = new ArrayList<Possition>();		
		Aquila.add(new Possition(49.10f, -353.44f));
		Aquila.add(new Possition(77.16f, -205.25f));
		Aquila.add(new Possition(163.34f, -429.53f));
		Aquila.add(new Possition(203.42f, -297.37f));
		Aquila.add(new Possition(374.78f, -560.70f));
		Aquila.add(new Possition(381.79f, -226.28f));
		Aquila.add(new Possition(386.8f, -130.16f));		
		storedConstallations.add(new Constellation(Aquila, "Aquila"));
		
		ArrayList<Possition> Caelun = new ArrayList<Possition>();
		Caelun.add(new Possition(56.116913f, -192.2403f));
		Caelun.add(new Possition(263.54907f, -269.33667f));
		Caelun.add(new Possition(316.65973f, -491.61453f));
		Caelun.add(new Possition(439.9165f, -598.7485f));
		storedConstallations.add(new Constellation(Caelun, "Caelum"));
		
		ArrayList<Possition> Triangulum = new ArrayList<Possition>();		
		Triangulum.add(new Possition(81.16f, -336.42f));
		Triangulum.add(new Possition(211.49f, -263.32f));
		Triangulum.add(new Possition(394.82f, -582.72f));			
		storedConstallations.add(new Constellation(Triangulum, "Triangulum"));
		
		ArrayList<Possition> Pictor = new ArrayList<Possition>();		
		Pictor.add(new Possition(123.25f, -544.68f));
		Pictor.add(new Possition(318.66f, -346.43f));
		Pictor.add(new Possition(359.74f, -141.17f));		
		storedConstallations.add(new Constellation(Pictor, "Pictor"));
		
		ArrayList<Possition> Phoenix = new ArrayList<Possition>();		
		Phoenix.add(new Possition(74.15f, -375.39f));
		Phoenix.add(new Possition(108.21f, -536.67f));
		Phoenix.add(new Possition(260.54f, -386.48f));
		Phoenix.add(new Possition(462.96f, -204.25f));		
		storedConstallations.add(new Constellation(Pictor, "Phonix"));
		
		ArrayList<Possition> Vulpecula = new ArrayList<Possition>();		
		Vulpecula.add(new Possition(51.10f, -352.44f));
		Vulpecula.add(new Possition(190.39f, -390.48f));
		Vulpecula.add(new Possition(242.56f, -582.72f));
		Vulpecula.add(new Possition(368.76f, -508.63f));
		Vulpecula.add(new Possition(463.96f, -644.80f));		
		storedConstallations.add(new Constellation(Vulpecula, "Vulpecula"));
		
		ArrayList<Possition> Columba = new ArrayList<Possition>();
		Columba.add(new Possition(14.029228f,-329.41177f ));
		Columba.add(new Possition(216.45094f,-470.58826f ));
		Columba.add(new Possition(267.55743f,-508.6358f));
		Columba.add(new Possition(371.77454f,-391.48938f));
		Columba.add(new Possition(438.91443f,-465.58197f));
		storedConstallations.add(new Constellation(Columba, "Columba"));
		
		ArrayList<Possition> ComaBerenices = new ArrayList<Possition>();
		ComaBerenices.add(new Possition(49.1023f,-645.80725f));
		ComaBerenices.add(new Possition(111.231735f,-285.3567f));
		ComaBerenices.add(new Possition(454.9478f,-308.3855f));
		storedConstallations.add(new Constellation(ComaBerenices, "ComaBerenices"));
		
		ArrayList<Possition> Corvus = new ArrayList<Possition>();
		Corvus.add(new Possition(60.125263f, -409.5119f));
		Corvus.add(new Possition(175.36536f, -684.8561f));
		Corvus.add(new Possition(224.46765f, -203.25407f));
		Corvus.add(new Possition(264.55115f, -596.7459f));
		Corvus.add(new Possition(272.56787f, -248.3104f));
		Corvus.add(new Possition(408.85178f, -342.42804f));
		storedConstallations.add(new Constellation(Corvus, "Corvus"));
		
					
		ArrayList<Possition> Orion = new ArrayList<Possition>();		
		Orion.add(new Possition(17.035492f,-196.24532f));		
		Orion.add(new Possition(77.16075f,-643.80475f));
		Orion.add(new Possition(144.30063f,-441.55194f));
		Orion.add(new Possition(210.43842f,-416.52066f));
		Orion.add(new Possition(272.56787f,-395.4944f));
		Orion.add(new Possition(339.70773f,-262.3279f));
		Orion.add(new Possition(436.91025f,-695.8699f));
		storedConstallations.add(new Constellation(Orion, "Orion"));
					
		
		/*ArrayList<Possition> cassiopeia = new ArrayList<Possition>();
		cassiopeia.add(new Possition(1f, 3.8f));
		cassiopeia.add(new Possition(3.7f, 4.5f));
		cassiopeia.add(new Possition(4f, 2.8f));
		cassiopeia.add(new Possition(4.5f, 1.8f));
		cassiopeia.add(new Possition(4.8f, 2.4f));
		cassiopeia.add(new Possition(4.83f, 1.5f));
		storedConstallations.add(new Constellation(cassiopeia, "Cassiopea"));*/
		
		ArrayList<Possition> Crux = new ArrayList<Possition>();
		Crux.add(new Possition(84.17537f, -175.21902f));
		Crux.add(new Possition(107.22339f, -366.45807f));
		Crux.add(new Possition(206.43007f, -559.69965f));
		Crux.add(new Possition(271.56577f, -197.24657f));
		Crux.add(new Possition(407.8497f, -315.39426f));
		storedConstallations.add(new Constellation(Crux, "Crux"));
		

		
		ArrayList<Possition> cancer = new ArrayList<Possition>();
		cancer.add(new Possition(121.25262f, -609.7622f));
		cancer.add(new Possition(221.46138f, -113.141426f));
		cancer.add(new Possition(267.55743f, -455.56946f));
		cancer.add(new Possition(289.60336f, -333.41678f));
		cancer.add(new Possition(455.94992f, -703.8799f));
		storedConstallations.add(new Constellation(cancer, "Cancer"));
		
		/*ArrayList<Possition> cygnus = new ArrayList<Possition>();
		cygnus.add(new Possition(1f, 5f));
		cygnus.add(new Possition(2.4f, 5.6f));
		cygnus.add(new Possition(2.65f, 8f));
		cygnus.add(new Possition(3f, 3f));
		cygnus.add(new Possition(3.2f, 1.2f));
		cygnus.add(new Possition(4.4f, 6.15f));
		storedConstallations.add(new Constellation(cygnus, "Cygnus"));*/
		
		ArrayList<Possition> procyom = new ArrayList<Possition>();
		procyom.add(new Possition(0.5f, 1f));
		procyom.add(new Possition(3.5f, 3.5f));
		storedConstallations.add(new Constellation(procyom, "Procyom"));
		
		ArrayList<Possition> bigDipper = new ArrayList<Possition>();
		bigDipper.add(new Possition(19.039667f,-508.6358f));
		bigDipper.add(new Possition(97.20251f,-449.56195f));
		bigDipper.add(new Possition(174.36327f,-446.5582f));
		bigDipper.add(new Possition(270.5637f,-429.53693f));
		bigDipper.add(new Possition(340.7098f,-508.6358f));
		bigDipper.add(new Possition(392.8184f,-317.39676f));
		bigDipper.add(new Possition(439.9165f,-425.53192f));
		storedConstallations.add(new Constellation(bigDipper, "BigDipper"));
		
		
			
		
	}


	public ArrayList<Constellation> getSameSize(int size){ // return the game size constallation
		
		ArrayList<Constellation> toReturn = new ArrayList<Constellation>();
		
		
		
		for(int i=0;i<storedConstallations.size();i++){
			
			if(size==storedConstallations.get(i).getPossitions().size()){
				toReturn.add(storedConstallations.get(i));
			}
			
		}
		
		return toReturn;		
	}
	

	public String calculate(ArrayList<Possition> input){     // calculation part

		correlation=new ArrayList<Float>();
		ArrayList<Constellation> data = getSameSize(input.size());   // get the same size constallation 
		ArrayList<Possition> tempo = input;							// with out sort
		ArrayList<Possition> gotcha= new ArrayList<Possition>();
		
		
		for(int l=0;l<tempo.size();l++){
			
			gotcha.add(new Possition(tempo.get(l).getX(), -tempo.get(l).getY()));
			
			
		}
		
		
		Collections.sort(gotcha);     // after sorting the constallation,
		
		for(int k=0;k<gotcha.size();k++){
			
			
			System.out.println("the list "+gotcha.get(k).getX()+" "+gotcha.get(k).getY());
			
		}
		
		
		ArrayList<Float> convertedRespectToONE = getRatioDataIndexZ(gotcha,0);   // get the constallation with ratio relative to one
		ArrayList<Float> convertedRespectToTWO = getRatioDataIndexZ(gotcha, 1);  // get the constallation witn ratio relative to two
		for(int i=0;i<data.size();i++){
			
			float corrRespectToOne =0;
			float corrRespectToTwo =0;
			ArrayList<Possition> ref = data.get(i).getPossitions();  //get the possition array list of the stored data.
			ArrayList<Float> convtdCons = getRatioDataIndexZ(ref,0); //ratio of the constalation stored. (relative to first)
			
			System.out.println("Adding up correlation values");
			
				
				float sqrt = (float) Math.sqrt((convtdCons.size()*zigmaX2(convertedRespectToONE)-Math.pow(zigmaX(convertedRespectToONE),2))*(convtdCons.size()*zigmaX2(convtdCons)-Math.pow(zigmaX(convtdCons),2)));         
				corrRespectToOne= (convtdCons.size()*zigmaXY(convertedRespectToONE,convtdCons)-zigmaX(convertedRespectToONE)*zigmaX(convtdCons))/sqrt;
				
						
				//Removing the first element of ArrayLists and using it to calculate the correlation coefficient
			
				ArrayList<Float> convertedRespectToTWOR = removeObjectAt(convertedRespectToTWO, 0);
				ArrayList<Float> convtdConsR = removeObjectAt(convtdCons, 0);
				int size = convtdConsR.size();
			
								
				float sqrt2 = (float) Math.sqrt((size*zigmaX2(convertedRespectToTWOR)-Math.pow(zigmaX(convertedRespectToTWOR),2))*(size*zigmaX2(convtdConsR)-Math.pow(zigmaX(convtdConsR),2)));         
				corrRespectToTwo= (size*zigmaXY(convertedRespectToTWOR,convtdConsR)-zigmaX(convertedRespectToTWOR)*zigmaX(convtdConsR))/sqrt2;
				
				System.out.println(data.get(i).getName()+" corr value ROne: "+corrRespectToOne);
				System.out.println(data.get(i).getName()+" corr value RTwo: "+corrRespectToTwo);
				
		
			
			if (corrRespectToOne>corrRespectToTwo){			
				// adding to the corelation arry 
				System.out.println("correlation value: "+corrRespectToOne);
				correlation.add(corrRespectToOne);
				
			}else{
				correlation.add(corrRespectToTwo);
				System.out.println("CorrRspcetToTo added");
			}
			
						
		}
		
		float max =Collections.max(correlation);
		int index = correlation.indexOf(max);
		
		String result = data.get(index).getName();
		
		//correlaList=null;
		
		for (int i = 0; i < data.size(); i++) {
			
			correlaList.add(new CorelationArray(data.get(i).getName(), correlation.get(i)));
		}
		
		Collections.sort(correlaList);
		
		for (int i = 0; i < data.size(); i++) {
			
			System.out.println("After sorting"+correlaList.get(i).name+"     "+correlaList.get(i).getProValue());
		}
		
		
		return result+" "+max;
		
		
		
	}
	
	
	
	public ArrayList<CorelationArray> getCorrelaList() {
		return correlaList;
	}
	
	
	public void clearCorelation(){
		correlaList = new ArrayList<CorelationArray>();
	}
	public ArrayList<String> test(){
		ArrayList<String> a=new ArrayList<String>();
		
		for (int i = 0; i < getCorrelaList().size(); i++) {
		
		a.add(correlaList.get(i).name+"   "+correlaList.get(i).proValue);

		}
		return a;
	}



	float zigmaXY(ArrayList<Float> input1, ArrayList<Float> input2){
		float toReturn = 0F;
		if(input1.size()==input2.size()){
			
			for(int i=0;i<input1.size();i++){
				
				toReturn+=input1.get(i)*input2.get(i);
				
			}
			
		}
		
		System.out.println(" zigmaXY "+toReturn );
		return toReturn;
	}
	
	ArrayList<Float> removeObjectAt(ArrayList<Float> input,int index){
		
		ArrayList<Float> toReturn = new ArrayList<Float>();
		ArrayList<Float> array =input;
		for(int i=0;i<array.size();i++){
			
			if(i==index){
				continue;
			}else{
				toReturn.add(array.get(i));
			}
			
		}
		
		return toReturn;		
	}
	
	float zigmaX(ArrayList<Float> inputs){
		float toReturn =0F;
		ArrayList<Float> input =inputs;
		for(int i=0;i<input.size();i++){
			
			toReturn+=input.get(i);
			
		}
		System.out.println(" zigmaX "+toReturn );	
		return toReturn;
	}
	
	float zigmaX2(ArrayList<Float> inputs){
		float toReturn =0F;
		ArrayList<Float> input =inputs;
		for(int i=0;i<input.size();i++){
			toReturn+=Math.pow(input.get(i),2);			
		}
		System.out.println(" zigmaX2 "+toReturn );
		return toReturn;
	}
	
	

	
	public ArrayList<Float> getRatioDataIndexZ(ArrayList<Possition> input, int index){  // return the ration of the constallation
		System.out.println("Ration Values");
		
		ArrayList<Float> toReturn = new ArrayList<Float>();
		ArrayList<Possition> data = input;
		Possition ref = data.get(index);
		
		for(int i=0;i<data.size();i++){
			if(index==i){
				continue;
			}else{
				float x = data.get(i).getX() - ref.getX();
				float y = data.get(i).getY() - ref.getY();
				System.out.println(y/x);
				toReturn.add(y/x);
			}
			
		}
		
		return toReturn;
	}
	

}
