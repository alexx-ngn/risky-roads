import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        act();
    }
    
    public void act()
    {
        Display display = new Display();
        addObject(display, 250, 300);
        
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
        
        //Greenfoot.playSound("GameOverWorld.wav");
        
        display.setImage(new GreenfootImage("Timer Value: " + timerValue, 35, Color.WHITE, Color.BLACK, Color.YELLOW));

        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (9 * 1000)))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
