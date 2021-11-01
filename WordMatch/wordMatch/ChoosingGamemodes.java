import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChoosingGamemodes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoosingGamemodes extends World
{

    /**
     * Constructor for objects of class ChoosingGamemodes.
     * 
     */
    Button instructions; 
    Button words3; 
    Button words4; 
    Button words5; 
    public ChoosingGamemodes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        //font title 
        Font titleFont = new Font("Calibri", true, false, 40);
        GreenfootImage title = new GreenfootImage("cooltext396141752577605.png");
        
        //background 
        GreenfootImage background = new GreenfootImage("abstract_geometric_triangle_background-wallpaper-1280x720.jpg"); 
        background.setFont(titleFont);
        background.setColor(Color.BLACK); 
        setBackground(background); 
        background.drawImage(title, 400, 100); 
        
        //button  
        words3 = new Button("3 words");
        words4 = new Button("4 words"); 
        words5 = new Button("5 words");
        
        
        addObject(words3, 350, 400); 
        addObject(words4, 650, 400);
        addObject(words5, 950, 400);
        
        
    }
    
    //variable to change the words in each gamemode 
    int x = 0; 
    public void act()
    {
        
        if(words3.touchingCursor())
        {
            x = 3;
            Greenfoot.setWorld(new GameWorld());
        }
        
        if(words3.touchingCursor())
        {
            x = 4;
            Greenfoot.setWorld(new GameWorld());
        }
        
        if(words3.touchingCursor())
        {
            x = 5;
            Greenfoot.setWorld(new GameWorld());
        }
        
    }
    
    
    public int threeWords()
    {
        return x;
    }
    
    public int fourWords()
    {
        return x;
    }
    
    public int fiveWords()
    {
        return x;
    }
    
    
}
