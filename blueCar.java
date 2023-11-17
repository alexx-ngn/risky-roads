import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueCar extends Actor
{
    /**
     * Act - do whatever the blueCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() == getWorld().getHeight()-1 || getX() == getWorld().getWidth()-getImage().getWidth())
        {
            getWorld().removeObject(this);
        } else {
            move(2);
            moveScrollingBlueCar();
        }
    }
    public void moveScrollingBlueCar()
    {
        setLocation(getX(),getY()+1);
    }
}
