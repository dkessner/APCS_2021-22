//
// Ball.java
//


import processing.core.*;


public class Ball
{
    public Ball(PApplet p)
    {
        this.p = p;
        this.x = p.random(0, p.width);
        this.y = p.random(0, p.height);
        this.vx = p.random(-5, 5);
        this.vy = p.random(-5, 5);
        this.c = p.color(p.random(255), p.random(255), p.random(255));
    }

    void display()
    {
        p.fill(c);
        p.ellipse(x, y, 50, 50);

        x += vx;
        y += vy;

        if (x<25 || x>p.width-25)
            vx *= -1;
        if (y<25 || y>p.width-25)
            vy *= -1;
    }

    private PApplet p;

    private float x;
    private float y;

    private float vx;
    private float vy;
    
    private int c;
}


