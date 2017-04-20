package gsu.jarvis.text;

public class Lights {
	
protected void turnLightsOn() {
	
	Decision.setResponse("lights are on! ");
}

protected void turnlightsOff() {
	
	Decision.setResponse("Ok lights are off!");
	
}
	
protected void leaveLightsOnShort() {
	
	Decision.setResponse("Ok, I will leave lights on for 10 minutes ");
	
}
	
protected void leavelightsOnLong() {
	
	Decision.setResponse("Ok, I will leave lights on for 30 minutes ");
	
}


}
