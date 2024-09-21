package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\nEmpty constructor test - "+test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3,45);
        String test2Output = test2.getTime();
        System.out.println("2 arguments con. test - "+test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("Tick test 1 PreTick - "+ tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("\tTick Test 1 Post tick - "+ tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        System.out.println("Tick test 2 PreTick - "+ tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("\tTick Test 2 Post tick - "+ tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        System.out.println("Tick test 3 PreTick - "+ tickTest3.getTime());
        tickTest1.timeTick();
        System.out.println("\tTick Test 3 Post tick - "+ tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        System.out.println("Tick test 4 PreTick - "+ tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("\tTick Test 4 Post tick - "+ tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        System.out.println("Tick test 5 PreTick - "+ tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("\tTick Test 5 Post tick - "+ tickTest5.getTime());
        
        System.out.println("");
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds secondsTest1 = new ClockDisplaySeconds();
        String secondsTest1Output = secondsTest1.getTime();
        System.out.println("Empty constructor test - "+secondsTest1Output);
        
        ClockDisplaySeconds secondsTest2 = new ClockDisplaySeconds(3,45, 34);
        String secondsTest2Output = secondsTest2.getTime();
        System.out.println("2 arguments con. test - "+secondsTest2Output);
        
        ClockDisplaySeconds secondsTickTest1 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick test 1 PreTick - "+ secondsTickTest1.getTime());
        secondsTickTest1.timeTick();
        System.out.println("\tTick Test 1 Post tick - "+ secondsTickTest1.getTime());
        
        ClockDisplaySeconds secondsTickTest2 = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Tick test 2 PreTick - "+ secondsTickTest2.getTime());
        secondsTickTest2.timeTick();
        System.out.println("\tTick Test 2 Post tick - "+ secondsTickTest2.getTime());
        
        ClockDisplaySeconds secondsTickTest3 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick test 3 PreTick - "+ secondsTickTest3.getTime());
        secondsTickTest3.timeTick();
        System.out.println("\tTick Test 3 Post tick - "+ secondsTickTest3.getTime());
        
        ClockDisplaySeconds secondsTickTest4 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick test 4 PreTick - "+ secondsTickTest4.getTime());
        secondsTickTest4.timeTick();
        System.out.println("\tTick Test 4 Post tick - "+ secondsTickTest4.getTime());
        System.out.println("");
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour ampmTest1 = new ClockDisplay12Hour();
        String ampmTest1Output = ampmTest1.getTime();
        System.out.println("Empty constructor test - "+ampmTest1Output);
        
        
        
        ClockDisplay12Hour ampmTest2 = new ClockDisplay12Hour(3,45, "AM");
        String ampmTest2Output = ampmTest2.getTime();
        System.out.println("2 arguments con. test - "+ampmTest2Output);
        
        
        
        ClockDisplay12Hour ampmTickTest1 = new ClockDisplay12Hour(3, 32, "PM");
        System.out.println("Tick test 1 PreTick - "+ ampmTickTest1.getTime());
        ampmTickTest1.timeTick();
        System.out.println("\tTick Test 1 Post tick - "+ ampmTickTest1.getTime());
        
        
        
        ClockDisplay12Hour ampmTickTest2 = new ClockDisplay12Hour(11, 59, "PM");
        System.out.println("Tick test 2 PreTick - "+ ampmTickTest2.getTime());
        ampmTickTest2.timeTick();
        System.out.println("\tTick Test 2 Post tick - "+ ampmTickTest2.getTime());
        
        
        
        ClockDisplay12Hour ampmTickTest3 = new ClockDisplay12Hour(11, 59, "AM");
        System.out.println("Tick test 3 PreTick - "+ ampmTickTest3.getTime());
        ampmTickTest3.timeTick();
        System.out.println("\tTick Test 3 Post tick - "+ ampmTickTest3.getTime());
        
        
        
        ClockDisplay12Hour ampmTickTest4 = new ClockDisplay12Hour(12, 59, "PM");
        System.out.println("Tick test 4 PreTick - "+ ampmTickTest4.getTime());
        ampmTickTest4.timeTick();
        System.out.println("\tTick Test 4 Post tick - "+ ampmTickTest4.getTime());
    }
}
