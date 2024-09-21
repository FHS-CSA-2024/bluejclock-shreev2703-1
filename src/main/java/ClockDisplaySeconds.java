package src.main.java;


public class ClockDisplaySeconds
{
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;

    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    
    }
    
    
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
        updateDisplay();
    
    }
    
    public void timeTick(){
        seconds.increment();
        if(seconds.getValue() == 0){
            minutes.increment();   
            if(minutes.getValue()==0){
                hours.increment();
            }
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute, int second){
        seconds.setValue(second);
        minutes.setValue(minute);
        hours.setValue(hour);
        updateDisplay();       
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){
        return display;
    
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay(){
        String output = "";
        //output.toString();
        output = hours.getDisplayValue();
        output = output +":";
        output = output + minutes.getDisplayValue();
        output = output+":";
        output = output + seconds.getDisplayValue();
        display = output;    
    }
}
