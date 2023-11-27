import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class road extends Actor
{
    public static int roadCount = 0;
    public static int roadX;
    public static int roadY;
    public int timer = 0;
    
    public void act()
    {
        timer++;
        roadX = getX();
        roadY = getY();
        
        if (MyWorld.timer <= 60*30) {
            if (getY() == getWorld().getHeight()-1)
            {
                getWorld().addObject(new road(),250,0);
                getWorld().removeObject(this);
                //MyWorld.moveDirection = Greenfoot.getRandomNumber(2);
                //riverCount++;
            } else {
                moveScrollingRoad();
                spawnBlueCar();
            }
        }
    }
    public void moveScrollingRoad()
    {
        setLocation(getX(),getY()+1);
    }
    public void spawnBlueCar() {
        int numBlueCars = getWorld().getObjects(blueCar.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numBlueCars < 2 && timer >= 75)
        {
            getWorld().addObject(new blueCar(), MyWorld.blueCarPositionX, roadY+30);
            timer = 0;
        }
    }
}
