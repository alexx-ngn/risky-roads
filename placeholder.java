import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class placeholder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class placeholder extends Actor
{
    public void act()
    {
        // Stops everything after 30 seconds
        if (wombat.worldTimer <= 30*60) {
            if (getY() == getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            } else {
                move(MyWorld.direction);
                moveScrolling();
            } 
        }
    }
    public void moveScrolling()
    {
        setLocation(getX(),getY()+1);
    }
}
