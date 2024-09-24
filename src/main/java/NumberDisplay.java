package src.main.java;

public class NumberDisplay {
    // Implement 2 private variables, maxLimit and currentValue.
    //  Both should be ints
    private int maxLimit;
    private int currentValue;
    private String strLetter;
        
    // Implement a constructor that sets the maxLimit to a passed-in variable rollOverLimit
    //  Should set currentValue to 0
    public NumberDisplay(int rollOverLimit) {
        maxLimit = rollOverLimit;
        currentValue = 0;
    }
    
    public NumberDisplay(String time) {
        strLetter = time;
    }

    // Implement getter/setter methods for maxLimit and currentValue
    //  The setValue method should check the input for validity
    //      (should not be less than 0, or over the maxLimit)
    public int getMaxLimit() {
        return maxLimit;
    }
    
    public int getCurrentValue() {
        return currentValue;
    }
    
    public void setMaxLimit(int newLimit) {
        maxLimit = newLimit;
    }
    
    public void setCurrentValue(int newValue) {
        if (newValue >= 0 && newValue < maxLimit) {
            currentValue = newValue;
        }
    }
    
    public void setString(String newTime) {
        strLetter = newTime;
    }

    // Implement a function getDisplayValue that takes no parameters and returns a String.
    //  The return string should be formatted as a two-digit number
    //  If the number is less than 10 it should return a 0 before the number.
    public String getDisplayValue() {
        String output = "";
        output = Integer.toString(currentValue);
        
        if (output.length() == 1) {
            output = "0" + output;
        }
        
        return output;
    }

    // Implement a method increment that takes no parameters and returns nothing. 
    //  This function should increase currentValue by 1, unless it reaches the maxLimit.
    //  It should reset to 0 if the maxLimit is reached
    public void increment() {
        currentValue++;
        if (currentValue >= maxLimit) {
            currentValue = 0;
        }
    }
}

