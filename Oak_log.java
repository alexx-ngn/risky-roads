import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Oak_log extends Actor
{
    public void act()
    {
        Actor wombat = getOneIntersectingObject(test.class);
        if (wombat != null)
        {
            getWorld().removeObject(wombat);
            Greenfoot.stop();
        }
        if (getY() == getWorld().getHeight()-1) 
        {
            getWorld().removeObject(this);
        } else {
            move(MyWorld.direction);
            moveScrollingLog();
        }
    }
    public void moveScrollingLog()
    {
        setLocation(getX(),getY()+1);
    }
}