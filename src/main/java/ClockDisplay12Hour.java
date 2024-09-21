package src.main.java;


public class ClockDisplay12Hour
{
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    //private NumberDisplay seconds;
    private String display;
    private String timeOfDay;

    public ClockDisplay12Hour(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        timeOfDay = "AM";
        updateDisplay();
    
    }
    
    //must implement am/pm
    public ClockDisplay12Hour(int hour, int minute, String time){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute, time);
        updateDisplay();
    
    }
    
    //nested ifs to change time of day
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0){
            hours.increment();        
        }
        if( hours.getValue() == 12){
            if(minutes.getValue()==0){
            
                if(timeOfDay.equals("AM")){
                        timeOfDay = "PM";
                    }
                else{
                      timeOfDay = "AM";
                }
            }
        }
        updateDisplay();
        }
    
   

    //implement am pm
    public void setTime(int hour, int minute, String time){
        timeOfDay = time;
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
        display = output+timeOfDay;    
    }
}
