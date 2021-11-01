import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap; 
/**
 * Write a description of class Letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letters extends Actor
{
    /**
     * Act - do whatever the Letters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Letters(char a)
    {
        String[] b = {"a.png", "b.png","c.png","d.png","e.png","f.png","g.png","h.png","i.png","j.png","k.png","l.png","m.png","n.png","o.png","p.png","q.png","r.png","s.png","t.png","u.png","v.png","w.png","x.png","y.png","z.png"};        
        HashMap<Character, GreenfootImage> letters = new HashMap<Character, GreenfootImage>(); 
        for(int i = 0; i < 26; i++)
        {
            letters.put(b[i].charAt(0), new GreenfootImage(b[i])); 
        }
        setImage(letters.get(a)); 
    }
    public void act()
    {
        // Add your action code here.
    }
}
