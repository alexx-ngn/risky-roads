import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class icePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class icePlatformRight extends Actor
{
    public void act()
    {
        // Stops everything after 30 seconds
        if (wombat.worldTimer <= 60*30) {
            moveScrollingIce();
            if (getY() == getWorld().getHeight()-50) {
                getWorld().removeObject(this);
            }
        }
        if (wombat.worldTimer >= 60*30 && isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            move(-1);
        }
    }
    public void moveScrollingIce()
    {
        setLocation(getX(),getY()+1);
    }
}
