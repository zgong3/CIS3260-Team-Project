package gsu.jarvis.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import gsu.jarvis.text.Decision;

import javax.swing.JScrollPane;


public class TextPanel extends JPanel {
	
	private final JLabel instruction = new JLabel("Enter your command here:");
	private final JButton Start = new JButton("Tell JARVIS");
	private final JTextArea inputfield = new JTextArea();
	private final JTextArea response = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();

	private final JScrollPane scrollPane_1 = new JScrollPane();
	
	public TextPanel(){
		

		//Set layout and background
		setLayout(null);
		setBackground(new Color(248, 248, 255));
		
		//Config start button
		Start.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		Start.setBounds(85, 155, 120, 30);
		add(Start);
		
		//Config input text area
		scrollPane.setBounds(30, 35, 230, 110);
		add(scrollPane);
		scrollPane.setViewportView(inputfield);
		inputfield.setLineWrap(true);
		inputfield.setWrapStyleWord(true);
		
		//Config response text area
		scrollPane_1.setBounds(30, 195, 230, 110);
		add(scrollPane_1);
		scrollPane_1.setViewportView(response);
		response.setLineWrap(true);
		response.setWrapStyleWord(true);
		response.setEditable(false);
		
		//Config instruction label
		instruction.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		instruction.setBounds(30, 0, 180, 30);
		add(instruction);
		
		//Add action listener to start button
		StartAction start = new StartAction();
		Start.addActionListener(start);
		
		}

	/**Action method for start button**/
	
	private class StartAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			//Get input string from textarea and convert to lower case for simplicity
			String input = inputfield.getText().toLowerCase();
			//Create detector, transfer input string to decision class
			Decision detector = new Decision(input);
			//Get response from detector
			response.append("JARVIS response: \n"+detector.getResponse()+"\n");

			
			
			
			
		}

		
		
	}
	
	}
