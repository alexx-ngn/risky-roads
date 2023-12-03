import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class frostRiver extends Actor
{
    public static int riverCount = 0;
    public static int riverX;
    public static int riverY;
    
    public void act()
    {
        riverX = getX();
        riverY = getY();
        if (getY() == getWorld().getHeight()-1)
        {
            getWorld().addObject(new frostRiver(),250,0);
            getWorld().removeObject(this);
            MyWorld.moveDirection = Greenfoot.getRandomNumber(2);
            //riverCount++;
        } else if (frostLevel.timer <= 60*30) {
            moveScrollingRiver();
        }
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
}
