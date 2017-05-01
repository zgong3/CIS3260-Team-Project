package gsu.jarvis.speech;

import tts.TextToSpeech;

/**
 * @author Zhanpeng Gong
 * Make voice response using text to speech library
 */

public class Decision {
	
	private String response;
	TextToSpeech textToSpeech = new TextToSpeech();
	
	public Decision(String input) {
		
		response = input;
		
		makeDecision(response);
		
	}

	private void makeDecision(String speech) {

		if ("hi".equalsIgnoreCase(speech) || "hello".equalsIgnoreCase(speech)){
			textToSpeech.speak("Hi, I am JARVIS, your intelligent assistant, how can I help you?", 1.5f, false, true);

		}
		else if ("how are you".equalsIgnoreCase(speech)){
			textToSpeech.speak("I'm fine, thank you", 1.5f, false, true);

		}
		else if ("what's your name".equalsIgnoreCase(speech)){
			textToSpeech.speak("My name is JARVIS, how can I help you?", 1.5f, false, true);

		}
		else if ("turn off the lights".equalsIgnoreCase(speech)){
			textToSpeech.speak("OK, I have turned off the lights", 1.5f, false, true);

		}
		else if ("turn on the lights".equalsIgnoreCase(speech)){
			textToSpeech.speak("OK, I have turned on the lights", 1.5f, false, true);

		}
		else if ("dim the lights".equalsIgnoreCase(speech)){
			textToSpeech.speak("the lights have been dimmed", 1.5f, false, true);

		}
		else if ("lock the doors".equalsIgnoreCase(speech)){
			textToSpeech.speak("the doors are now locked", 1.5f, false, true);

		}
		else if ("unlock the doors".equalsIgnoreCase(speech)){
			textToSpeech.speak("the doors are now unlocked", 1.5f, false, true);
		
		}
		else if ("open the garage door".equalsIgnoreCase(speech)){
			textToSpeech.speak("i am opening the garage door", 1.5f, false, true);

		}
		else if ("turn on spotify".equalsIgnoreCase(speech)){
			textToSpeech.speak("turning on spotify", 1.5f, false, true);
			
		}
		else if ("turn off spotify".equalsIgnoreCase(speech)){
			textToSpeech.speak("turning off spotify", 1.5f, false, true);
			
		}
		else if ("show camera one".equalsIgnoreCase(speech)){
			textToSpeech.speak("bringing up camera one", 1.5f, false, true);
			
		}
		else if ("show camera two".equalsIgnoreCase(speech)){
			textToSpeech.speak("bringing up camera two", 1.5f, false, true);
			
		}
		else if ("show camera three".equalsIgnoreCase(speech)){
			textToSpeech.speak("bringing up camera three", 1.5f, false, true);
			
		}
		else if ("show camera four".equalsIgnoreCase(speech)){
			textToSpeech.speak("bringing up camera four", 1.5f, false, true);
			
		}
		else if ("turn on the toaster".equalsIgnoreCase(speech)){
			textToSpeech.speak("preparing the toaster", 1.5f, false, true);
			
		}
		else if ("heat the oven to two hundred degrees".equalsIgnoreCase(speech)){
			textToSpeech.speak("heating oven to two hundred degrees", 1.5f, false, true);
			
		}
		else if ("heat the oven to three hundred degrees".equalsIgnoreCase(speech)){
			textToSpeech.speak("heating oven to three hundred degrees", 1.5f, false, true);
			
		}
		else if ("heat the oven to four hundred degrees".equalsIgnoreCase(speech)){
			textToSpeech.speak("heating oven to four hundred degrees", 1.5f, false, true);
			
		}
		else if ("heat the oven to five hundred degrees".equalsIgnoreCase(speech)){
			textToSpeech.speak("heating oven to five hundred degrees", 1.5f, false, true);
			
		}
		else if ("close spotify and open sound cloud".equalsIgnoreCase(speech)){
			textToSpeech.speak("excellent choice sir, may I reccommend some play boy Carti, or perhaps some famous dex", 1.5f, false, true);
			
		}
		else if ("raise the temperature one degree".equalsIgnoreCase(speech)){
			textToSpeech.speak("Turning up the thermostat one degree", 1.5f, false, true);
			
		}
		else if ("raise the temperature five degrees".equalsIgnoreCase(speech)){
			textToSpeech.speak("Turning up the thermostat five degrees", 1.5f, false, true);
			
		}
		else if ("open the garage door".equalsIgnoreCase(speech)){
			textToSpeech.speak("garage door opening", 1.5f, false, true);
			
		}
		else if ("close the garage door".equalsIgnoreCase(speech)){
			textToSpeech.speak("Closing the garage door", 1.5f, false, true);
			
		}
		else if ("we have an emergency".equalsIgnoreCase(speech)){
			textToSpeech.speak("Say call an ambulance or call the police", 1.5f, false, true);
		}
		else if ("call the police".equalsIgnoreCase(speech)){
			textToSpeech.speak("Calling the police", 1.5f, false, true);			
		}
		else if ("call an ambulance".equalsIgnoreCase(speech)){
			textToSpeech.speak("Calling an ambulance", 1.5f, false, true);			
		}
		else if ("call my phone".equalsIgnoreCase(speech)){
			textToSpeech.speak("Calling your phone", 1.5f, false, true);			
		}
		else if ("<unk>".equalsIgnoreCase(speech)){
			textToSpeech.speak("Sorry, I can't understand what you said.", 1.5f, false, true);

		}

	}
}
