//
// Superhero.java
//


// inheritance:
//  Superhero "is a" Person
//  Superhero is a subclass of Person
//  Superhero inherits from Person
//  Person is a superclass of Superhero

public class Superhero extends Person
{
    public Superhero(String name)
    {
        super(name); // call the superclass constructor
    }

    public void fly()
    {
        System.out.println("I'm flying!");
    }

    public String greeting() 
    {
        return "Greetings!  I am " + name + 
            " and I am here to save you!";
    }
}


