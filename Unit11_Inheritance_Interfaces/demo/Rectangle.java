//
// Rectangle.java
//


public class Rectangle implements Shape
{
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public String name()
    {
        return "Rectangle";
    }

    public double circumference()
    {
        return 2 * (width + height);
    }

    public double area()
    {
        return width * height;
    }

    private double width;
    private double height;
}


