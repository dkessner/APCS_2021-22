public class HelloString
{
    public static void hello()
    {
        String s = "Hello, world!";
        System.out.println(s);

        String t = new String("Hello, world!"); // create a new object of type String
        System.out.println(t);

        System.out.println("s == t: " + (s == t));
        System.out.println("s.equals(t): " + s.equals(t));
    }

    public static String greet(String name)
    {
        return "Hello, there, " + name + "!"; // + is string concatenation
    }

    public static boolean isPolite(String sentence)
    {
        if (sentence.substring(0, 6).equals("Please"))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        hello();

        System.out.println(greet("Sydney"));
        System.out.println(greet("Riley"));
        System.out.println(greet("Ashley"));
        
        String s1 = "Please pass the sugar.";
        System.out.println(s1 + ": " + isPolite(s1));
        String s2 = "Please pass the salt.";
        System.out.println(s2 + ": " + isPolite(s2));
        String s3 = "Give me a good grade.";
        System.out.println(s3 + ": " + isPolite(s3));

        System.out.println("length of s1: " + s1.length());
    }
}
