public class HelloLoops
{
    public static String fizzBuzz(int n)
    {
        if (n%15 == 0)
            return "FizzBuzz";
        else if (n%3 == 0)
            return "Fizz";
        else if (n%5 == 0)
            return "Buzz";
        else
            return "" + n;
    }

    public static void main(String[] args)
    {
        // for:
        //    int i=0;  // initialization
        //    i<20;     // condition (boolean)
        //    i++;      // update

        for (int i=0; i<20; i++)
            System.out.println(fizzBuzz(i));

        System.out.println();
            
        int i=0;        // initialization
        while (i<20)    // condition
        {
            System.out.println(fizzBuzz(i));
            i++;        // update
        }

        System.out.println();

        int j=0;
        do
        {
            j++;

            if (j == 2)
                continue;

            System.out.println(fizzBuzz(j));

            if (j == 10)
                break;

        } while (j<20);
    }
}
