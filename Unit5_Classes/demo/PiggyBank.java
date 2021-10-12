//
// PiggyBank.java
//


public class PiggyBank
{
    public PiggyBank()
    {
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    // (normal) member functions

    public int total()
    {
        return nickels*5 + dimes*10 + quarters*25;
    }

    public void addNickel()
    {
        nickels += 1;
    }

    public void addDime()
    {
        dimes += 1;
    }

    public void addQuarter()
    {
        quarters += 1;
    }

    // static function  ("class function")

    public static int valueOfDime()
    {
        return 10;
    }

    // static variable ("class variable")
    
    public static float PI = 3.14f;

        
    private int nickels;
    private int dimes;
    private int quarters;
}


