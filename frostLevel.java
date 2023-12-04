import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frostLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frostLevel extends World
{
    public static int imageCount = 0;
    public static GreenfootImage bgImage = new GreenfootImage("frostLevel.png");
    public static int moveDirection = Greenfoot.getRandomNumber(1);
    public static int direction;
    public static int timer = 0;
    public static int icePositionX;
    
    public frostLevel()
    {    
        super(500, 500, 1); 
        prepare();
        wombat.currentLevel = 1;
        wombat.worldTimer = 0;
    }
    public void act() 
    {
        wombat.worldTimer++;
        //Image scroller, when it reaches 30 seconds it will stop
        if (wombat.worldTimer <= 30*60) {
            imageCount -= 1; //(or any other value; small -> slow moving, big -> fast movement)
            drawBackgroundImage();
        }
        icePositionX = frostRiver.riverX-250;
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(wombat.class,placeholder.class,icePlatform.class,icePlatformRight.class,frostRiver.class);
        frostRiver frostRiver = new frostRiver();
        wombat wombat = new wombat();
        addObject(wombat,250,380);
        addObject(frostRiver,250,130);
    }
}
