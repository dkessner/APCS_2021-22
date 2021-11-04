//
// HelloArrayList.java
//


import java.util.*;


public class HelloArrayList
{
    public static double average(ArrayList<Double> values)
    {
        double total = 0.0;

        for (double d : values)
            total += d;

        return total/values.size();
    }

    public static void testAverage(ArrayList<Double> values, double expected)
    {
        double result = average(values);

        System.out.print("values: ");
        for (double d : values)
            System.out.print(d + " ");
        System.out.print("expected: " + expected + 
                         " result: " + result);

        if (Math.abs(result-expected) < 1e-6)
            System.out.println(" Woohoo!");
        else
            System.out.println(" Boohoo!");
    }

    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Riley");
        names.add("Wyeth");
        names.add("Nina");

        for (String s : names)
            System.out.println(s);

        // array:
        // for (int i=0; i<names.length; i++)

        for (int i=0; i<names.size(); i++)
        {
            // array: names[i]
            System.out.println(names.get(i));
        }
        

        ArrayList<Double> values = new ArrayList<Double>();
        values.add(95.0);
        values.add(105.0);
        values.add(85.0);
        values.add(115.0);
        values.add(100.0);

        ArrayList<Double> values2 = new ArrayList<Double>();
        values2.add(1.0);
        values2.add(3.0);
        values2.add(5.0);
        values2.add(7.0);
        values2.add(9.0);

        testAverage(values, 100.0);
        testAverage(values2, 5.0);
    }
}


