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
		    
		   
		    /**Door commands**/	 			
		    if((inputwords.contains("doors") || inputwords.contains("door")) && inputwords.contains("open")){
		    	door.openDoor(); 	
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("door")) && (inputwords.contains("close") || inputwords.contains("shut"))){
		    	door.shutDoor();
		    }
		    
		    /**Camera commands**/	 
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("on") || inputwords.contains("open"))){
		    	camera.turnCameraON();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("off") || inputwords.contains("close"))){
		    	camera.turnCameraOFF();
		    }
		    
		    /**lights commands**/	 
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("on")){
		    	light.turnLightsOn();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("off")){
		    	light.turnlightsOff();
		    }
		    
		    /**Toaster commands**/	 
		    else if(inputwords.contains("toaster") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	toaster.toasterON();
		    }
		    else if(inputwords.contains("toaster") && (inputwords.contains("close") || inputwords.contains("off"))){
		    	toaster.toasterOFF();
		    }
		    
		    /**TV commands**/	 
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("on")){
		    	tv.turnON();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("off")){
		    	tv.turnOFF();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("mute")){
		    	tv.mute();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("volume") && inputwords.contains("up") ){
		    	tv.turnVolumeUp();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("volume") && inputwords.contains("down") ){
		    	tv.turnVolumeDown();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && (inputwords.contains("up") || inputwords.contains("next"))){
		    	tv.turnChannelUP();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && (inputwords.contains("down") || inputwords.contains("back"))){
		    	tv.turnChannelDown();
		    }
		    else if((inputwords.contains("tv") || inputwords.contains("television")) && inputwords.contains("channel")){
		    	
		    	for(int ch = 1; ch < 100; ch++){
		    		//Convert channel number to a string because cannot find integer in a string type list
		    		String channel = String.valueOf(ch);
		    		//Find if the input contains a channel number(as string) between 1 and 100 
		    	if(inputwords.contains(channel)){
		    		tv.turnToChannel(ch);
		    		break;
		    	}else
		    		tv.turnToChannel(-1);
		    	
		    	}
		    }else
		    	
		    	setResponse("Sorry, your command is invalid.");
		    
	   
   }



public String getResponse() {
	return RESPONSE;
}



public static void setResponse(String response) {
	Decision.RESPONSE = response;
}

}
