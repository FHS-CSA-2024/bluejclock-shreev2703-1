package src.main.java;

public class TimeDisplayWithSeconds {
    
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    private NumberDisplay secondDisplay;
    private String timeString;

    public TimeDisplayWithSeconds() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        secondDisplay = new NumberDisplay(60);
        refreshDisplay();
    }
    
    public TimeDisplayWithSeconds(int hour, int minute, int second) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        secondDisplay = new NumberDisplay(60);
        setClockTime(hour, minute, second);
        refreshDisplay();
    }
    
    public void advanceTime() {
        secondDisplay.increment();
        if (secondDisplay.getValue() == 0) {
            minuteDisplay.increment();
            if (minuteDisplay.getValue() == 0) {
                hourDisplay.increment();
            }
        }
        refreshDisplay();
    }
    
    public void setClockTime(int hour, int minute, int second) {
        secondDisplay.setValue(second);
        minuteDisplay.setValue(minute);
        hourDisplay.setValue(hour);
        refreshDisplay();
    }
    
    // Implement a method getTime that takes no parameter and returns a String
    // The return String should be formatted as HH:MM:SS and report out the current time
    public String getTime() {
        return timeString;
    }
    
    // Implement a method updateDisplay that takes no parameters and returns nothing
    // The method should update the displayString with the current time in a format
    // HH:MM:SS
    private void refreshDisplay() {
        String output = "";
        output = hourDisplay.getDisplayValue();
        output += ":";
        output += minuteDisplay.getDisplayValue();
        output += ":";
        output += secondDisplay.getDisplayValue();
        timeString = output;
    }
}
