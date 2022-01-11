//
// Person.java
//


public class Person
{
    public Person(String name)
    {
        this.name = name;
    }

    public String getName()   // declaration
    {                         // definition (implementation)
        return name;
    }

    public String greeting() {return "Hello, my name is " + name;}

    protected String name;
}


