public class SleepIn
{
    public static boolean sleepIn(boolean weekday, boolean vacation)
    {
        return !weekday || vacation;
    }

    // test function

    public static void testSleepIn(boolean weekday, boolean vacation, 
                                   boolean expected)
    {
        boolean result = sleepIn(weekday, vacation);

        System.out.print("weekday: " + weekday +
                         " vacation: " + vacation + 
                         " expected: " + expected +
                         " result: " + result + " ");

        if (result == expected)
        {
            System.out.println("Woohoo!");
        }
        else
        {
            System.out.println("Bummer.");
        }
    }

    public static void main(String[] args)
    {
        // unit tests

        testSleepIn(false, false, true);
        testSleepIn(true, false, false);
        testSleepIn(false, true, true);
    }
}
