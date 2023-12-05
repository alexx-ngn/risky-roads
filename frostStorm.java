import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frostStorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frostStorm extends Actor
{
    private int movement;
    private int timer = 0;
    public frostStorm() {
        moveDirection();
    }
    public void act()
    {
        if (wombat.worldTimer <= 60*30) {
            moveScrolling();
        }
        animate();
        move(movement);
        removeTornado();
    }
    public void moveDirection() {
        /*if (getX()/2 >= getWorld().getWidth()) {
            movement = -3;
        } else {
            movement = 3;
        } */
        switch (Greenfoot.getRandomNumber(2)) {
            case 0: {
                movement = 3;
                break;
            } case 1: {
                movement = -3;
                break;
            } default: {
                break;
            }
        } 
    }
    public void moveScrolling() {
        setLocation(getX(),getY()+1);
    }
    public void animate() {
        timer++;
        if (timer % 30 == 0) {
            setImage(new GreenfootImage("frostStormFlipped.png"));
        }
        if (timer % 60 == 0) {
            setImage(new GreenfootImage("frostStorm.png"));
        }
    }
    public void removeTornado() {
        int atEdge;
        if (movement == 3) {
            atEdge = getWorld().getWidth()-1;
            if (getX() == atEdge|| getY() == getWorld().getHeight()-1 || isTouching(frostRiver.class)) {
                getWorld().removeObject(this);
            }
        }
        if (movement == -3) {
            atEdge = getWorld().getWidth()-500;
            if (getX() == atEdge|| getY() == getWorld().getHeight()-1 || isTouching(frostRiver.class)) {
                getWorld().removeObject(this);
            }
        }
    }
}
