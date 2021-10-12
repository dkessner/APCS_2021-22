//
// Person.java
//


public class Person
{
    public Person(String n, int f)
    {
        name = n;
        favoriteNumber = f;
    }

    public String hello()
    {
        // formatting as hex:
        // String hex = String.format("0x%08X", favoriteNumber);

        return "Hello, my name is " + name +
            " and my favorite number is " + favoriteNumber + ".";
    }

    // accessor functions
    
    public String getName()
    {
        return name;
    }

    public int getFavoriteNumber()
    {
        return favoriteNumber;
    }

    private String name;
    private int favoriteNumber;
}


