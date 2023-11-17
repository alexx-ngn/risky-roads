import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class river extends Actor
{
    public static int riverCount = 0;
    public static int riverX;
    public static int riverY;
    private int birchOrOak = Greenfoot.getRandomNumber(2); //50% chance of spawning birch or oak logs
    public int timer = 0;
    public void act()
    {
        timer++;
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
        int numOakLogs = getWorld().getObjects(oakLog.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numOakLogs <= 10 && timer >= 100)
        {
            getWorld().addObject(new oakLog(), MyWorld.logPositionX, riverY);
            getWorld().addObject(new placeholder(), MyWorld.logPositionX, riverY);
            timer = 0;
        }
    }
    public void spawnRateBirch()
    {
        int numBirchLogs = getWorld().getObjects(birchLog.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numBirchLogs <= 10 && timer >= 100)
        {
            getWorld().addObject(new birchLog(),MyWorld.logPositionX, riverY);
            getWorld().addObject(new placeholder(), MyWorld.logPositionX, riverY);
            timer = 0;
        }
    }
}
