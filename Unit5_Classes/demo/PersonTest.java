//
// PersonTest.java
//


public class PersonTest
{
    public static void main(String[] args)
    {
        // create new Person objects
        Person emma = new Person("Emma", 0);
        Person melodie = new Person("Melodie", 9);
        Person drkessner = new Person("Dr. Kessner", 0x29a);

        // call the hello() function on each
        System.out.println(emma.hello());        
        System.out.println(melodie.hello());        
        System.out.println(drkessner.hello());        

        int sum = 0;
        sum += emma.getFavoriteNumber();
        sum += melodie.getFavoriteNumber();
        sum += drkessner.getFavoriteNumber();
        System.out.println("sum:" + sum);
    }
}


