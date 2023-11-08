import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class river extends Actor
{
    public static int riverCount = 0;
    private int timer = 150;
    public int riverX;
    public int riverY;
    public void act()
    {
        riverX = getX();
        riverY = getY();
        timer--;
        if (getY() == getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
            riverCount++;
        } else {
            moveScrollingRiver();
            spawnRateOak();
            spawnRateBirch();
        }
        if (timer == 0) {
            getWorld().addObject(new river(),250,-50);
            timer = 150;
        }
        
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
    public void spawnRateOak()
    {
        if (Greenfoot.getRandomNumber(50)==1)
        {
            getWorld().addObject(new Oak_log(), riverX-250, riverY);
        }
    }
    public void spawnRateBirch()
    {
        if (Greenfoot.getRandomNumber(50)==1)
        {
            getWorld().addObject(new Birch_log(),riverX-250, riverY);
        }
    }
}
