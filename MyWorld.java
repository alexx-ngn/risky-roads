import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//private GreenfootImage bgImage = new GreenfootImage("board.jpg");

public class MyWorld extends World
{
    public static int imageCount = 0;
    public static GreenfootImage bgImage = new GreenfootImage("lvl1.png");
    
    // Values holding river coordinates
    public int riverX;
    public int riverY;

    public void act() 
    {
        imageCount -= 1; //(or any other value; small -> slow moving, big -> fast movement)
        drawBackgroundImage();
        spawnRateOak();
        spawnRateBirch();
        
        //Updates river coordinates
        riverX = (((river) getObjects(river.class).get(0)).getX());
        riverY = (((river) getObjects(river.class).get(0)).getY());
    }
    public void drawBackgroundImage() 
    {
        if (imageCount < -bgImage.getWidth()) {
            imageCount += bgImage.getWidth();
        }
        int temp = -imageCount;
        getBackground().drawImage(bgImage, 0, temp);
        getBackground().drawImage(bgImage, 0, temp - bgImage.getWidth());
    }
    public void spawnRateOak()
    {
        if (Greenfoot.getRandomNumber(100)==1)
        {
            addObject(new Oak_log(), riverX, riverY);
        }
    }
    public void spawnRateBirch()
    {
        if (Greenfoot.getRandomNumber(100)==1)
        {
            addObject(new Birch_log(),riverX, riverY);
        }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        prepare();
    }
    private void prepare()
    {
        test test = new test();
        addObject(test,0,0);
        test.setLocation(256,425);
        test.setLocation(277,414);
        river river = new river();
        addObject(river,251,99);
    }
}
