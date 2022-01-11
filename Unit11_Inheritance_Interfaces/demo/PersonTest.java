//
// PersonTest.java
//


import java.util.*;


public class PersonTest
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Bob"));
        people.add(new Person("Melodie"));

        Superhero superman = new Superhero("Superman");
        people.add(superman);

        for (Person p : people)
            System.out.println(p.greeting());

        superman.fly(); // superman is really a Superhero
    }
}


