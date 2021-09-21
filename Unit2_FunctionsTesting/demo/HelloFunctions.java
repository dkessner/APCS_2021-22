public class HelloFunctions
{
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static float average(float a, float b, float c)
    {
        return (a+b+c)/3;
    }

    public static boolean isGoodGrade(float grade)
    {
        return grade > 50;
        /*
        if (grade > 50.0)
            return true;
        else
            return false;
        */
    }

    public static void hello() 
    {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args)
    {
        hello();     

        int result = add(5, 7);
        System.out.println("result: " + result);

        System.out.println("result: " + add(15, 27));

        System.out.println("average(10, 20, 30): " + average(10, 20, 30));

        System.out.println("isGoodGrade(60): " + isGoodGrade(60));
        System.out.println("isGoodGrade(46): " + isGoodGrade(46));
    }
}
