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
        //Stops scrolling down after 30 seconds
        if (MyWorld.timer <= 60*30) {
            // When it reaches the right side of the world, it gets deleted.
            // Else, it moves to the right and scrolls down.
            moveScrollingBlueCar();
        }
        if (getY() == getWorld().getHeight()-1 || getX() == getWorld().getWidth()-getImage().getWidth()) {
            getWorld().removeObject(this);
        }
        move(2);
    }
    public void moveScrollingBlueCar()
    {
        setLocation(getX(),getY()+1);
    }
}
