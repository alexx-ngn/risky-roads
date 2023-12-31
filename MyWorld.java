import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//private GreenfootImage bgImage = new GreenfootImage("board.jpg");

public class MyWorld extends World
{
    public static int imageCount = 0;
    public static GreenfootImage bgImage = new GreenfootImage("lvl1.png");
    public static int moveDirection = Greenfoot.getRandomNumber(1);
    public static int direction;
    public static int logPositionX;
    public static int blueCarPositionX;
    
    public void act() 
    {
        wombat.worldTimer++;
        //Image scroller, when it reaches 30 seconds it will stop
        if (wombat.worldTimer <= 30*60) {
            imageCount -= 1; //(or any other value; small -> slow moving, big -> fast movement)
            drawBackgroundImage();
        }
        
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
        
        //Updates road coordinates
        road.roadX = getObjects(road.class).get(road.roadCount).getX();
        
        if (wombat.worldTimer == 30*60) {
            frostPortal grassPortal = new frostPortal();
            addObject(grassPortal,getWidth()/2,25);
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
    public MyWorld()
    {    
        super(500, 500, 1);
        prepare();
        wombat.worldTimer = 0;
        wombat.currentLevel = 0;
        wombat.timeAlive = 0;
        SettingWorld.inSettings = false;
    }
    
    private void prepare()
    {
        setPaintOrder(wombat.class, blueCar.class, road.class, oakLog.class, birchLog.class, placeholder.class, river.class);
        wombat wombat = new wombat();
        addObject(wombat,0,0);
        wombat.setLocation(250,425);
        river river = new river();
        addObject(river,getWidth()/2,123);

        road road = new road();
        addObject(road,getWidth()/2,323);
    }
}
