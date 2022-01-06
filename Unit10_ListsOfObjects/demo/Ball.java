//
// Ball.java
//


import processing.core.*;
import java.util.*;


public class Ball
{
    public Ball(PApplet p, PVector position, PVector velocity, float r, int c, boolean bounce)
    {
        this.p = p;
        this.position = position;
        this.velocity = velocity;
        this.r = r;
        this.c = c;
        this.bounce = bounce;
    }

    public void display()
    {
        p.fill(c);
        p.ellipse(position.x, position.y, 2*r, 2*r);

        position.add(velocity);  // x += vx; y += vy;

        if (bounce)
        {
            if (position.x < r || position.x > p.width-r)
                velocity.x *= -1;

            if (position.y < r || position.y > p.width-r)
                velocity.y *= -1;
        }
        else
        {
            if (position.x < -r) position.x = p.width + r;
            if (position.x > p.width+r) position.x = -r;
            if (position.y < -r) position.y = p.height + r;
            if (position.y > p.height+r) position.y = -r;
        }
    }
    
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float r;
    private int c;
    private boolean bounce;
}


