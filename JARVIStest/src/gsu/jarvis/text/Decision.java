package gsu.jarvis.text;


import java.util.ArrayList;
import java.util.Arrays;

import opennlp.tools.tokenize.SimpleTokenizer;  

public class Decision { 

	private String input;
	private static String RESPONSE;
	
	Greeting greet = new Greeting();
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
	
   private void detector() { 

 
			//Create tokenizer
			SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;  
		       
		    //Tokenizing the given sentence then put in arraylist
		    ArrayList<String> inputwords = new ArrayList<String>(Arrays.asList(simpleTokenizer.tokenize(input)));
		    
		    /**greeting commands**/
		   if(inputwords.contains("how") && inputwords.contains("are") && inputwords.contains("you")){
		    	greet.howAreYou();
		    }
		    else if(inputwords.contains("hi")){
		    	greet.hi();	
		    }
		    else if(inputwords.contains("your") && inputwords.contains("name")){
		    	greet.whatsYourName();	
		    }
		    else if(inputwords.contains("time") && (inputwords.contains("now") || inputwords.contains("current"))){
		    	greet.nowTime();
		    }
		    else if(inputwords.contains("date") && (inputwords.contains("today") || inputwords.contains("today's"))){
		    	greet.nowDate();;
		    }
		    
		   
		    /**Door commands**/	 			
		    else if((inputwords.contains("doors") || inputwords.contains("door")) && inputwords.contains("open")){
		    	door.openDoor(); 	
		    }
		    else if((inputwords.contains("doors") || inputwords.contains("door")) && (inputwords.contains("close") || inputwords.contains("shut"))){
		    	door.shutDoor();
		    }
		    else if((inputwords.contains("garage door") || inputwords.contains("garage")) && inputwords.contains("close")){
		    	door.closeGarage();
		    }
		    else if((inputwords.contains("garage door") || inputwords.contains("garage")) && inputwords.contains("open")){
		    	door.openGarage();
		    }
		    
		    /**Spotify commands**/
		    else if(inputwords.contains("spotify") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	spot.turnOn();
		    }
		    else if(inputwords.contains("spotify") && (inputwords.contains("close") || inputwords.contains("off"))){
		    	spot.turnOff();
		    }
		    else if(inputwords.contains("spotify") && (inputwords.contains("play") || inputwords.contains("song"))){
		    	spot.playSong();
		    }
		    
		    
		    /**Camera commands**/	 
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("on") || inputwords.contains("open"))){
		    	camera.turnCameraON();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("off") || inputwords.contains("close"))){
		    	camera.turnCameraOFF();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("zoom") && inputwords.contains("in"))){
		    	camera.zoomIn();
		    }
		    else if((inputwords.contains("camera") || inputwords.contains("cameras")) && (inputwords.contains("zoom") && inputwords.contains("out"))){
		    	camera.zoomOut();
		    }
		    
		    /**lights commands**/	 
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("on")){
		    	light.turnLightsOn();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("off")){
		    	light.turnlightsOff();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && inputwords.contains("dim")){
		    	light.dimLights();
		    }
		    else if((inputwords.contains("light") || inputwords.contains("lights")) && (inputwords.contains("bright") || inputwords.contains("brighter"))){
		    	light.brightenLights();
		    }
		    
		    /**Toaster commands**/	 
		    else if(inputwords.contains("toaster") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	toaster.toasterON();
		    }
		    else if(inputwords.contains("toaster") && (inputwords.contains("close") || inputwords.contains("off"))){
		    	toaster.toasterOFF();
		    }
		    
		    /**Speaker commands**/
		    else if(inputwords.contains("speaker") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	speaker.turnSpeakerOn();
		    }
		    else if(inputwords.contains("speaker") && (inputwords.contains("close") || inputwords.contains("off"))){
		    	speaker.turnSpeakeroff();
		    }
		    else if(inputwords.contains("speaker") && inputwords.contains("volume") && inputwords.contains("low")){
		    	speaker.speakerVolumeLow();
		    }
		    else if(inputwords.contains("speaker") && inputwords.contains("volume") && (inputwords.contains("medium") || inputwords.contains("med"))){
		    	speaker.speakerVolumeMed();
		    }
		    else if(inputwords.contains("speaker") && inputwords.contains("volume") && (inputwords.contains("high") || inputwords.contains("maximum") || inputwords.contains("max"))){
		    	speaker.speakerVolumeHigh();
		    }
		    
		    /**Oven commands**/
		    else if(inputwords.contains("oven") && (inputwords.contains("open") || inputwords.contains("on"))){
		    	oven.turnOn();
		    } 
		    else if(inputwords.contains("oven") && (inputwords.contains("close") || inputwords.contains("off"))){
		    	oven.turnOFF();
		    } 
		    else if(inputwords.contains("oven") || inputwords.contains("temperature") || inputwords.contains("degrees")){
		    	
		    	for(int i = 200; i <= 500; i++){
		    		
		    		//Convert temp number to a string because cannot find integer in a string type list
		    		String temp = String.valueOf(i);
		    		
		    		//Find if the input contains a number(as string) for temperature between 200 and 500 F 
		    	if(inputwords.contains(temp)){
		    		
		    		oven.setTemp(i);
		    		
		    		break;
		    		
		    	}else
		    		
		    		oven.setTemp(-1);
		    	
		    	}
		    }
		    else if(inputwords.contains("oven") || inputwords.contains("time") || inputwords.contains("minutes")){
		    	
		    	for(int i = 1; i <= 300; i++){
		    		
		    		//Convert minute number to a string because cannot find integer in a string type list
		    		String minutes = String.valueOf(i);
		    		
		    		//Find if the input contains a number(as string) between 1 and 300 
		    	if(inputwords.contains(minutes)){
		    		
		    		oven.timerSet(i);;
		    		
		    		break;
		    		
		    	}else
		    		
		    		oven.timerSet(i);
		    	
		    	}
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
		    	
		    }
		    
		    else
		    	
		    	setResponse("Sorry, your command is invalid.");
		    
   }

public String getResponse() {
	return RESPONSE;
}

protected static void setResponse(String response) {
	Decision.RESPONSE = response;
}

}
