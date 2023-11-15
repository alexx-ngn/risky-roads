import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class test extends Actor
{
    public static int wombatX;
    public static int wombatY;
    public void act()
    {
        boolean invicible = false;
        movementWombat();
        Actor river = getOneIntersectingObject(river.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        if (river != null && placeholder != null) {
            invicible = true;
            move(MyWorld.direction);
        }
        if (river != null && invicible != true) {
            getWorld().removeObject(this);
        }
    }
    public void movementWombat(){
        String key = Greenfoot.getKey();
        int tileMovement = 50;
        wombatX = getX();
        wombatY = getY();
        
        //Remove wombat if at edge
        if (getY() == getWorld().getHeight()-1 || 
            getX() == getWorld().getWidth()-1 || 
            getX() == getWorld().getWidth()-500)
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        } else {
            moveScrollingWombat();
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
    }
    public void moveScrollingWombat()
    {
        setLocation(getX(),getY()+1);
    }
}
