public class HelloMath
{
    public static void testSin(double input, double expected)
    {
        double result = Math.sin(input);

        System.out.print("input: " + input + " expected: " + expected +
                " result: " + result + " ");

        if (Math.abs(result - expected) < 1e-6)
        {
            System.out.println("Awesome!");
        }
        else
        {
            System.out.println("Bogus!");
        }
    }

    public static void hello()
    {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.cos(0));
        System.out.println(Math.cos(Math.PI/2));
        System.out.println(Math.sin(Math.PI));
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        hello();
        testSin(Math.PI, 0);
    }
}
