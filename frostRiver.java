import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class frostRiver extends Actor
{
    public static int riverCount = 0;
    public static int riverX;
    public static int riverY;
    public static int movement;
    private int timer = 0;
    public frostRiver() {
        switch (Greenfoot.getRandomNumber(2)) {
            case 0:  {
                movement = 1;
                break;
            }
            case 1: {
                movement = -1;
                break; 
            }
            default: {
                break;
            }
        }
    }
    public void act()
    {
        int icePositionX = frostRiver.riverX-250;
        riverX = getX();
        riverY = getY();
        if (getY() == getWorld().getHeight()-1)
        {
            getWorld().addObject(new frostRiver(),250,0);
            getWorld().removeObject(this);
            //MyWorld.moveDirection = Greenfoot.getRandomNumber(2);
        }else if (wombat.worldTimer <= 60*30) {
            moveScrollingRiver();
            spawnIce();
        }
        timer++;
    }
    public void moveScrollingRiver()
    {
        setLocation(getX(),getY()+1);
    }
    public void spawnIce() {
        int numIce = getWorld().getObjects(icePlatform.class).size();
        if (Greenfoot.getRandomNumber(100) <= 1 && numIce <= 10 && timer >= 100 && movement == 1)
        {
            getWorld().addObject(new icePlatform(), frostLevel.icePositionX, riverY-5);
            getWorld().addObject(new placeholder(), frostLevel.icePositionX, riverY);
            timer = 0;
            }
        if (Greenfoot.getRandomNumber(100) <= 1 && numIce <= 10 && timer >= 100 && movement == -1)
        {
            getWorld().addObject(new icePlatform(), frostLevel.icePositionX+500, riverY-5);
            getWorld().addObject(new placeholder(), frostLevel.icePositionX+500, riverY);
            timer = 0;
            }
        }
    }
