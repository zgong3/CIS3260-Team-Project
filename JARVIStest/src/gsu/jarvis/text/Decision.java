package gsu.jarvis.text;


import java.util.ArrayList;
import java.util.Arrays;

import opennlp.tools.tokenize.SimpleTokenizer;  

public class Decision { 

	private String input;
	private static String RESPONSE;
	
	Cameras camera = new Cameras();
	Doors door = new Doors();
	Lights light = new Lights();
	Oven oven = new Oven();
	Speaker speaker = new Speaker();
	Spotify spot = new Spotify();
	Toaster toaster = new Toaster();
	TV tv = new TV();
	
	public Decision(String input) { 
		
		this.input = input;
		detector();
	}
	
	
	
   public void detector() { 

 
			//Create tokenizer
			SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;  
		       
		      //Tokenizing the given sentence then put in arraylist
		    ArrayList<String> inputwords = new ArrayList<String>(Arrays.asList(simpleTokenizer.tokenize(input)));
		    	 			
		    if((inputwords.contains("doors") || inputwords.contains("door")) && inputwords.contains("open")){
		    	door.openDoor(); 	
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("door")) && (inputwords.contains("close") || inputwords.contains("shut"))){
		    	door.shutDoor();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("on") || inputwords.contains("open"))){
		    	camera.turnCameraON();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("off") || inputwords.contains("close"))){
		    	camera.turnCameraOFF();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("on")){
		    	light.turnLightsOn();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("off")){
		    	light.turnlightsOff();
		    }
		    else if(inputwords.contains("toaster") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	toaster.toasterON();
		    }
		    else if(inputwords.contains("toaster")  && (inputwords.contains("close") || inputwords.contains("off"))){
		    	toaster.toasterOFF();
		    
		    }
		    
	   
   }



public String getResponse() {
	return RESPONSE;
}



public static void setResponse(String response) {
	Decision.RESPONSE = response;
}

}
