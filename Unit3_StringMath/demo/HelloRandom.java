public class HelloRandom
{
    public static int random1to10()
    {
        double x = Math.random() * 10 + 1;
        return (int) x;
    }

    public static float randomFloat()
    {
        return (float)Math.random() * 100.0f;
    }

    public static void main(String[] args)
    {
        for (int i=0; i<5; i++)
            System.out.println(random1to10());

        System.out.println();
        for (int i=0; i<5; i++)
            System.out.println(randomFloat());
    }
}
