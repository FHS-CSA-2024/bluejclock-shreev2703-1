package src.main.java;

public class ClockDisplaySeconds {
    
    private NumberDisplay hourCounter;
    private NumberDisplay minuteCounter;
    private NumberDisplay secondCounter;
    private String timeDisplay;

    public ClockDisplaySeconds() {
        hourCounter = new NumberDisplay(24);
        minuteCounter = new NumberDisplay(60);
        secondCounter = new NumberDisplay(60);
        refreshDisplay();
    }
    
    public ClockDisplaySeconds(int hour, int minute, int second) {
        hourCounter = new NumberDisplay(24);
        minuteCounter = new NumberDisplay(60);
        secondCounter = new NumberDisplay(60);
        setCurrentTime(hour, minute, second);
        refreshDisplay();
    }
    
    public void timeTick() {
        secondCounter.increment();
        if (secondCounter.getValue() == 0) {
            minuteCounter.increment();   
            if (minuteCounter.getValue() == 0) {
                hourCounter.increment();
            }
        }
        refreshDisplay();
    }
    
    public void setCurrentTime(int hour, int minute, int second) {
        secondCounter.setValue(second);
        minuteCounter.setValue(minute);
        hourCounter.setValue(hour);
        refreshDisplay();       
    }

    // Implement a method getTime that takes no parameter and returns a String
    // The return String should be formatted as HH:MM:SS and report out the current time
    public String getTime() {
        return timeDisplay;
    }

    // Implement a method refreshDisplay that takes no parameters and returns nothing
    // The method should update the displayString with the current time in a format
    // HH:MM:SS
    public void refreshDisplay() {
        String result = "";
        // result.toString();
        result = hourCounter.getDisplayValue();
        result += ":";
        result += minuteCounter.getDisplayValue();
        result += ":";
        result += secondCounter.getDisplayValue();
        timeDisplay = result;    
    }
}
