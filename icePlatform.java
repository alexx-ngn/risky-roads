import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class icePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class icePlatform extends Actor
{
    public void act()
    {
        // Stops everything after 30 seconds
        if (wombat.worldTimer <= 60*30) {
            moveScrollingIce();
            if (getY() == getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        } else {
            //moveScrollingIce();
        }
        if (wombat.worldTimer >= 60*30 && isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            move(frostRiver.movement);
        }
    }
    public void moveScrollingIce()
    {
        setLocation(getX(),getY()+1);
    }
}
