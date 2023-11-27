import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class birchLog extends Actor
{
    
    public void act()
    {
        // Stops everything after 30 seconds
        if (MyWorld.timer <= 60*30) {
            moveScrollingLog();
            if (getY() == getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }
        if (MyWorld.timer >= 60*30 && isAtEdge()) {
            getWorld().removeObject(this);
        }
         else {
            move(MyWorld.direction);
        }
    }
    public void moveScrollingLog()
    {
        setLocation(getX(),getY()+1);
    }
}