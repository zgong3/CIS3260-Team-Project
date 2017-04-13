package gsu.jarvis.ui;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class MainWindow {

	
	JFrame frame = new JFrame("JARVIS");
	
	JPanel panelSwitch = new JPanel();

	JPanel panelMenu = new JPanel();
	
	CardLayout cl = new CardLayout();
	
	public MainWindow(TextPanel panelText, VoicePanel panelVoice){
		
		//add switcher panel to window frame
		frame.getContentPane().add(panelSwitch);
		//set window visible
		frame.setVisible(true);
		//set window position
		frame.setBounds(0, 0, 300, 370);
		//stop program when window closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//lock window size
		frame.setResizable(false);
		//get user screen size to display window at near center
		Toolkit toolkit =  Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		//get approximate location and set position
		int x = screen.width/3+150;
		int y = screen.height/4;
		frame.setLocation(x, y);

		//install card layout for switch panel
		panelSwitch.setLayout(cl);
		panelMenu.setBackground(new Color(248, 248, 255));
		//set default panel for menu
		panelMenu.setLayout(null);
		
		//add visible panels to switcher panel, set default panel as menu
		panelSwitch.add(panelMenu, "1");
		panelSwitch.add(panelVoice, "2");
		panelSwitch.add(panelText, "3");
		cl.show(panelSwitch, "1");
		

		
		
		//add and config voice button
		JButton Voice = new JButton("Voice Mode");
		Voice.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		Voice.setBounds(85, 140, 120, 30);
		panelMenu.add(Voice);
		
		//add and config text button
		JButton Text = new JButton("Text Mode");
		Text.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		Text.setBounds(85, 190, 120, 30);
		panelMenu.add(Text);
		
		//add and config about button
		JButton About = new JButton("About");
		About.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		About.setBounds(85, 240, 120, 30);
		panelMenu.add(About);
		
		JLabel title = new JLabel("JARVIS");
		title.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 48));
		title.setBounds(70, 50, 160, 65);
		panelMenu.add(title);
		
	
		
	
	/**Action method for voice button
	Switch to voice mode panel when pressed **/

	Voice.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent arg0) {

				cl.show(panelSwitch, "2");

			}
		});

		
	
	/**Action method for text button
	Switch to text mode panel when pressed **/

	Text.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent arg0) {

				cl.show(panelSwitch, "3");

			}
		});		

	}
}






