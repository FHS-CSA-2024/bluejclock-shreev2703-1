package src.main.java;

public class ClockDisplay12Hour {
    
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    //private NumberDisplay seconds; // Unused variable for seconds
    private String timeRepresentation;
    private String periodOfDay;

    public ClockDisplay12Hour() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        periodOfDay = "AM";
        refreshDisplay();
    }
    
    // Constructor that requires hour, minute, and period (AM/PM)
    public ClockDisplay12Hour(int hour, int minute, String period) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        setTime(hour, minute, period);
        refreshDisplay();
    }
    
    // Method to handle the tick of time
    public void timeTick() {
        minuteDisplay.increment();
        if (minuteDisplay.getValue() == 0) {
            hourDisplay.increment();        
        }
        if (hourDisplay.getValue() == 12) {
            if (minuteDisplay.getValue() == 0) {
                if (periodOfDay.equals("AM")) {
                    periodOfDay = "PM";
                } else {
                    periodOfDay = "AM";
                }
            }
        }
        refreshDisplay();
    }

    // Set the time based on hour, minute, and period (AM/PM)
    public void setTime(int hour, int minute, String period) {
        periodOfDay = period;
        minuteDisplay.setValue(minute);
        hourDisplay.setValue(hour);
        refreshDisplay();       
    }

    // Returns the current time formatted as HH:MM
    public String getTime() {
        return timeRepresentation;
    }

    // Updates the display string with the current time in HH:MM format
    public void refreshDisplay() {
        String timeString = "";
        timeString = hourDisplay.getDisplayValue();
        timeString += ":";
        timeString += minuteDisplay.getDisplayValue();
        timeRepresentation = timeString + periodOfDay;    
    }
}
