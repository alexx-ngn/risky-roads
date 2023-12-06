import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    private GreenfootSound music = new GreenfootSound("MainMenu_Background_Music.wav");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
        if (wombat.ifPlayedSound == false) {
            playSound();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button_Exit button_Exit = new Button_Exit();
        addObject(button_Exit,250,330);
        button_Exit.setLocation(250,330);
        
        Button_Start button_Start = new Button_Start();
        addObject(button_Start,250,280);
        button_Start.setLocation(250,280);
        
        Button_Settings button_Settings = new Button_Settings();
        addObject(button_Settings,250,280);
        button_Settings.setLocation(425,475);
    }
    public void playSound() {
        music.playLoop();
        wombat.ifPlayedSound = true;
    }
}
