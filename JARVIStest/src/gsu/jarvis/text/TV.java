package gsu.jarvis.text;


public class TV {
	
	public void turnON() {
		Decision.setResponse("OK, the TV is now turned on");
		}
	public void turnOFF() {
		Decision.setResponse("OK, the TV is now turned off");
	}
	public void turnChannelUP(int channel) {

	}
	public void turnChannelDown(int channel) {
	
	}
	public void mute() {
		Decision.setResponse("OK, the TV is on mute now");
	}
	public void turnVolumeUp() {
		Decision.setResponse("The volume is turned up");
	}
	public void turnVolumeDown() {
		Decision.setResponse("The volume is turned down");
	}
	
}
