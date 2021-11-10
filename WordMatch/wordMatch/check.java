import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class check here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class check extends Actor
{
    GreenfootImage checkMark;
    private int timer;
    public check()
    {
        checkMark = new GreenfootImage("check mark.png");
        checkMark.scale(150,150);
        setImage(checkMark); 
    }
    public void act() 
    {
        timer++;
        if (timer == 50) getWorld().removeObject(this);
    }    
}
