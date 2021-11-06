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
    Button play; 
    Button instructions;
    public WelcomeWorld()
    {            
        super(1280, 720, 1);
        Font titleFont = new Font("Calibri", true, false, 40);
        GreenfootImage title = new GreenfootImage("cooltext396141752577605.png");
        play = new Button("Play");
        instructions = new Button("Instructions"); 
        
        GreenfootImage background = new GreenfootImage("the-library-wallpaper-1280x720-wallpaper.jpg"); 
        background.setFont(titleFont);
        background.setColor(Color.BLACK); 
        setBackground(background); 
        background.drawImage(title, 390, 220);
        
        addObject(play, 400, 425); 
        addObject(instructions, 880, 425); 

    }
    public void act()
    {
        if(play.touchingCursor()) 
        {
            Greenfoot.setWorld(new ChoosingGamemodes()); 
        }
        if(instructions.touchingCursor()) 
        {
            Greenfoot.setWorld(new InstructionWorld()); 
        }
    }
}
