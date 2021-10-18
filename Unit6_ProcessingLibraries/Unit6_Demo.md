__Unit 6 (The Processing libraries) Demo__  
__AP Computer Science 2020-21 / Dr. Kessner__  

# Intro and setup

```
import processing.core.*;

public class Project extends PApplet
{
    public void settings()
    {
        size(800, 600);
    }

    public void setup() {}

    public void draw()
    {
        background(0);
        ellipse(width/2, height/2, 100, 50);
    }

    public static void main(String[] args)
    {
        PApplet.main("Project");
    }
}
```

* `CLASSPATH`


# Hello 1

* bouncing ball


# Hello2

```
class Ball
{
    public Ball(PApplet p);
    ...

    private PApplet papplet;
}

```


# Hello3

```
ArrayList<Ball> balls;
```


# Ball2 

`PVector` implementation

