package gsu.jarvis.text;


public class TV {
	
	protected void turnON() {
		
		Decision.setResponse("OK, the TV is now turned on!");
		
	}
	
	protected void turnOFF() {

		Decision.setResponse("OK, the TV is now turned off!");
	
	}
	
	protected void turnChannelUP() {
		
		Decision.setResponse("OK, turn to the next channel!");
	
	}
	
	protected void turnChannelDown() {
		
		Decision.setResponse("OK, turn back one channel!");
	
	}
	
	protected void turnToChannel(int channel) {
		
		if(channel != -1){
		
			Decision.setResponse("OK, switch to channel " + channel + ".");
		
		}else
		
			Decision.setResponse("This channel does not exist.");	
	
	}
	
	protected void mute() {
		
		Decision.setResponse("OK, the TV is on mute now!");
	
	}
	
	protected void turnVolumeUp() {
		
		Decision.setResponse("The volume has turned up.");
	
	}
	
	protected void turnVolumeDown() {
		
		Decision.setResponse("The volume has turned down.");
	
	}
	
}
