package gsu.jarvis.main;

import gsu.jarvis.ui.MainWindow;
import gsu.jarvis.ui.TextPanel;
import gsu.jarvis.ui.VoicePanel;

/**
 * @author Zhanpeng Gong
 *	Main method class
 */
public class mainMethod {
	
	/**Main method to start application**/
	public static void main(String[] args) {
		
		//Create text panel
		TextPanel panelText = new TextPanel();
		
		//Create voice panel
		VoicePanel panelVoice = new VoicePanel();
		
		//Start main window
		new MainWindow(panelText, panelVoice);
		
		
	}
}
