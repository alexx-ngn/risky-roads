import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Settings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Settings extends Actor
{
    /**
     * Act - do whatever the Button_Settings wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {            
            setImage("Button_Settings_Hover.png");
        }
        if (Greenfoot.mouseClicked(this))
        {
            //GreenfootSound.stop();
            Greenfoot.setWorld(new SettingWorld());
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Button_Settings.png");
        }
    }
}
