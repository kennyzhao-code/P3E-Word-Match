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

    public Letters(char a)
    {
        String[] b = {"a.png", "b.png","c.png","d.png","e.png","f.png","g.png","h.png","i.png","j.png","k.png","l.png","m.png","n.png","o.png","p.png","q.png","r.png","s.png","t.png","u.png","v.png","w.png","x.png","y.png","z.png"};        
        //An array of the images of letters
        HashMap<Character, GreenfootImage> letters = new HashMap<Character, GreenfootImage>(); 
        //A hashmap to relate the image with the char value
        for(int i = 0; i < 26; i++) //put all images along with the respective character
        {
            letters.put(b[i].charAt(0), new GreenfootImage(b[i])); 
        }
        setImage(letters.get(a)); //set this actor's image to its respective letter 
    }
}
