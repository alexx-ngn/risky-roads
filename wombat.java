import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class wombat extends Actor
{
    public static int wombatX;
    public static int wombatY;
    public static int currentLevel;
    public static int worldTimer = 0;
    public static int timeAlive = 0;
    public static int moveDirection = Greenfoot.getRandomNumber(1);
    public GreenfootImage img = new GreenfootImage("wombat.png");
    public void act()
    {
        onLog();
        carGameOver();
        movementWombat();
        enterFrost();
        enterEndPortal();
        onIceRight();
        onIce();
        tornadoGameOver();
        timeAlive++;
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
        if (worldTimer <= 60*30) {
            if (SettingWorld.inSettings != true) {
                moveScrollingWombat();
            }
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
    public void enterFrost()
    {
        Actor portal = getOneIntersectingObject(frostPortal.class);
        
        //attempted animation for portal
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
        }
    }
    public void enterEndPortal() {
        Actor portal = getOneIntersectingObject(endPortal.class);
        if (portal != null) {
            Greenfoot.setWorld(new gameEnd());
        }
    }
    public void onLog()
    {
        boolean invincible = false;
        Actor oak = getOneIntersectingObject(oakLog.class);
        Actor birch = getOneIntersectingObject(birchLog.class);
        Actor river = getOneIntersectingObject(river.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        if (river != null && placeholder != null) {
            invincible= true;
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
    }
    public void onIce() {
        boolean invincible = false;
        Actor frostRiver = getOneIntersectingObject(frostRiver.class);
        Actor ice = getOneIntersectingObject(icePlatform.class);
        Actor iceRight = getOneIntersectingObject(icePlatformRight.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        if (frostRiver != null && placeholder != null) {
            invincible = true;
            //move(1);
            if (ice != null)
            {
                setLocation(ice.getX(), ice.getY());
            }
        }
        if (frostRiver != null && invincible != true) {
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
    public void onIceRight() {
        boolean invincible = false;
        Actor frostRiver = getOneIntersectingObject(frostRiver.class);
        Actor ice = getOneIntersectingObject(icePlatform.class);
        Actor iceRight = getOneIntersectingObject(icePlatformRight.class);
        Actor placeholder = getOneIntersectingObject(placeholder.class);
        if (frostRiver != null && placeholder != null) {
            invincible = true;
            //move(1);
            if (iceRight != null)
            {
                setLocation(iceRight.getX(), iceRight.getY());
            }
        }
    } 
    public void carGameOver()
    {
        Actor blueCar = getOneIntersectingObject(blueCar.class);
        if (blueCar != null) {
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
    public void tornadoGameOver() {
        if (isTouching(frostStorm.class)) {
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
}
