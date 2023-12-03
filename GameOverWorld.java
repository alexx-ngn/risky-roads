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
        Display timer = new Display();
        addObject(timer, 250, 300);
        
        Display lostTitle = new Display();
        addObject(lostTitle, 250, 50);
        lostTitle.setImage(new GreenfootImage("You lost!!!", 60, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
        Display optionText = new Display();
        addObject(optionText, 250, 80);
        optionText.setImage(new GreenfootImage("Press spacebar to restart level.", 30, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
        Display mainMenu = new Display();
        addObject(mainMenu, 250, 105);
        mainMenu.setImage(new GreenfootImage("Press escape key to go back to main menu.", 30, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
        
        //Greenfoot.playSound("GameOverWorld.wav");
        
<<<<<<< Updated upstream
=======
        timer.setImage(new GreenfootImage("Timer Value: " + wombat.worldTimer / 60, 35, Color.WHITE,new Color(0, 0, 0, 0), Color.BLACK));
        
>>>>>>> Stashed changes
        if (Greenfoot.isKeyDown("space"))
        {
            switch (wombat.currentLevel){
                case 0: {
                    Greenfoot.setWorld(new MyWorld());
                    break;
                }
                case 1: {
                    Greenfoot.setWorld(new frostLevel());
                    break;
                }
            }
        }
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (9 * 1000)) || Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
