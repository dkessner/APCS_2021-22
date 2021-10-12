//
// CoinFlipper.java
//


public class CoinFlipper
{
    public String flip() 
    {
        if (Math.random() < .5)
            return "Heads";
        else
            return "Tails";
    }
}


