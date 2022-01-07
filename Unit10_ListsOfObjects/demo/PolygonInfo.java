//
// PolygonInfo.java
//


import java.util.*;


public class PolygonInfo
{
    public static void printPolygons(ArrayList<Polygon> polygons)
    {
        for (Polygon p : polygons)
            System.out.println(p.getName() + " has " + p.getSideCount() + " sides.");
    }

    public static float averageSideCount(ArrayList<Polygon> polygons)
    {
        float total = 0; 

        for (Polygon p : polygons)
            total += p.getSideCount();

        return total / polygons.size();
    }

    public static void main(String[] args)
    {
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(new Polygon("triangle", 3));
        polygons.add(new Polygon("square", 4));
        polygons.add(new Polygon("bob", 17));

        printPolygons(polygons);    

        System.out.println("average side count: " + averageSideCount(polygons));
    }
}


