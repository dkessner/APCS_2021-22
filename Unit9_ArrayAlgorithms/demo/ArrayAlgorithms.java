//
// ArrayAlgorithms.java
//


import java.util.*;


public class ArrayAlgorithms
{
    public static float minimumScore(float[] scores)
    {
        if (scores.length == 0)
            return -1;

        float min = scores[0];

        for (float x : scores)
            if (x < min)
                min = x;

        return min;
    }

    public static void printValues(ArrayList<Float> scores)
    {
        for (float x : scores)
            System.out.print(x + " ");
        System.out.println();
    }

    // filter: we are selecting a sub-list from a list

    public static ArrayList<Float> filterGoodScores(float[] scores)
    {
        ArrayList<Float> result = new ArrayList<Float>();

        for (float x : scores)
            if (x > 89.0)
                result.add(x);

        return result;
    }

    // transform: we are transforming one list into another

    public static int[] getNameLengths(String[] names)
    {
        int[] lengths = new int[names.length];

        for (int i=0; i<names.length; i++)
        {
            lengths[i] = names[i].length();
        }

        return lengths;
    }

    public static ArrayList<String> getFizzBuzz(int n)
    {
        ArrayList<String> result = new ArrayList<String>();

        for (int i=1; i<=n; i++)
        {
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add("" + i); // convert i to String
        }

        return result;
    }

    public static void main(String[] args)
    {
        float[] scores = {90.0f, 95.0f, 100.0f, 72.0f};
        System.out.println("minimum score: " + minimumScore(scores));

        float[] nothing = {};
        System.out.println("minimum score of nothing: " + minimumScore(nothing));

        ArrayList<Float> goodScores = filterGoodScores(scores);
        printValues(goodScores);

        String[] names = {"Shaye", "Ashley", "Nina", "Sydney"};
        int[] nameLengths = getNameLengths(names);
        System.out.println("name lengths:");
        for (int n : nameLengths)
            System.out.print(n + " ");
        System.out.println();

        System.out.println("FizzBuzz:");
        ArrayList<String> fizzBuzzStrings = getFizzBuzz(30);
        for (String s : fizzBuzzStrings)
            System.out.println(s);
    }
}


