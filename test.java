import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class test extends Actor
{
    public void act()
    {
        String key = Greenfoot.getKey();
        int tileMovement = 50;
        //Remove wombat if at edge
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }

        if("up".equals(key) || ("w".equals(key))){
            setLocation(getX(),getY()-tileMovement);
        }
        if("down".equals(key) || ("s".equals(key))){
            setLocation(getX(),getY()+tileMovement);
        }
        if("right".equals(key) || ("d".equals(key))){
            setLocation(getX()+tileMovement,getY());
            setImage("wombat_right.png");
        }
        if("left".equals(key) || ("a".equals(key))){
            setLocation(getX()-tileMovement,getY());
            setImage("wombat.png");
        }
        moveScrollingWombat();
    }
    public void moveScrollingWombat()
    {
        setLocation(getX(),getY()+1);
    }
}
