import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Mr.Cohen 
 * @version SPRING SEMESTER 2021
 */
public class Button extends Actor
{
    public static final double FONT_RATIO = 0.45;
    
    private boolean touching;
    
    private String myText;

    private int drawX;
    private int drawY;
    
    private GreenfootImage image;
    private GreenfootImage touchingImage; 
    
    // Set up a 18-pt, bold Courier New font for drawing text onto my Button
    private Font buttonFont = new Font("Calibri",  false,  true,  30);
    private Color peach = new Color(248, 232, 212); 

    public Button (String text) {
        image = new GreenfootImage (220, 70);
        touchingImage = new GreenfootImage (220, 50);
        myText = text;
        int wordLength = myText.length();  
        int wordWidth = (int)(wordLength * buttonFont.getSize() * FONT_RATIO); 
        drawX = (image.getWidth() - wordWidth)/2;
        drawY = 40;
        draw();
        setImage (image);
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this) == true)
        {
           touching = true;
        }
        else {
   
            touching = false;
        }
    }    
    
    public boolean touchingCursor(){
        return touching;
    }
    
    private void draw () {
      
        image.setColor(peach);
        image.fill();
        image.setColor(Color.BLACK);
        image.setFont (buttonFont);
        image.drawString (myText, drawX, drawY);

        touchingImage.setColor(Color.GRAY);
        touchingImage.fill();
        touchingImage.setColor(Color.BLACK);
        touchingImage.setFont (buttonFont);
        touchingImage.drawString (myText, drawX, drawY);
    }   
}
