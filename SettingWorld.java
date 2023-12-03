import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SettingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingWorld extends World
{

    /**
     * Constructor for objects of class SettingWorld.
     * 
     */
    public SettingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WASD wASD = new WASD();
        addObject(wASD,150,100);
        
        Button_Return button_Return = new Button_Return();
        addObject(button_Return,160,475);
        
        Display controlText = new Display();
        addObject(controlText, 250, 175);
        controlText.setImage(new GreenfootImage("Use the WASD keys Or Arrow keys to play.", 30, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
        Display goalText = new Display();
        addObject(goalText, 250, 250);
        goalText.setImage(new GreenfootImage("Goal: Help the wombat cross various environments!!!\nGood luck and have fun!", 25, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
    }
}
