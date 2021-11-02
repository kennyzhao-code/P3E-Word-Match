
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

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    ArrayList<String> lol = new ArrayList<String>(); 
    public GameWorld()
    {    
        super(1280, 720, 1);
        try
        {
            Reader.readInto(3); 
            lol = Reader.readThree('O', 'N', 'E'); 
            
        }
        catch(Exception e)
        {
        }
        System.out.println(lol.size()); 
        for(int i = 0; i < lol.size(); i++)
         {
            System.out.println(lol.get(i)); 
         } 
        
    }
    
    public void act()
    {
    }

}
