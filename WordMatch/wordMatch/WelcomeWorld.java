import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */
public class WelcomeWorld extends World
{
    //declare objects
    Button play; 
    Button instructions;
    public WelcomeWorld()
    {            
        super(1280, 720, 1);
        Font titleFont = new Font("Calibri", true, false, 40);
        GreenfootImage title = new GreenfootImage("cooltext396141752577605.png"); //the custom title
        
        play = new Button("Play");
        instructions = new Button("Instructions"); 
        GreenfootImage background = new GreenfootImage("the-library-wallpaper-1280x720-wallpaper.jpg"); //the custom background
        //initialize objects and create them 
        
        background.setFont(titleFont);
        background.setColor(Color.BLACK); 
        setBackground(background); 
        background.drawImage(title, 390, 220); //set the images and background
        
        addObject(play, 500, 425); 
        addObject(instructions,750, 425); //add objects to the world
        
      

    }
    public void act()
    {
        
        if(play.touchingCursor()) 
        {
            Greenfoot.setWorld(new ChoosingGamemodes()); //go to choosing difficulty 
        }
        if(instructions.touchingCursor()) 
        {
            Greenfoot.setWorld(new InstructionWorld()); //go to the instructions
        }
    }
}
