package gsu.jarvis.main;

import gsu.jarvis.ui.MainWindow;
import gsu.jarvis.ui.TextPanel;
import gsu.jarvis.ui.VoicePanel;

public class mainMethod {
	
	/**Main method to start application**/
	public static void main(String[] args) {
		
	
		TextPanel panelText = new TextPanel();
		
		VoicePanel panelVoice = new VoicePanel();
		
		
		new MainWindow(panelText, panelVoice);
		
		
	}
}
