import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicStarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicStarter extends World
{
    GreenfootSound bgm;
    /**
     * Constructor for objects of class MusicStarter.
     * 
     */
    public MusicStarter()
    {    
        super(1280, 720, 1); 
        bgm = new GreenfootSound("background.mp3"); 
    }
    public void act()
    {
        bgm.setVolume(20); 
        bgm.playLoop(); 
        Greenfoot.setWorld(new WelcomeWorld()); 
    }
}
