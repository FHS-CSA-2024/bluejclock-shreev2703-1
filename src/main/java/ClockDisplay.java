package src.main.java;

public class TimeDisplay {
    // Implement 2 private NumberDisplay objects. 
    // One for hours and one for minutes
    // Implement a private String for the display
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    private String timeString;

    // Implement a constructor that takes no parameters
    // The constructor should set hours as a NumberDisplay object with 24 as the limit
    // The constructor should set minutes as a NumberDisplay object with 60 as the limit
    // The constructor should call the method updateDisplay before finishing
    public TimeDisplay() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        refreshDisplay();
    }

    // Implement a constructor that takes 2 parameters, hour and minute
    // The constructor should set hours as a NumberDisplay object with 24 as the limit
    // The constructor should set minutes as a NumberDisplay object with 60 as the limit
    // The constructor should call the method setTime with the parameters passed in
    public TimeDisplay(int initHour, int initMinute) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        setClockTime(initHour, initMinute);
    }

    // Implement a method timeTick that takes no parameters and returns nothing
    // The method should increase the minute value by one each run
    // The hours should increase when the minutes roll over
    // The updateDisplay method should be called before finishing
    public void advanceTime() {
        minuteDisplay.increment();
        if (minuteDisplay.getValue() == 0) {
            hourDisplay.increment();
        }
        refreshDisplay();
    }

    // Implement a method setTime that takes in 2 parameters, hour and minute
    // The method should set the hours value and minutes value
    // The updateDisplay method should be called before finishing
    public void setClockTime(int hour, int minute) {
        minuteDisplay.setValue(minute);
        hourDisplay.setValue(hour);
        refreshDisplay();
    }

    // Implement a method getTime that takes no parameter and returns a String
    // The return String should be formatted as HH:MM and report out the current time
    public String getTime() {
        return timeString;
    }

    // Implement a method updateDisplay that takes no parameters and returns nothing
    // The method should update the displayString with the current time in a format
    // HH:MM
    private void refreshDisplay() {
        String timeOutput = "";
        timeOutput = hourDisplay.getDisplayValue();
        timeOutput += ":";
        timeOutput += minuteDisplay.getDisplayValue();
        timeString = timeOutput;
    }
}
