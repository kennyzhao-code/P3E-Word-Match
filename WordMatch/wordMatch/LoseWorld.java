import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseWorld extends World
{

    Color beige = new Color(224, 171, 113); 
    Font titleFont = new Font("Calibri", true, false, 60);
    Font textFont = new Font("Calibri", false, false, 25);
    Button playAgain;
    Button quit;
    public LoseWorld()
    {    
        super(1280, 720, 1); 
        GreenfootImage background = new GreenfootImage(1280, 720);
        playAgain = new Button("Play Again");
        quit = new Button("Quit");
        background.setColor(beige);  
        background.fill(); 
        background.setFont(titleFont); 
        background.setColor(Color.BLACK); 
        background.drawRect(200, 100, 880, 520); 
        background.setColor(Color.WHITE); 
        background.fillRect(201, 101, 879, 519);
        background.setColor(Color.BLACK);
        background.drawString("You Lost!", 525, 250);
        //add score + high score
        addObject(playAgain, 900, 520);
        addObject(quit, 400, 520); 
        setBackground(background); 
    }
     public void act()
    {
        if(quit.touchingCursor() == true)
        {
            Greenfoot.stop();
        }
        if(playAgain.touchingCursor() == true)
        {
            Greenfoot.setWorld(new WelcomeWorld());
        }
    }
}
