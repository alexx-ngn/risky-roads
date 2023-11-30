import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class wombat extends Actor
{
    public static int wombatX;
    public static int wombatY;
    public GreenfootImage img = new GreenfootImage("wombat.png");
    public void act()
    {
        boolean invincible = false;
        movementWombat();
        Actor oak = getOneIntersectingObject(oakLog.class);
        Actor birch = getOneIntersectingObject(birchLog.class);
        Actor river = getOneIntersectingObject(river.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        Actor blueCar = getOneIntersectingObject(blueCar.class);
        Actor portal = getOneIntersectingObject(grassPortal.class);
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
        if(portal != null)
        {
            //invincible = true;
            int timer = 0;
            int width = img.getWidth();
            int height = img.getHeight();
            if (width == 2 || height == 2) {
                Greenfoot.setWorld(new frostLevel());
            }
            if ((width >= 2 || height >= 2) && timer % 60 == 0 ) {
                setLocation(portal.getX(), portal.getY());
                turn(4);
                img.scale(width/2, height/2);
                setImage(img);
            }
            timer++;
            //getWorld().removeObject(this);
            //if (timer == 45) {
            //    setImage("wombatHalf.png");
            //} else if (timer == 90) {
            //    setImage("wombatHalfOfAHalf.png");
            //} else if (timer == 135) {
            //    setImage("wombatSmol.png");
            //} else if (timer == 180) {
            //    setImage("wombatSuperSmol.png");
            //}
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
        }
        
        //Moves wombat until 30 seconds have passed
        if (MyWorld.timer <= 60*30) {
            moveScrollingWombat();
        }
        
        // Controls for wombat
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
