import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//THIS IS NOT OUR CLASS, THIS IS FROM ICS3U1 LAST YEAR MR COHEN CLASS. ALL CREDIT GOES TO HIM. ONLY PART CHANGED WAS THE COLOR AND FONT  

/**
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
    private Font boldFont = new Font("Calibri",  true,  true,  31);
    private Color peach = new Color(248, 232, 212); 
    private Color orange = new Color(255, 153, 51); 

    public Button (String text) {
        image = new GreenfootImage (220, 70);
        touchingImage = new GreenfootImage (220, 70);
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
        if(Greenfoot.mouseMoved(this))
        {
            setImage(touchingImage); 
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage(image); 
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

        touchingImage.setColor(orange);
        touchingImage.fill();
        touchingImage.setColor(Color.BLACK);
        touchingImage.setFont (boldFont);
        touchingImage.drawString (myText, drawX, drawY);
    }   
}
