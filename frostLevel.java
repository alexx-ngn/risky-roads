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
        SettingWorld.inSettings = false;
    }
    public void act() 
    {
        wombat.worldTimer++;
        icePositionX = frostRiver.riverX-250;
        //Image scroller, when it reaches 30 seconds it will stop
        if (wombat.worldTimer <= 30*60) {
            imageCount -= 1; //(or any other value; small -> slow moving, big -> fast movement)
            drawBackgroundImage();
            spawnTornado();
        }
        if (wombat.worldTimer == 30*60) {
            endPortal endPortal = new endPortal();
            addObject(endPortal,getWidth()/2,25);
        }
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
    public void spawnTornado() {
        int spawnX;
        if (Greenfoot.getRandomNumber(100) <= 50) {
            spawnX = 0;
        } else {
            spawnX = getWidth();
        }
        if (Greenfoot.getRandomNumber(100) <= 1) {
            frostStorm frostStorm = new frostStorm();
            addObject(frostStorm,spawnX,Greenfoot.getRandomNumber(500));
        }
    }
    
    private void prepare()
    {
        setPaintOrder(wombat.class,placeholder.class,icePlatform.class,icePlatformRight.class,frostRiver.class);
        frostRiver frostRiver = new frostRiver();
        
        wombat wombat = new wombat();
        addObject(wombat,250,380);
        addObject(frostRiver,250,130);
        //addObject(frostStorm,0,0);
    }
}
