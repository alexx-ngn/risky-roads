import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WASD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WASD extends Actor
{
    GifImage myGif = new GifImage("WASD.gif");
    public WASD()
    {
        int scalePercent = 50;
        for (GreenfootImage image : myGif.getImages())
        {
            int wide = image.getWidth()*scalePercent/100;
            int high = image.getHeight()*scalePercent/100;
            image.scale(wide, high);
        }
    }
    /**
     * Act - do whatever the WASD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
