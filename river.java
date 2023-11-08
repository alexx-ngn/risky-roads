import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class river here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class river extends Actor
{
    public static int riverCount = 0;
    private int timer = 150;
    public void act()
    {
        timer--;
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            riverCount += 1;
        } else {
            moveScrollingRiver();
        }
        if (timer == 0) {
            getWorld().addObject(new river(),251,99);
            timer = 150;
        }
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
}
