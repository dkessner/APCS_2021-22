//
// Bounce.java
//


import processing.core.*;
import java.util.*;


public class Bounce extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        //initializeBalls();
        initializeRain();
    }

    public void initializeBalls()
    {
        balls = new ArrayList<Ball>();

        for (int i=0; i<50; i++)
        {
            PVector position = new PVector(width/2, height/2);            
            PVector velocity = new PVector(random(-5, 5), random(-5, 5));            
            float r = random(10, 50);
            int c = color(random(256), random(256), random(256));
            boolean bounce = true; 

            Ball b = new Ball(this, position, velocity, r, c, bounce);
            balls.add(b);
        }
    }

    public void initializeRain()
    {
        balls = new ArrayList<Ball>();

        for (int i=0; i<500; i++)
        {
            PVector position = new PVector(random(0, width), random(0, height));            
            PVector velocity = new PVector(random(-2, 2), random(3, 5));            
            float r = random(1, 4);
            int c = color(0, random(256), random(256));
            boolean bounce = false; 

            Ball b = new Ball(this, position, velocity, r, c, bounce);
            balls.add(b);
        }
    }

    public void draw()
    {
        background(0);
        
        for (Ball b : balls)
            b.display();
    }

    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }

    private ArrayList<Ball> balls;
}


