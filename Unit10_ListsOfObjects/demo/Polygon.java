//
// Polygon.java
//


public class Polygon
{
    public Polygon(String name, int sideCount)
    {
        this.name = name;
        this.sideCount = sideCount;
    }

    public String getName() {return name;}

    public int getSideCount() {return sideCount;}

    private String name;
    private int sideCount;
}


