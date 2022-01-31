//
// Hello2DArrays.java
//


public class Hello2DArrays
{
    public static double calculateAverage(int[][] values)
    {
        double total = 0;
        int count = 0;

        for (int[] row : values)
        {
            for (int value : row)
            {
                total += value;
                count++;
            }
        }

        return total / count;
    }

    public static void printArray(int[][] values)
    {
        for (int[] row : values)
        {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, 2D arrays!");

        int[][] values = { {1, 3, 5}, 
                           {2, 4},
                           {100, 200, 300} };


        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
                System.out.print(values[i][j] + " ");

            System.out.println();
        }

        System.out.println();

        int[][] values2 = new int[4][4];

        // initialize:
        // 1 2 3 4
        // 1 2 3 4
        // 1 2 3 4
        // 1 2 3 4

        for (int i=0; i<values2.length; i++)
        {
            for (int j=0; j<values2[i].length; j++)
            {
                values2[i][j] = j+1;
            }
        }

        printArray(values2);

        double result = calculateAverage(values2);
        System.out.println("average:" + result);
    }
}


