package gsu.jarvis.text;


public class Cameras {

	public void turnCameraON() {
		
		Decision.setResponse("Ok! cameras are now turned on");
		
	}
	
	public void turnCameraOFF() {
		
		Decision.setResponse("Cameras are now turned off");
		
	}
	
	public void zoomIn() {
		
		Decision.setResponse("The camera is zoomed in");
	}
	
	public void zoomOut() {
		
		Decision.setResponse("The camera is zoomed out");
		
	}
}
