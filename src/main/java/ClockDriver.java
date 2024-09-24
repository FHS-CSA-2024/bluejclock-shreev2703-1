package src.main.java;

public class TimeDriver {
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

        TimeDisplay test1 = new TimeDisplay();
        String result1 = test1.getTime();
        System.out.println("\nEmpty constructor test - " + result1);

        TimeDisplay test2 = new TimeDisplay(3, 45);
        String result2 = test2.getTime();
        System.out.println("Two argument constructor test - " + result2);

        TimeDisplay tickTest1 = new TimeDisplay(3, 32);
        System.out.println("Tick test 1 PreTick - " + tickTest1.getTime());
        tickTest1.advanceTime();
        System.out.println("\tTick test 1 Post tick - " + tickTest1.getTime());

        TimeDisplay tickTest2 = new TimeDisplay(3, 9);
        System.out.println("Tick test 2 PreTick - " + tickTest2.getTime());
        tickTest2.advanceTime();
        System.out.println("\tTick test 2 Post tick - " + tickTest2.getTime());

        TimeDisplay tickTest3 = new TimeDisplay(1, 59);
        System.out.println("Tick test 3 PreTick - " + tickTest3.getTime());
        tickTest3.advanceTime();
        System.out.println("\tTick test 3 Post tick - " + tickTest3.getTime());

        TimeDisplay tickTest4 = new TimeDisplay(9, 59);
        System.out.println("Tick test 4 PreTick - " + tickTest4.getTime());
        tickTest4.advanceTime();
        System.out.println("\tTick test 4 Post tick - " + tickTest4.getTime());

        TimeDisplay tickTest5 = new TimeDisplay(23, 59);
        System.out.println("Tick test 5 PreTick - " + tickTest5.getTime());
        tickTest5.advanceTime();
        System.out.println("\tTick test 5 Post tick - " + tickTest5.getTime());

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

        TimeDisplayWithSeconds secondsTest1 = new TimeDisplayWithSeconds();
        String secondsResult1 = secondsTest1.getTime();
        System.out.println("Empty constructor test - " + secondsResult1);

        TimeDisplayWithSeconds secondsTest2 = new TimeDisplayWithSeconds(3, 45, 34);
        String secondsResult2 = secondsTest2.getTime();
        System.out.println("Three argument constructor test - " + secondsResult2);

        TimeDisplayWithSeconds secondsTickTest1 = new TimeDisplayWithSeconds(3, 32, 59);
        System.out.println("Tick test 1 PreTick - " + secondsTickTest1.getTime());
        secondsTickTest1.advanceTime();
        System.out.println("\tTick test 1 Post tick - " + secondsTickTest1.getTime());

        TimeDisplayWithSeconds secondsTickTest2 = new TimeDisplayWithSeconds(1, 0, 59);
        System.out.println("Tick test 2 PreTick - " + secondsTickTest2.getTime());
        secondsTickTest2.advanceTime();
        System.out.println("\tTick test 2 Post tick - " + secondsTickTest2.getTime());

        TimeDisplayWithSeconds secondsTickTest3 = new TimeDisplayWithSeconds(1, 59, 59);
        System.out.println("Tick test 3 PreTick - " + secondsTickTest3.getTime());
        secondsTickTest3.advanceTime();
        System.out.println("\tTick test 3 Post tick - " + secondsTickTest3.getTime());

        TimeDisplayWithSeconds secondsTickTest4 = new TimeDisplayWithSeconds(23, 59, 59);
        System.out.println("Tick test 4 PreTick - " + secondsTickTest4.getTime());
        secondsTickTest4.advanceTime();
        System.out.println("\tTick test 4 Post tick - " + secondsTickTest4.getTime());

        System.out.println("");
        /* CHALLENGE */
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

        TwelveHourDisplay ampmTest1 = new TwelveHourDisplay();
        String ampmResult1 = ampmTest1.getTime();
        System.out.println("Empty constructor test - " + ampmResult1);

        TwelveHourDisplay ampmTest2 = new TwelveHourDisplay(3, 45, "AM");
        String ampmResult2 = ampmTest2.getTime();
        System.out.println("Three argument constructor test - " + ampmResult2);

        TwelveHourDisplay ampmTickTest1 = new TwelveHourDisplay(3, 32, "PM");
        System.out.println("Tick test 1 PreTick - " + ampmTickTest1.getTime());
        ampmTickTest1.advanceTime();
        System.out.println("\tTick test 1 Post tick - " + ampmTickTest1.getTime());

        TwelveHourDisplay ampmTickTest2 = new TwelveHourDisplay(11, 59, "PM");
        System.out.println("Tick test 2 PreTick - " + ampmTickTest2.getTime());
        ampmTickTest2.advanceTime();
        System.out.println("\tTick test 2 Post tick - " + ampmTickTest2.getTime());

        TwelveHourDisplay ampmTickTest3 = new TwelveHourDisplay(11, 59, "AM");
        System.out.println("Tick test 3 PreTick - " + ampmTickTest3.getTime());
        ampmTickTest3.advanceTime();
        System.out.println("\tTick test 3 Post tick - " + ampmTickTest3.getTime());

        TwelveHourDisplay ampmTickTest4 = new TwelveHourDisplay(12, 59, "PM");
        System.out.println("Tick test 4 PreTick - " + ampmTickTest4.getTime());
        ampmTickTest4.advanceTime();
        System.out.println("\tTick test 4 Post tick - " + ampmTickTest4.getTime());
    }
}
