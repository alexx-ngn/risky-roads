import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class wombat extends Actor
{
    public static int wombatX;
    public static int wombatY;
    public void act()
    {
        boolean invincible = false;
        movementWombat();
        Actor oak = getOneIntersectingObject(oakLog.class);
        Actor birch = getOneIntersectingObject(birchLog.class);
        Actor river = getOneIntersectingObject(river.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        Actor blueCar = getOneIntersectingObject(blueCar.class);
        if (river != null && placeholder != null) {
            invincible = true;
            move(MyWorld.direction);
            if (placeholder != null && birch != null)
            {
                setLocation(birch.getX(), birch.getY()-25);
            }
            else {
                setLocation(oak.getX(), oak.getY()-25);
            }
        }
        if (river != null && invincible != true) {
            Greenfoot.setWorld(new GameOverWorld());
        }
        if (blueCar != null) {
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
    public void movementWombat()
    {
        String key = Greenfoot.getKey();
        int tileMovement = 50;
        wombatX = this.getX();
        wombatY = this.getY();
        
        //Remove wombat if at edge
        if (getY() == getWorld().getHeight()-1 || 
            getX() == getWorld().getWidth()-1 || 
            getX() == getWorld().getWidth()-500)
        {
            //getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOverWorld());
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
