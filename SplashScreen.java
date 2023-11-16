import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{

    double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
    }
    
    public void act()
    {
     int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000; 
     
     Greenfoot.playSound("SplashScreenIntro.wav");
     
     if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (3 * 1000)))
     {
         Greenfoot.setWorld(new MainMenu());
     }
    }
}
