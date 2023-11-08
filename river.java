import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class river extends Actor
{
    public static int riverCount = 0;
    private int timer = 150;
    public void act()
    {
        timer--;
        if (getY() == getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
            riverCount++;
        } else {
            moveScrollingRiver();
        }
        if (timer == 0) {
            getWorld().addObject(new river(),250,-50);
            timer = 150;
        }
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
}
