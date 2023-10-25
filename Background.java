import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Actor {

    public void act() {
        // always scroll the image.
        scroll();
    }

    public void scroll() {
        // moves the images down, so the player cannot just stay in one position. He has to keep moving.
        setLocation(getX(), getY() + 1);

        // If they image is out of the viewing field, place it on top of the image it is currently on top of.
        // This allows for the infinite scrolling background
        if (getY() > getImage().getHeight() + (getImage().getHeight() / 2)) {
            setLocation(getX(), getY() - getWorld().getHeight() * 2);
        }

    }

}