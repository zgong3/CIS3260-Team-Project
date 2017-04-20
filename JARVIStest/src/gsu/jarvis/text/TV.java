package gsu.jarvis.text;


public class TV {
	
	public void turnON() {
		
		Decision.setResponse("OK, the TV is now turned on!");
		
	}
	
	public void turnOFF() {

		Decision.setResponse("OK, the TV is now turned off!");
	
	}
	
	public void turnChannelUP() {
		
		Decision.setResponse("OK, turn to the next channel!");
	
	}
	
	public void turnChannelDown() {
		
		Decision.setResponse("OK, turn back one channel!");
	
	}
	
	public void turnToChannel(int channel) {
		
		if(channel != -1){
		
			Decision.setResponse("OK, switch to channel " + channel + ".");
		
		}else
		
			Decision.setResponse("This channel does not exist.");	
	
	}
	
	public void mute() {
		
		Decision.setResponse("OK, the TV is on mute now!");
	
	}
	
	public void turnVolumeUp() {
		
		Decision.setResponse("The volume has turned up.");
	
	}
	
	public void turnVolumeDown() {
		
		Decision.setResponse("The volume has turned down.");
	
	}
	
}
