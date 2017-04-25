package gsu.jarvis.text;


public class Doors {


	protected void shutDoor() {
		
		Decision.setResponse("Ok, closing door");

	}
	protected void openDoor() {
		
		Decision.setResponse("Of course, Opening door now");
		
	}
	protected void openGarage() {
		
		Decision.setResponse("OK, opening the garage door now");
		
	}
	protected void closeGarage() {
		
		Decision.setResponse("OK, closing the garage door now");
		
	}
	
}

