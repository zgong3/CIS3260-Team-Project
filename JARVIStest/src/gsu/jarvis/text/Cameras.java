package gsu.jarvis.text;


public class Cameras {

	protected void turnCameraON() {
		
		Decision.setResponse("Ok! cameras are now turned on");
		
	}
	
	protected void turnCameraOFF() {
		
		Decision.setResponse("Cameras are now turned off");
		
	}
	
	protected void zoomIn() {
		
		Decision.setResponse("The camera is zoomed in");
	}
	
	protected void zoomOut() {
		
		Decision.setResponse("The camera is zoomed out");
		
	}
}
