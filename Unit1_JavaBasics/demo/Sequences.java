public class Sequences
{
    public static void printNumbers()
    {
        for (int i=0; i<10; i++)
        {
            if (i%2 == 0)
                System.out.println("Even!");
            else if (i == 7)
            {
                System.out.println("Lucky number 7!");
            }
            else
                System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        printNumbers();
    }
}
