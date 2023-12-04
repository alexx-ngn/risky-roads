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
    public frostStorm() {
        moveDirection();
    }
    public void act()
    {
        move(movement);
    }
    public void moveDirection() {
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
}
