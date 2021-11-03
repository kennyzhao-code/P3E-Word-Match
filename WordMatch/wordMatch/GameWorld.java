import java.util.ArrayList;
import java.util.HashMap; 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    //label for the score
    Label scoreLabel; 
    public int score = 0; 
    //Hashmap to map the image to the right letter 
    HashMap<Letters, Character> wordStorage = new HashMap<Letters, Character>(); 
    //Queue to check if the word exist 
    Queue<Character> word = new Queue<Character>(); 
    //arraylist to add the objects to the screen 
    ArrayList<Letters> let = new ArrayList<Letters>(); 
    public GameWorld()
    {    
        super(1280, 720, 1);
        
        //adding the ibecjts to the arraylist 
        int x = 400; 
        char[] ch = {'a', 'p', 't', 'r', 'e', 'm', 's', 'b', 'o', 'n', 'w'};
        for(int i = 0; i < 11; i++)
        {
            let.add(new Letters(ch[i]));
        }
        // printing the objetcs onto the screen 
        for(int i = 0; i < 11; i++)
        {
            this.addObject(let.get(i), x , 300); 
            x = x + 50; 
        }
        
        //storing objects into the hashmap
        for(int i = 0; i < 11; i++)
        {
            wordStorage.put(let.get(i), ch[i]); 
        }
        
        //adding the scorelabel 
        scoreLabel = new Label(0, 80); 
        addObject(scoreLabel,50,50); 
        
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score); 
    }
    
    public void act()
    {
        int x =  100; 
        int y = x + 50; 
        //
        if(Greenfoot.mouseClicked(let.get(0)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(0))); 
            
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
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(1))); 

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
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(2))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(3)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(3))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(4)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(4))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(5)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(5))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(6)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(6))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(7)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(7))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(8)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(8))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(9)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(9))); 
            
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
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(10)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(10))); 
            
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
        
        //add the reader here 
        if(word.size() == 3)
        {
            char[] compare = new char[3]; 
            for(int i = 0; i < 3 ; i++ )
            {
                compare[i] = word.dequeue(); 
            }
            
            if((String.valueOf(compare)).equals("art"))
            {
                increaseScore();             
            }
            
        }
        
    }

}
