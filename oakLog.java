import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class oakLog extends Actor
{
    public boolean atWorldEdge() {
        if (getX() == 0 || getX() == 500) {
            return true;
        } else return false;
    }
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