package gsu.jarvis.text;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Greeting {
	
	protected void howAreYou(){
		
		Decision.setResponse("I'm fine, thank you.");
		
	}
	
	protected void whatsYourName(){
		
		Decision.setResponse("My name is JARVIS, how can I help you?");
		
	}
	
	protected void hi(){
		
		Decision.setResponse("Hi! My name is JARVIS, how can I help you?");
		
	}
	
	protected void nowTime(){
		//Get current time in hour/minute/second
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");	
		Decision.setResponse("Current time is: "+sdf.format(cal.getTime()));
		
	}
	
protected void nowDate(){
		//Get current year/month/date
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");	
		Decision.setResponse("Today's date is: "+sdf.format(cal.getTime()));
		
	}

}
