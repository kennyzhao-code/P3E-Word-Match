import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap; 
/**
 * Creates the letter objects which are images of letters. 
 * 
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */
public class Letters extends Actor
{
    GreenfootImage tempImage;
    GreenfootImage largeImage; 
    GreenfootImage ogImage; 
    HashMap<Character, GreenfootImage> letters;
    HashMap<Character, GreenfootImage> largeLetters;
    char thisChar; 
    public Letters(char a)
    {
        String[] b = {"a.png", "b.png","c.png","d.png","e.png","f.png","g.png","h.png","i.png","j.png","k.png","l.png","m.png","n.png","o.png","p.png","q.png","r.png","s.png","t.png","u.png","v.png","w.png","x.png","y.png","z.png"};        
        
        //An array of the images of letters
        letters = new HashMap<Character, GreenfootImage>(); 
        largeLetters = new HashMap<Character, GreenfootImage>(); 
        //A hashmap to relate the image with the char value
        for(int i = 0; i < 26; i++) //put all images along with the respective character
        {
            letters.put(b[i].charAt(0), new GreenfootImage(b[i])); 
        }
        for(int i = 0; i < 26; i++) //put all images along with the respective character
        {
            tempImage = new GreenfootImage(b[i]);
            tempImage.scale(60, 60); 
            largeLetters.put(b[i].charAt(0), tempImage); 
        }
         //set this actor's image to its respective letter 
        ogImage = letters.get(a);
        setImage(ogImage);
        largeImage = largeLetters.get(a);  
    }
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage(largeImage); 
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage(ogImage); 
        }
    }
}
