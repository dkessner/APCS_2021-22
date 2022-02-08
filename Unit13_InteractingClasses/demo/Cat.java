//
// Cat.java
//


public class Cat
{
    public Cat(String name, String color, int fleaCount)
    {
        this.name = name;
        this.color = color;
        this.fleaCount = fleaCount;
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public int getFleaCount() {return fleaCount;}

    public String toString() 
    {
        return name + "[" + color + "," + fleaCount + "]";
    }

    private String name;
    private String color;
    private int fleaCount;
}


