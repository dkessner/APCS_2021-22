//
// HelloArrays.java
//


public class HelloArrays
{
    public static double calculateAverage(double[] values)
    {
        double total = 0;

        for (int i=0; i<values.length; i++)
        {
            total += values[i];
        }

        // total = values[0] + values[1] + values[2] + ...

        return total / values.length;
    }

    public static int countOddNames(String[] names)
    {
        int count = 0;

        for (String name : names)
        {
            if (name.length()%2 == 1)
            {
                System.out.println(name + " is odd.");
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] values = {1, 3, 5, 7}; 

        // for each loop

        for (int v : values)
            System.out.println(v);

        System.out.println("# of values: " + values.length);
        System.out.println("values[2]: " + values[2]);

        // for loop

        for (int i=0; i<values.length; i++)
        {
            int v = values[i]; // what the for-each loop is doing
            System.out.println("values[" + i + "]: " + v);
        }

        String[] names = {"Emma", "Melodie", "Riley", 
                          "Nina", "Ashley", "Sydney", 
                          "Dr. Kessner"};

        int result = countOddNames(names);
        System.out.println("result: " + result);

        double[] scores = new double[3]; // creates new empty array
        scores[0] = 90.0;
        scores[1] = 95.0;
        scores[2] = 100.0;

        System.out.println("average: " + calculateAverage(scores));
    }
}


