//
// HelloImage.pde
//


PImage gadget;


void setup()
{
    size(800, 600);
    gadget = loadImage("gadget.jpg");
    gadget.resize(width, height);
}


void draw()
{
    background(0);
    image(gadget, 0, 0);
}


int[][] getPixels(PImage img)
{
    img.loadPixels();
    
    int[][] result = new int[img.height][img.width];

    for (int i=0; i<result.length; i++)
    for (int j=0; j<result[i].length; j++)
        result[i][j] = img.pixels[i*img.width + j];

    return result;
}


void setPixels(PImage img, int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length; j++)
        img.pixels[i*img.width + j] = pixelArray[i][j];

    img.updatePixels();
}


void filterRed(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length; j++)
        pixelArray[i][j] &= 0xffff0000;
}


void filterGreen(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length; j++)
        pixelArray[i][j] &= 0xff00ff00;
}


void filterBlue(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length; j++)
        pixelArray[i][j] &= 0xff0000ff;
}


void filterGrey(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length; j++)
    {
        int c = pixelArray[i][j];

        int a = (c & 0xff000000) >> 24;
        int r = (c & 0x00ff0000) >> 16;
        int g = (c & 0x0000ff00) >> 8;
        int b = (c & 0x000000ff);

        int grey = (r + g + b)/3;
        pixelArray[i][j] = color(grey, grey, grey);
    }
}


void mirrorLeft(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length/2; j++)
    {
        int n = pixelArray[i].length;
        pixelArray[i][n-j-1] = pixelArray[i][j];
    }
}


void mirrorRight(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length/2; j++)
    {
        int n = pixelArray[i].length;
        pixelArray[i][j] = pixelArray[i][n-j-1];
    }
}


void flip(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length; i++)
    for (int j=0; j<pixelArray[i].length/2; j++)
    {
        int n = pixelArray[i].length;
        int temp = pixelArray[i][j];
        pixelArray[i][j] = pixelArray[i][n-j-1];
        pixelArray[i][n-j-1] = temp;
    }
}


void quad(int[][] pixelArray)
{
    for (int i=0; i<pixelArray.length/2; i++)
    for (int j=0; j<pixelArray[i].length/2; j++)
        pixelArray[i][j] = pixelArray[2*i][2*j];

    for (int i=0; i<pixelArray.length/2; i++)
    for (int j=0; j<pixelArray[i].length/2; j++)
        pixelArray[height/2+i][j] 
          = pixelArray[height/2+i][width/2+j] 
          = pixelArray[i][width/2+j] 
          = pixelArray[i][j];
}


void keyPressed()
{
    if (key == 'l')
    {
        gadget = loadImage("gadget.jpg");
        gadget.resize(width, height);
    }
    else
    {
        int[][] pixelArray = getPixels(gadget);

        if (key == 'r')
            filterRed(pixelArray);
        else if (key == 'g')
            filterGreen(pixelArray);
        else if (key == 'b')
            filterBlue(pixelArray);
        else if (key == 'y')
            filterGrey(pixelArray);
        else if (key == 'm')
            mirrorLeft(pixelArray);
        else if (key == 'n')
            mirrorRight(pixelArray);
        else if (key == 'f')
            flip(pixelArray);
        else if (key == 'q')
            quad(pixelArray);

        setPixels(gadget, pixelArray);
    }
}


