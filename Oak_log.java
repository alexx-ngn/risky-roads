import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Oak_log extends Actor
{
    public void act()
    {
        Actor wombat = getOneIntersectingObject(test.class);
        if (wombat != null)
        {
            getWorld().removeObject(wombat);
        }
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        } else {
            move(1);
            moveScrollingLog();
        }
    }
    public void moveScrollingLog()
    {
        setLocation(getX(),getY()+1);
    }
}