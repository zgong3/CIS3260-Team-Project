package gsu.jarvis.text;


public class Speaker {
  
  protected void turnSpeakerOn() {
    
     Decision.setResponse("Speakers are on! ");
  
}
  
  protected void turnSpeakeroff() {
    
      Decision.setResponse("Speakers are off! ");
        
}

  protected void speakerVolumeLow() {
    
      Decision.setResponse("Speaker volume is on low ");
    
}
  
  protected void speakerVolumeMed() {
    
      Decision.setResponse("Speaker volume is on medium ");
    
}
  
  protected void speakerVolumeHigh() {
    
      Decision.setResponse("Speaker volume is on high ");
  
}
  
}
