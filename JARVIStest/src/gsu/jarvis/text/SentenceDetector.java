package gsu.jarvis.text;

import java.io.FileInputStream;
import java.io.InputStream;  

import opennlp.tools.sentdetect.SentenceDetectorME; 
import opennlp.tools.sentdetect.SentenceModel; 

public class SentenceDetector { 

	private String input;
	private String [] sentence;
	
	public SentenceDetector(String input) { 
		
		this.input = input;
		this.detector();
	}
	
	
	
   public void detector() { 

		try {
		       
		      //Loading sentence detector model 
		      InputStream inputStream;

		      inputStream = new FileInputStream("OpenNLP_models/en-sent.bin");
			
		      SentenceModel model = new SentenceModel(inputStream); 
			
		      
		      //Instantiating the SentenceDetectorME class 
		      SentenceDetectorME detector = new SentenceDetectorME(model);  
		    
		      //Detecting the sentence
		      this.sentence = detector.sentDetect(input); 
		    	 
		    	 
				}
				catch (Exception e) {
					e.printStackTrace();
				} 
	   
   }



public String[] getSentense() {
	return sentence;
}
   



}