//
// Text.java
//


import processing.core.*;
import java.util.*;


public class Text extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        scores = new ArrayList<Integer>();
        scores.add(100);
        scores.add(1000);
        scores.add(999);
    }

    public void draw()
    {
        background(0);

        int y = 25;
        for (int score : scores)
            text(score, 25, y+=25);

        text("new score:" + newScore, 25, height-25);
    }

    public void keyPressed()
    {
        if ('0' < key && key < '9')
        {
            newScore += key;
        }
        else if (keyCode == ENTER)
        {
            scores.add(Integer.parseInt(newScore));
            newScore = "";
        }
        else if (key == 's')
        {
            saveScores();
        }
        else if (key == 'l')
        {
            loadScores();
        }
    }

    private void saveScores()
    {
        println("Saving scores to " + filename);

        // transform ArrayList<Integer> to String[]

        String[] result = new String[scores.size()];

        for (int i=0; i<scores.size(); i++)
        {
            result[i] = "" + scores.get(i);
        }

        // write the String[] to a file

        saveStrings(filename, result);
    }

    private void loadScores()
    {
        println("Loading scores from " + filename);

        String[] result = loadStrings(filename);

        scores = new ArrayList<Integer>();
        for (String s : result)
            scores.add(Integer.parseInt(s));
    }

    private ArrayList<Integer> scores;
    private String newScore = "";
    private String filename = "high_scores.txt";

    public static void main(String[] args)
    {
        PApplet.main("Text");
    }
}


