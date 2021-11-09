import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class x here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class x extends Actor
{
    //images for correct and wrong
    GreenfootImage redx = new GreenfootImage("red x.png");
    private int timer;
    public x()
    {
        redx = new GreenfootImage("red x.png");
        redx.scale(120,120);
        setImage(redx); 
    }
    public void act() 
    {
        timer++;
        if (timer == 50) getWorld().removeObject(this);
    }    
}
