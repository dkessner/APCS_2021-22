//
// CircleTest.java
//


public class CircleTest
{
    public static void testCircumference(Circle circle, double expected)
    {
        double result = circle.circumference();

        System.out.println("expected: " + expected + " result: " + result);

        if (Math.abs(expected - result) < .01)
        {
            System.out.println("Yay!");
        }
        else
        {
            System.out.println("Boo!");
        }
    }

    public static void doSomethingSneaky(Circle circle)
    {
        //circle.radius = 2; // error: private access
    }

    public static void main(String[] args)
    {
        Circle a = new Circle(1);

        doSomethingSneaky(a);

        System.out.println("a.circumference: " + a.circumference());
        System.out.println("a.area: " + a.area());

        Circle b = new Circle(10);
        System.out.println("b.circumference: " + b.circumference());
        System.out.println("b.area: " + b.area());

        // unit tests

        testCircumference(a, 6.283);
        testCircumference(b, 62.83);
    }
}


