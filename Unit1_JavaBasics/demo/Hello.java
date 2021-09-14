public class Hello
{
    public static void hello()
    {
        System.out.println("Hello, world!");
    }

    public static void printSequence()
    {
        // 5, 10, 15, 20, 25, ...

        int number = 5;

        for (int i=0; i<5; i++)
        {
            System.out.println(number);
            number += 5; // recursive definition
        }
    }

    public static void printSequence2()
    {
        // 5, 10, 15, 20, 25, ...
        
        for (int i=5; i<25; i+=5)
            System.out.println(i);
    }

    public static void printSequence3()
    {
        // 5, 10, 15, 20, 25, ...
        
        for (int i=0; i<5; i++)
            System.out.println(i*5); // explicit formula
    }

    public static void main(String[] args)
    {
        hello();

        printSequence();
        System.out.println();

        printSequence2();
        System.out.println();

        printSequence3();
        System.out.println();
    }
}
