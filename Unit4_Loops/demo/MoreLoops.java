public class MoreLoops
{
    public static int findSubstring(String source, String target)
    {
        // return index of the substring (if found)
        // if not found, return -1

        for (int i=0; i+target.length() <= source.length();  i++)
        {
            String sub = source.substring(i, i+target.length());
            if (sub.equals(target))
                return i;
        }

        return -1;
    }

    public static int countE(String s)
    {
        int count = 0;

        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (sub.equals("e") || sub.equals("E"))
                count++;
        }

        return count;
    }

    public static int sum(int n)
    {
        // return 1 + 2 + ... + n

        int total = 0;

        for (int i=1; i<=n; i++)
            total += i;

        return total;
    }

    public static String binimate(String s)
    {
        String result = "";

        for (int i=0; i<s.length(); i++)
        {
            if (i%2 == 1)
                result += s.substring(i, i+1); // charAt()
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(findSubstring("EmmaMelodieAshley", "Mel"));
        System.out.println(findSubstring("EmmaMelodieAshley", "Emma"));
        System.out.println(findSubstring("EmmaMelodieAshley", "Dr.Kessner"));

        System.out.println("countE: " + countE("EmmaMelodieAshley"));
        System.out.println("countE: " + countE("EasyPeasy!"));

        System.out.println("sum: " + sum(4));   // 10
        System.out.println("sum: " + sum(10));  // 55

        String s = "banana";
        System.out.println(s + ": " + binimate(s));
    }
}

