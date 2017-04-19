package gsu.jarvis.text;


public class Oven {

public void preHeat(int x ) {
	
	Decision.setResponse("OK! Preheating oven to " + x);
	
}

public void turnOFF() {
	
	Decision.setResponse("Turning oven off");
	
}

public void timerSet(int y ) {
	
	if(y > 0) {
		
		Decision.setResponse("Setting timer to " + y + " minutes long");
	
	}
	
	else {
		
		Decision.setResponse("Time must be more than 0");
		
	}
		
}

}
