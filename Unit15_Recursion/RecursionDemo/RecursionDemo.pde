//
// RecursionDemo.pde
//


void setup()
{
    size(600, 600);
}


void draw()
{
    background(0);
    translate(width/2, height*.85);
    drawBall(10);
}


void drawBall(int level)
{
    fill(0, 255-level*30, 255);
    ellipse(0, 0, 100, 100);

    if (level >= 0)
    {
      pushMatrix();
      rotate(PI/12);
      scale(.9);
      translate(0, -50);
      drawBall(level-1);
      popMatrix();

      pushMatrix();
      rotate(-PI/12);
      scale(.9);
      translate(0, -50);
      drawBall(level-1);
      popMatrix();
    }
}


