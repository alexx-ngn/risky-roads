import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Return extends Actor
{
    /**
     * Act - do whatever the Button_Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {            
            setImage("Button_Return_Hover.png");
        }
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Button_Return.png");
        }
    }
}
