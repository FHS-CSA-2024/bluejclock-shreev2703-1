package src.main.java;

public class TwelveHourDisplay {
    
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    //private NumberDisplay secondDisplay;
    private String timeString;
    private String period; // AM/PM

    public TwelveHourDisplay() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        period = "AM";
        refreshDisplay();
    }
    
    // Must implement am/pm
    public TwelveHourDisplay(int hour, int minute, String timePeriod) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        setClockTime(hour, minute, timePeriod);
        refreshDisplay();
    }
    
    // Nested ifs to change time of day
    public void advanceTime() {
        minuteDisplay.increment();
        if (minuteDisplay.getValue() == 0) {
            hourDisplay.increment();
        }
        if (hourDisplay.getValue() == 12 && minuteDisplay.getValue() == 0) {
            if (period.equals("AM")) {
                period = "PM";
            } else {
                period = "AM";
            }
        }
        refreshDisplay();
    }
    
    // Implement am/pm
    public void setClockTime(int hour, int minute, String timePeriod) {
        period = timePeriod;
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
        String output = "";
        output = hourDisplay.getDisplayValue();
        output += ":";
        output += minuteDisplay.getDisplayValue();
        timeString = output + period;
    }
}
