import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Birch_log extends Actor
{
    public void act()
    {
        move(4);
        Actor wombat = getOneIntersectingObject(test.class);
        if (wombat != null)
        {
            getWorld().removeObject(wombat);
        }
        if (isAtEdge())
        {
            removeLog();
        }
    }
    public void removeLog()
    {
            getWorld().removeObject(this);
    }
}