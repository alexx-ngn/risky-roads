import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Start extends Actor
{
    /**
     * Act - do whatever the Button_Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {            
            setImage("Button_Start_Hover.PNG");
        }
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new frostLevel());
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Button_Start.PNG");
        }
    }
}

    
