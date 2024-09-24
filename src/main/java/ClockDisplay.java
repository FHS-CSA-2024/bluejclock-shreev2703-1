package src.main.java;

public class ClockDisplay {
    // Two private NumberDisplay objects for hours and minutes
    // A private String to represent the display
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    private String timeDisplay;

    // Constructor with no parameters
    // Initializes hourDisplay with a NumberDisplay object that has a limit of 24
    // Initializes minuteDisplay with a NumberDisplay object that has a limit of 60
    // Calls updateDisplay before finishing
    public ClockDisplay() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        updateDisplay();
    }

    // Constructor that takes two parameters: hour and minute
    // Initializes hourDisplay with a limit of 24
    // Initializes minuteDisplay with a limit of 60
    // Calls setTime with the provided parameters
    public ClockDisplay(int hour, int minute) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        setTime(hour, minute);
    }

    // Method timeTick that takes no parameters and returns nothing
    // Increases the minute value by one each call
    // Increments hours when minutes roll over
    // Calls updateDisplay before finishing
    public void timeTick() {
        minuteDisplay.increment();
        if (minuteDisplay.getValue() == 0) {
            hourDisplay.increment();
        }
        updateDisplay();
    }

    // Method setTime that takes two parameters: hour and minute
    // Sets the values for hours and minutes
    // Calls updateDisplay before finishing
    public void setTime(int hour, int minute) {
        minuteDisplay.setValue(minute);
        hourDisplay.setValue(hour);
        updateDisplay();
    }

    // Method getTime that takes no parameters and returns a String
    // Returns the current time formatted as HH:MM
    public String getTime() {
        return timeDisplay;
    }

    // Method updateDisplay that takes no parameters and returns nothing
    // Updates the timeDisplay with the current time in the format HH:MM
    public void updateDisplay() {
        String formattedTime = "";
        formattedTime = hourDisplay.getDisplayValue();
        formattedTime = formattedTime + ":";
        formattedTime = formattedTime + minuteDisplay.getDisplayValue();
        timeDisplay = formattedTime;
    }
}
