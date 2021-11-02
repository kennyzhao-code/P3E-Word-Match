
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class InstructionWorld extends World
{
    Color beige = new Color(224, 171, 113); 
    Font titleFont = new Font("Calibri", true, false, 40);
    Font textFont = new Font("Calibri", false, false, 25);
    Button back; 
    public InstructionWorld()
    {    
        super(1280, 720, 1); 
        GreenfootImage background = new GreenfootImage(1280, 720);
        back = new Button("Back"); 
        background.setColor(beige);  
        background.fill(); 
        background.setFont(titleFont); 
        background.setColor(Color.BLACK); 
        background.drawRect(200, 100, 880, 520); 
        background.setColor(Color.WHITE); 
        background.fillRect(201, 101, 879, 519);
        background.setColor(Color.BLACK);
        background.drawString("Instructions", 230, 170);
        background.setFont(textFont); 
        background.drawString("1. Choose your difficulty and you will a series of letters", 230, 250);
        background.drawString("2. These letters are anagrams (can make up words) ", 230, 300);
        background.drawString("3. Try to make all the possible word combinations", 230, 350);
        background.drawString("4. Try to beat the highest difficulty", 230, 400);
        background.drawString("5. Have fun!", 230, 450);
        addObject(back, 900, 520); 
        setBackground(background);
    }
    public void act()
    {
        if(back.touchingCursor() == true)
        {
            Greenfoot.setWorld(new WelcomeWorld());
        }
    }
}
