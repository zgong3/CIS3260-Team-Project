package gsu.jarvis.text;


public class Oven {
	
	
	protected void turnOn() {
		
	Decision.setResponse("The oven is on.\nwhat temperature do you want to cook?");
		
}

	protected void setTemp(int x ) {
		
		if(x != -1){
	
	Decision.setResponse("OK! heating the oven to " + x + " degrees.\nPlease enter cooking time in minutes。");
	
		}
		else
			Decision.setResponse("Sorry, this temperature is invalid.");
}

	protected void turnOFF() {
	
	Decision.setResponse("Turning oven off");
	
}

	protected void timerSet(int y ) {
	
	if(y != -1) {
		
		Decision.setResponse("Setting timer to " + y + " minutes long");
	
	}
	
	else {
		
		Decision.setResponse("Sorry, this numer is invalid");
		
	}
		
}

}
