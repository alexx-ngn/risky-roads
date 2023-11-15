import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Exit extends Actor
{
    /**
     * Act - do whatever the Button_Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Button_Exit_Hover.PNG");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Button_Exit.PNG");
        }
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}
