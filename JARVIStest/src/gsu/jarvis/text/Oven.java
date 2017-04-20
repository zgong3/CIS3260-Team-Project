package gsu.jarvis.text;


public class Oven {
	
	
protected void turnOn() {
		
Decision.setResponse("The oven is on, what temperature do you want to cook?");
		
}

protected void setTemp(int x ) {
	
	Decision.setResponse("OK! heating the oven to " + x + " degrees");
	
}

protected void turnOFF() {
	
	Decision.setResponse("Turning oven off");
	
}

protected void timerSet(int y ) {
	
	if(y > 0) {
		
		Decision.setResponse("Setting timer to " + y + " minutes long");
	
	}
	
	else {
		
		Decision.setResponse("Time must be more than 0");
		
	}
		
}

}
