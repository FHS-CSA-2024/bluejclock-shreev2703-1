package src.main.java;

public class ClockDriver {
    public static void main(String[] args) {
        // Implement tests for your ClockDisplay
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
        
        ClockDisplay primaryTest = new ClockDisplay();
        String primaryTestOutput = primaryTest.getTime();
        System.out.println("\nEmpty constructor test - " + primaryTestOutput);
        
        ClockDisplay secondaryTest = new ClockDisplay(3, 45);
        String secondaryTestOutput = secondaryTest.getTime();
        System.out.println("2 arguments con. test - " + secondaryTestOutput);
        
        ClockDisplay tickTestA = new ClockDisplay(3, 32);
        System.out.println("Tick test A PreTick - " + tickTestA.getTime());
        tickTestA.timeTick();
        System.out.println("\tTick Test A Post tick - " + tickTestA.getTime());
        
        ClockDisplay tickTestB = new ClockDisplay(3, 9);
        System.out.println("Tick test B PreTick - " + tickTestB.getTime());
        tickTestB.timeTick();
        System.out.println("\tTick Test B Post tick - " + tickTestB.getTime());
        
        ClockDisplay tickTestC = new ClockDisplay(1, 59);
        System.out.println("Tick test C PreTick - " + tickTestC.getTime());
        tickTestC.timeTick();
        System.out.println("\tTick Test C Post tick - " + tickTestC.getTime());
        
        ClockDisplay tickTestD = new ClockDisplay(9, 59);
        System.out.println("Tick test D PreTick - " + tickTestD.getTime());
        tickTestD.timeTick();
        System.out.println("\tTick Test D Post tick - " + tickTestD.getTime());
        
        ClockDisplay tickTestE = new ClockDisplay(23, 59);
        System.out.println("Tick test E PreTick - " + tickTestE.getTime());
        tickTestE.timeTick();
        System.out.println("\tTick Test E Post tick - " + tickTestE.getTime());
        
        System.out.println("");
        
        // Implement tests for your ClockDisplaySeconds
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
        
        ClockDisplaySeconds secondsTestPrimary = new ClockDisplaySeconds();
        String secondsTestPrimaryOutput = secondsTestPrimary.getTime();
        System.out.println("Empty constructor test - " + secondsTestPrimaryOutput);
        
        ClockDisplaySeconds secondsTestSecondary = new ClockDisplaySeconds(3, 45, 34);
        String secondsTestSecondaryOutput = secondsTestSecondary.getTime();
        System.out.println("2 arguments con. test - " + secondsTestSecondaryOutput);
        
        ClockDisplaySeconds secondsTickTestA = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick test A PreTick - " + secondsTickTestA.getTime());
        secondsTickTestA.timeTick();
        System.out.println("\tTick Test A Post tick - " + secondsTickTestA.getTime());
        
        ClockDisplaySeconds secondsTickTestB = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Tick test B PreTick - " + secondsTickTestB.getTime());
        secondsTickTestB.timeTick();
        System.out.println("\tTick Test B Post tick - " + secondsTickTestB.getTime());
        
        ClockDisplaySeconds secondsTickTestC = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick test C PreTick - " + secondsTickTestC.getTime());
        secondsTickTestC.timeTick();
        System.out.println("\tTick Test C Post tick - " + secondsTickTestC.getTime());
        
        ClockDisplaySeconds secondsTickTestD = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick test D PreTick - " + secondsTickTestD.getTime());
        secondsTickTestD.timeTick();
        System.out.println("\tTick Test D Post tick - " + secondsTickTestD.getTime());
        System.out.println("");
        
        /*CHALLENGE*/
        // Implement tests for your ClockDisplay12Hour
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
        
        ClockDisplay12Hour ampmTestPrimary = new ClockDisplay12Hour();
        String ampmTestPrimaryOutput = ampmTestPrimary.getTime();
        System.out.println("Empty constructor test - " + ampmTestPrimaryOutput);
        
        ClockDisplay12Hour ampmTestSecondary = new ClockDisplay12Hour(3, 45, "AM");
        String ampmTestSecondaryOutput = ampmTestSecondary.getTime();
        System.out.println("2 arguments con. test - " + ampmTestSecondaryOutput);
        
        ClockDisplay12Hour ampmTickTestA = new ClockDisplay12Hour(3, 32, "PM");
        System.out.println("Tick test A PreTick - " + ampmTickTestA.getTime());
        ampmTickTestA.timeTick();
        System.out.println("\tTick Test A Post tick - " + ampmTickTestA.getTime());
        
        ClockDisplay12Hour ampmTickTestB = new ClockDisplay12Hour(11, 59, "PM");
        System.out.println("Tick test B PreTick - " + ampmTickTestB.getTime());
        ampmTickTestB.timeTick();
        System.out.println("\tTick Test B Post tick - " + ampmTickTestB.getTime());
        
        ClockDisplay12Hour ampmTickTestC = new ClockDisplay12Hour(11, 59, "AM");
        System.out.println("Tick test C PreTick - " + ampmTickTestC.getTime());
        ampmTickTestC.timeTick();
        System.out.println("\tTick Test C Post tick - " + ampmTickTestC.getTime());
        
        ClockDisplay12Hour ampmTickTestD = new ClockDisplay12Hour(12, 59, "PM");
        System.out.println("Tick test D PreTick - " + ampmTickTestD.getTime());
        ampmTickTestD.timeTick();
        System.out.println("\tTick Test D Post tick - " + ampmTickTestD.getTime());
    }
}
