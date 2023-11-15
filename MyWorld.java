import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//private GreenfootImage bgImage = new GreenfootImage("board.jpg");

public class MyWorld extends World
{
    public static int imageCount = 0;
    public static GreenfootImage bgImage = new GreenfootImage("lvl1.png");
    public static int moveDirection = Greenfoot.getRandomNumber(1);
    public static int direction;
    public static int logPositionX;
    
    // Values holding river coordinates
    //public int riverX;
    //public int riverY;
    
    public void act() 
    {
        imageCount -= 1; //(or any other value; small -> slow moving, big -> fast movement)
        drawBackgroundImage();
        
        if (MyWorld.moveDirection == 0) {
            direction = 1;
            logPositionX = river.riverX-250;
        } else {
            direction = -1;
            logPositionX = river.riverX+250;
        }
        
        //Updates river coordinates
        river.riverX = getObjects(river.class).get(river.riverCount).getX();
        river.riverY = getObjects(river.class).get(river.riverCount).getY(); 
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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        prepare();
    }
    
    private void prepare()
    {
        setPaintOrder(test.class, Oak_log.class, Birch_log.class, placeholder.class, river.class);
        test test = new test();
        addObject(test,0,0);
        test.setLocation(250,425);
        river river = new river();
        addObject(river,250,100);
    }
}
