import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class river extends Actor
{
    public static int riverCount = 0;
    private int timer = 150;
    public static int riverX;
    public static int riverY;
    private int birchOrOak = Greenfoot.getRandomNumber(2); //50% chance of spawning birch or oak logs
    public void act()
    {
        riverX = getX();
        riverY = getY();
        if (getY() == getWorld().getHeight()-1)
        {
            getWorld().addObject(new river(),250,0);
            getWorld().removeObject(this);
            MyWorld.moveDirection = Greenfoot.getRandomNumber(2);
            //riverCount++;
        } else {
            moveScrollingRiver();
            if (birchOrOak < 1) {
                spawnRateOak();
            } else {
                spawnRateBirch();
            }
        }
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
    public void spawnRateOak()
    {
        int numOakLogs = getWorld().getObjects(Oak_log.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numOakLogs <= 10)
        {
            getWorld().addObject(new Oak_log(), MyWorld.logPositionX, riverY);
            getWorld().addObject(new placeholder(), MyWorld.logPositionX, riverY);
        }
    }
    public void spawnRateBirch()
    {
        int numBirchLogs = getWorld().getObjects(Birch_log.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numBirchLogs <= 10)
        {
            getWorld().addObject(new Birch_log(),MyWorld.logPositionX, riverY);
            getWorld().addObject(new placeholder(), MyWorld.logPositionX, riverY);
        }
    }
}
