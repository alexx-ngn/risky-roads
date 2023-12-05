import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SettingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingWorld extends World
{
    public static boolean inSettings = false;
    public SettingWorld()
    {    
        super(500, 500, 1); 
        prepare();
        inSettings = true;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WASD wASD = new WASD();
        addObject(wASD,257,375);
        
        useWASD useWASD = new useWASD();
        addObject(useWASD,250,125);
        
        Button_Return button_Return = new Button_Return();
        addObject(button_Return,160,475);
        
        wombat wombat = new wombat();
        addObject(wombat,250,250);
        
        //Display controlText = new Display();
        //addObject(controlText, 250, 175);
        //controlText.setImage(new GreenfootImage("Use the WASD keys Or Arrow keys to play.", 30, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
        //Display goalText = new Display();
        //addObject(goalText, 250, 250);
        //goalText.setImage(new GreenfootImage("Goal: Help the wombat cross various environments!!!\nGood luck and have fun!", 25, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK)); */
    }
}
