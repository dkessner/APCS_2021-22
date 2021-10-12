//
// Circle.java
//


public class Circle
{
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    private double radius;
}


