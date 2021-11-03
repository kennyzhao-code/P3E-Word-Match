<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap; 
=======
import java.util.HashMap; 
import java.util.ArrayList;
>>>>>>> Reader
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList; 
/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GameWorld extends World
{

<<<<<<< HEAD
    ArrayList<Letters> let = new ArrayList<Letters>(); 
    public GameWorld()
    {    
        super(1280, 720, 1);
        
        int x = 400; 
        char[] ch = {'a', 'p', 't', 'r', 'e', 'm', 's', 'b', 'o', 'n', 'w'};
        for(int i = 0; i < 11; i++)
        {
            let.add(new Letters(ch[i]));
        }
        
        for(int i = 0; i < 11; i++)
        {
            this.addObject(let.get(i), x , 300); 
            x = x + 50; 
        }
=======
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    ArrayList<Letters> lett = new ArrayList<Letters>();
    public GameWorld()
    {    
        super(1280, 720, 1);
        int x = 100; 
        //Stores the letters for 3 words 
        char[] lets = {'a','p','t','r','e','m','s','b','o','w','n'};
        for(int i = 0; i < 11; i++)
        {
            lett.add(new Letters(lets[i]));
        }
        
        for(int i = 0; i < 11; i++)
        {
            addObject(lett.get(i), x, 100); 
            x = x + 50; 
        }
        

>>>>>>> Reader
        
    }
    
    public void act()
    {
<<<<<<< HEAD
        int x =  100; 
        int y = x + 50; 
        //
        if(Greenfoot.mouseClicked(let.get(0)))
        {
            if((let.get(1)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(0).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(0).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(0).setLocation(x,300); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(1)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(1).setLocation(x, 300); 
            }
            
            else if((let.get(0)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(1).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(1).setLocation(x,300); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(2)))
        {
            if((let.get(0)).getX() != x && (let.get(1)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(2).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(0)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(2).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(2).setLocation(x,300); 
=======
        HashMap<Letters, String> let = new HashMap<Letters, String>(); 
        Queue<Character> ans = new Queue<Character>(); 
        
        int k = 100; 
        int o = 50; 
        /*
        if(Greenfoot.mouseClicked(lett.get(0)))
        {
            
            if(intersects(lett.get(1)) == false)
            {
                lett.get(0).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(0).setLocation(k, 500); 
            }
        }
        
        
        if(Greenfoot.mouseClicked(lett.get(1)))
        {
            if(lett.get(0).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(1).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(1).setLocation(k, 500); 
            }
        }
        
        /*
        if(Greenfoot.mouseClicked(lett.get(2)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k  && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(2).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(2).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(3)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(1)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(3).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(0)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(3).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(3).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(3)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k  && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(3).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(3).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(4)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(1)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(4).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(0)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(4).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(4).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(4)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k  && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(4).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(4).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(5)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(1)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(5).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(0)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(5).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(5).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(5)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k  && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(5).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(5).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(6)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(1)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(6).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(0)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(6).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(6).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(6)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k  && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(6).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(6).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(7)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(1)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(7).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(0)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(7).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(7).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(7)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k  && lett.get(8).getX() != k && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(7).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(7).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(8)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(1)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(8).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(0)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(8).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(8).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(8)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k  && lett.get(9).getX() != k && lett.get(10).getX() != k)
            {
                lett.get(8).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(8).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(9)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((1)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(9).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((0)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(9).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(9).setLocation(x,300); 
=======
        if(Greenfoot.mouseClicked(lett.get(9)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k  && lett.get(10).getX() != k)
            {
                lett.get(9).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(9).setLocation(k, 500); 
>>>>>>> Reader
            }
        }
        
        //
<<<<<<< HEAD
        if(Greenfoot.mouseClicked(let.get(10)))
        {
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((1)).getX() != x)
            {
                let.get(10).setLocation(x, 300); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((0)).getX() != y)
            {
                let.get(10).setLocation(y,300);
            }
            
            else
            {
                x = x + 100;
                let.get(10).setLocation(x,300); 
            }
        }
=======
        if(Greenfoot.mouseClicked(lett.get(10)))
        {
            if(lett.get(0).getX() != k && lett.get(1).getX() != k && lett.get(2).getX() != k && lett.get(3).getX() != k && lett.get(4).getX() != k && lett.get(5).getX() != k && lett.get(6).getX() != k && lett.get(7).getX() != k && lett.get(8).getX() != k && lett.get(9).getX() != k )
            {
                lett.get(10).setLocation(k,500); 
            }
            else{
                k = k + o;
                lett.get(10).setLocation(k, 500); 
            }
        }
    */
        
     
>>>>>>> Reader
        
    }

}
