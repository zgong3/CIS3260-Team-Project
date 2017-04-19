package gsu.jarvis.text;

public class Lights {
	
public void turnLightsOn() {
	
	Decision.setResponse("lights are on! ");
}

public void turnlightsOff() {
	
	Decision.setResponse("Ok lights are off!");
	
}
public void leaveLightsOnShort() {
	
	Decision.setResponse("Ok, I will leave lights on for 10 minutes ");
	
}
public void leavelightsOnLong() {
	
	Decision.setResponse("Ok, I will leave lights on for 30 minutes ");
	
}


}
