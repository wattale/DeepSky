package nasa.com;


import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivitySuggestions extends Activity {
	static ListView listView;
	StarConstellations strcon = new StarConstellations();
	 ArrayList<String> cons=new ArrayList<String>();
	 ArrayList<CorelationArray> correlaList ;//= new ArrayList<CorelationArray>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.suggestions);
	
	cons.clear();
	ArrayList<CorelationArray> serializableExtra = (ArrayList<CorelationArray>) getIntent().getSerializableExtra("Arraydata");	
	correlaList=serializableExtra;
	
	for(int i=correlaList.size()-1; i>=0; i--)
	{
	
	cons.add(correlaList.get(i).name+"  "+correlaList.get(i).proValue);
	displaySuggestions();
	
	}
	
	}
	
	
	public void displaySuggestions(){
		listView = (ListView) findViewById(R.id.lvSuggestions);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_2, android.R.id.text2, cons);
	    listView.setAdapter(adapter);
	    listView.setOnItemClickListener(new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view,
		int position, long id) {
		displayConstollationImage(position);
			
			 
	    
	   	}
	   	});
	 
	}
	
	public void displayConstollationImage(int position){
		String constellation=listView.getItemAtPosition(position).toString();
		String[] constellationName=constellation.split(" ");
		ImageView image=(ImageView) findViewById(R.id.image);
		if(constellationName[0].equalsIgnoreCase("ANTLIA"))
		{
		image.setImageResource(R.drawable.antlia);
		}
		else if(constellationName[0].equalsIgnoreCase("APUS"))
		{
			image.setImageResource(R.drawable.apus);
		}
		else if(constellationName[0].equalsIgnoreCase("AQUILA"))
		{
			image.setImageResource(R.drawable.aquila);
		}
		else if(constellationName[0].equalsIgnoreCase("ARA"))
		{
			image.setImageResource(R.drawable.ara);
		}
		else if(constellationName[0].equalsIgnoreCase("AURIGA"))
		{
			image.setImageResource(R.drawable.auriga);
		}
		else if(constellationName[0].equalsIgnoreCase("BigDipper"))
		{
			image.setImageResource(R.drawable.bigdipper);
		}
		else if(constellationName[0].equalsIgnoreCase("CAELUM"))
		{
			image.setImageResource(R.drawable.caelum);
		}
		else if(constellationName[0].equalsIgnoreCase("CANCER"))
		{
			image.setImageResource(R.drawable.cancer);
		}
		else if(constellationName[0].equalsIgnoreCase("CHAMALEON"))
		{
			image.setImageResource(R.drawable.chamaeleon);
		}
		else if(constellationName[0].equalsIgnoreCase("COLUMBA"))
		{
			image.setImageResource(R.drawable.columba);
		}
		else if(constellationName[0].equalsIgnoreCase("COMABERENICES"))
		{
			image.setImageResource(R.drawable.coma_berenices);
		}
		else if(constellationName[0].equalsIgnoreCase("CORVUS"))
		{
			image.setImageResource(R.drawable.corvus);
		}
		else if(constellationName[0].equalsIgnoreCase("CRATER"))
		{
			image.setImageResource(R.drawable.crater);
		}
		else if(constellationName[0].equalsIgnoreCase("CRUX"))
		{
			image.setImageResource(R.drawable.crux);
		}
		else if(constellationName[0].equalsIgnoreCase("EQULEUS"))
		{
			image.setImageResource(R.drawable.equuleus);
		}
		else if(constellationName[0].equalsIgnoreCase("FORNAX"))
		{
			image.setImageResource(R.drawable.fornax);
		}
		else if(constellationName[0].equalsIgnoreCase("INDUS"))
		{
			image.setImageResource(R.drawable.indus);
		}
		else if(constellationName[0].equalsIgnoreCase("LEO"))
		{
			image.setImageResource(R.drawable.leo);
		}
		else if(constellationName[0].equalsIgnoreCase("LEPUS"))
		{
			image.setImageResource(R.drawable.lepus);
		}
		else if(constellationName[0].equalsIgnoreCase("LIBRA"))
		{
			image.setImageResource(R.drawable.libra);
		}
		else if(constellationName[0].equalsIgnoreCase("LYNX"))
		{
			image.setImageResource(R.drawable.lynx);
		}
		else if(constellationName[0].equalsIgnoreCase("MENSA"))
		{
			image.setImageResource(R.drawable.mensa);
		}
		else if(constellationName[0].equalsIgnoreCase("OCTANS"))
		{
			image.setImageResource(R.drawable.octans);
		}
		else if(constellationName[0].equalsIgnoreCase("ORION"))
		{
			image.setImageResource(R.drawable.orion);
		}
		else if(constellationName[0].equalsIgnoreCase("PHOENIX"))
		{
			image.setImageResource(R.drawable.phoenix);
		}
		else if(constellationName[0].equalsIgnoreCase("PICTOR"))
		{
			image.setImageResource(R.drawable.pictor);
		}
		else if(constellationName[0].equalsIgnoreCase("PYXIS"))
		{
			image.setImageResource(R.drawable.pyxis);
		}
		else if(constellationName[0].equalsIgnoreCase("RECTICULUM"))
		{
			image.setImageResource(R.drawable.reticulum);
		}
		else if(constellationName[0].equalsIgnoreCase("SEXTANS"))
		{
			image.setImageResource(R.drawable.sextans);
		}
		else if(constellationName[0].equalsIgnoreCase("TELESCOPIUM"))
		{
			image.setImageResource(R.drawable.telescopium);
		}
		else if(constellationName[0].equalsIgnoreCase("TRIANGULUM"))
		{
			image.setImageResource(R.drawable.triangulum);
		}
		else if(constellationName[0].equalsIgnoreCase("VULPECULA"))
		{
			image.setImageResource(R.drawable.vulpecula);
		}
		}
}
