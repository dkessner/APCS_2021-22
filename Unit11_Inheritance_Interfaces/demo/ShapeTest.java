//
// ShapeTest.java
//


import java.util.*;


public class ShapeTest
{
    public static void printShapes(ArrayList<Shape> shapes)
    {
        for (Shape s : shapes)
            System.out.println(s.name() + " " 
                + s.circumference() + " " + s.area());
    }



    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(1));
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(5, 10));

        printShapes(shapes);
    }
}


