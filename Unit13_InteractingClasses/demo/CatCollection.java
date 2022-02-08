//
// CatCollection.java
//


import java.util.*;


public class CatCollection
{
    public CatCollection()
    {
        cats = new ArrayList<Cat>();
    }
    
    public void adoptCat(String name, String color, int fleaCount)
    {
        cats.add(new Cat(name, color, fleaCount)); 
    }

    public void callToDinner()
    {
        for (Cat c : cats)
        {
            System.out.println("Dinner time " + c.getName() + "!");
        }
    }

    public ArrayList<Cat> getBlackCatList()
    {
        ArrayList<Cat> result = new ArrayList<Cat>();

        for (Cat c : cats)
            if (c.getColor().equals("Black"))
                result.add(c);

        return result;
    }


    public double getFleaDensity()
    {
        double total = 0;

        for (Cat c : cats)
            total += c.getFleaCount();

        return total / cats.size();
    }

    private ArrayList<Cat> cats;


    /////////////////

    public static void main(String[] args)
    {
        CatCollection herd = new CatCollection();
        herd.adoptCat("Midnight", "Black", 3);
        herd.adoptCat("Kitty", "Orange", 1);
        herd.adoptCat("Zippy", "Black", 0);

        herd.callToDinner();

        ArrayList<Cat> blackCats = herd.getBlackCatList();
        System.out.println(blackCats);

        System.out.println("flea density: " + herd.getFleaDensity());
    }
}


