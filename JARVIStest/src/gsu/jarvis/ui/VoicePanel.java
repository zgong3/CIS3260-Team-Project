package gsu.jarvis.ui;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port;

import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import edu.cmu.sphinx.api.Configuration;
import gsu.jarvis.speech.Decision;
import javax.swing.JScrollPane;

/**
 * @author Zhanpeng Gong
 *	Voice Panel class includes speech recognition
 */

public class VoicePanel extends JPanel {

	private final JLabel Status = new JLabel("Status: OFF");
	private final JButton Start = new JButton("Start");
	private final JButton Stop = new JButton("Stop");
	private final JTextArea response = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();
	
	//Initialize thread and create a boolean variable as switcher 
	private Thread	speechThread;
	private volatile boolean threadOn = true;
	private int firstclick = 0;
	
	public VoicePanel() {
		
		
		setLayout(null);
		setBackground(new Color(248, 248, 255));
		//Config start button
		Start.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		Start.setBounds(30, 50, 100, 30);
		add(Start);

		
		//Config Stop button
		Stop.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		Stop.setBounds(160, 50, 100, 30);
		add(Stop);
		
		//Config textarea for response and add scroll
		scrollPane.setBounds(30, 100, 230, 180);
		add(scrollPane);
		scrollPane.setViewportView(response);
		response.setLineWrap(true);
		response.setWrapStyleWord(true);
		
		//Config status label
		Status.setFont(new Font("Arial", Font.BOLD, 20));
		Status.setBounds(90, 10, 150, 30);
		add(Status);
		
		//Initialize the action listeners 
		StartAction start = new StartAction();
		StopAction stop = new StopAction();	
		Start.addActionListener(start);
		Stop.addActionListener(stop);
		
		
		
		}
		
		
		
		
	
	
	/**Action method for start button
	start speech recognizer when pressed **/
	
	private class StartAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			if(firstclick == 0){
			
			firstclick++;
			speechRecognizer();
			
			//Check if the microphone is avaliable 
			if (AudioSystem.isLineSupported(Port.Info.MICROPHONE)){
				response.setText("Microphone is avaliable.");
				Status.setText("Status: ON");
				response.append("\n You can start to speak:");
			
			// Start the thread
			speechThread.start();

			
			}else
				response.setText("Microphone is not avaliable.");
			
		}	
		else
			threadOn = true;
			
		}
		
	}
		/**Action method for stop button
		turn off speech recognizer when pressed **/
		
	
	private class StopAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			response.append("\n You turned off JARVIS.");
			
			Status.setText("Status: OFF");
			
			threadOn = false;
	
			
			
			}
		
		
		
		}
	
	
	/** Method for speech thread and use sphinx4 library  **/
	
	private void speechRecognizer(){
		
		
		
		try {
			
			//create speech recognizer object
			LiveSpeechRecognizer recognizer;
			//create config object
			Configuration configuration = new Configuration();

			//load models from libraries
			configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
			configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");

			/*If without using grammar source
			configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");*/
			
			//config grammar source file
			configuration.setGrammarPath("resource:/grammars");
			configuration.setGrammarName("grammar");
			configuration.setUseGrammar(true);

			//initialize the speech recognizer from API
			recognizer = new LiveSpeechRecognizer(configuration);
		

			// Start recognition process
			recognizer.startRecognition(true);
		
			// initialize the speech recognize thread

			speechThread = new Thread(() -> {

			String result;
			
			
			//loop the speech recognizer
					while (threadOn) {
						try {
							
							SpeechResult speechResult = recognizer.getResult();
						
							//sleep for some period
							Thread.sleep(350);
						
							result = speechResult.getHypothesis();
							
							response.append("\n Recongnized command: “" + result + "”");
							//makeDecision(result);
							new Decision(result);
		
							response.append("\n JARVIS responded.");
										
							//sleep for some period
							Thread.sleep(350);
							
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				
				
				});


			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	}
