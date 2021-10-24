import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public WelcomeWorld()
    {            
        super(1280, 720, 1);
        Font titleFont = new Font("Calibri", true, false, 40);
        GreenfootImage title = new GreenfootImage("cooltext396141752577605.png");
        Button play = new Button("Play");
        Button instructions = new Button("Instructions"); 
        GreenfootImage background = new GreenfootImage("abstract_geometric_triangle_background-wallpaper-1280x720.jpg"); 
        background.setFont(titleFont);
        background.setColor(Color.BLACK); 
        setBackground(background); 
        background.drawImage(title, 400, 100); 
        addObject(play, 400, 400); 
        addObject(instructions, 800, 400); 

    }
    public void act()
    {
        if(play.touchingCursor()) //can u guys figure out why this isnt working
        {
            Greenfoot.setWorld(new GameWorld()); 
        }
    }
}
