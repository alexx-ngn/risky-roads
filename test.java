import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends Actor
{
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        String key = Greenfoot.getKey();
        int tileMovement = 5;
        if("up".equals(key)){
            setLocation(getX(),getY()-tileMovement);
        }
        if("down".equals(key)){
            setLocation(getX(),getY()+tileMovement);
        }
        if("right".equals(key)){
            setLocation(getX()+tileMovement,getY());
        }
        if("left".equals(key)){
            setLocation(getX()-tileMovement,getY());
        }
    }
}
