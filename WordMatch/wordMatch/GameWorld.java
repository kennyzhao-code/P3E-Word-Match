import java.util.ArrayList;
import java.util.HashMap; 
import java.util.*;
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
    Label timerLabel;
    
    //score counter 
    public int score = 0; 
    
    //Hashmap to map the image to the right letter 
    HashMap<Letters, Character> wordStorage = new HashMap<Letters, Character>(); 
    //Queue to check if the word exist 
    Queue<Character> word = new Queue<Character>(); 
    //arraylist to add the objects to the screen 
    ArrayList<Letters> let = new ArrayList<Letters>();
    
    //Hashmap to store the positions of each letter 
    HashMap<Letters, Integer> pos = new HashMap<Letters, Integer>(); 
    //Queue to put store and return back the positions of each integer 
    Queue<Integer> posi = new Queue<Integer>();  
    //Arraylist to store which letters where selected for returning
    ArrayList<Letters> position = new ArrayList<Letters>();
    
    //Arraylist that adds the valid words to check if a user gets it right
    List<String> valid;
    
    //timer for the game 
    public int time = 15;
    SimpleTimer timer = new SimpleTimer(); 
    int counter = 0; 
    
    public GameWorld()
    {    
        super(1280, 720, 1);
        
        //adding the objects to the arraylist 
        int x = 400; 
        int p = 400; 
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
        
        //hashamap to store all the positions of every single letter 
        for(int i = 0; i < 11; i++ ) 
        {
            pos.put(let.get(i), p);
            p = p + 50; 
        }
        
        //adding in the valid words into the array 
        String[] array = {"apt", "pat", "tap", "are", "ear", "era", "arm", "mar", "ram", "art","rat","tar","asp","pas","sap","spa","ate","eat","eta","tea","bat","stab","tab","now","own","won","opt","pot","top"};
        valid = new ArrayList(Arrays.asList(array));
        
        //adding the scorelabel 
        scoreLabel = new Label(0, 80); 
        timerLabel = new Label(15, 80); 
        addObject(scoreLabel,50,50); 
        addObject(timerLabel,1050, 50);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score); 
    }
    
    public void act()
    {
       
        int x =  300; 
        int y = x + 50; 
        int z = 500;   
        //
         
         
        if(timer.stopWatch() > 1000 && counter <= time + 1)
            {
                timerLabel.setValue(time - counter); 
                timer.startStopWatch();
                counter++; 
            } 

        
        if(counter > time + 1 && score >= 1)
        {
            Greenfoot.setWorld(new WinWorld()); 
        }
        if(counter > time + 1 && score == 0)
        {
            Greenfoot.setWorld(new LoseWorld()); 
        }
        if(Greenfoot.mouseClicked(let.get(0)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(0))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(0))); 
            //adding letter to array to track to return 
            position.add(let.get(0)); 
            
            if((let.get(1)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(0).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(0).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(0).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(1)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(1))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(1))); 
            //adding letter to array to track to return 
            position.add(let.get(1)); 

            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(1).setLocation(x, z); 
            }
            
            else if((let.get(0)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(1).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(1).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(2)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(2)));
            //adding position to queue 
            posi.enqueue(pos.get(let.get(2))); 
            //adding letter to array to track to return 
            position.add(let.get(2)); 
            
            if((let.get(0)).getX() != x && (let.get(1)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(2).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(0)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(2).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(2).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(3)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(3))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(3))); 
            //adding letter to array to track to return 
            position.add(let.get(3)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(1)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(3).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(0)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(3).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(3).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(4)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(4))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(4))); 
            //adding letter to array to track to return 
            position.add(let.get(4)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(1)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(4).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(0)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(4).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(4).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(5)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(5))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(5))); 
            //adding letter to array to track to return 
            position.add(let.get(5)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(1)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(5).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(0)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(5).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(5).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(6)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(6))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(6))); 
            //adding letter to array to track to return 
            position.add(let.get(6)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(1)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(6).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(0)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(6).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(6).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(7)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(7))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(7))); 
            //adding letter to array to track to return 
            position.add(let.get(7)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(1)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(7).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(0)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(7).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(7).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(8)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(8))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(8))); 
            //adding letter to array to track to return 
            position.add(let.get(8)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(1)).getX() != x && let.get((9)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(8).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(0)).getX() != y && let.get((9)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(8).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(8).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(9)))
        {
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(9))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(9))); 
            //adding letter to array to track to return 
            position.add(let.get(9)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((1)).getX() != x && let.get((10)).getX() != x)
            {
                let.get(9).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((0)).getX() != y && let.get((10)).getX() != y)
            {
                let.get(9).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(9).setLocation(x,z); 
            }
        }
        
        //
        if(Greenfoot.mouseClicked(let.get(10)))
        {
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(10))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(10))); 
            //adding letter to array to track to return 
            position.add(let.get(10)); 
            
            if((let.get(0)).getX() != x && (let.get(2)).getX() != x && (let.get(3)).getX() != x && (let.get(4)).getX() != x && (let.get(5)).getX() != x && (let.get(6)).getX() != x && (let.get(7)).getX() != x && (let.get(8)).getX() != x && let.get((9)).getX() != x && let.get((1)).getX() != x)
            {
                let.get(10).setLocation(x, z); 
            }
            
            else if((let.get(1)).getX() != y && (let.get(2)).getX() != y && (let.get(3)).getX() != y && (let.get(4)).getX() != y && (let.get(5)).getX() != y && (let.get(6)).getX() != y && (let.get(7)).getX() != y && (let.get(8)).getX() != y && let.get((9)).getX() != y && let.get((0)).getX() != y)
            {
                let.get(10).setLocation(y,z);
            }
            
            else
            {
                x = x + 100;
                let.get(10).setLocation(x,z); 
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
            
                if(valid.contains((String.valueOf(compare))))
                    {
                        
                        increaseScore(); 
                        for(int i = 0; i < 3; i++)
                        {
                            (position.get(i)).setLocation(posi.dequeue(), 300);                     
                        }
                        position.clear(); 
                        int in = valid.indexOf((String.valueOf(compare))); 
                        valid.remove(in); 
                        
                        
                    }
            
            else{
                for(int i = 0; i < 3; i++)
                {
                    (position.get(i)).setLocation(posi.dequeue(), 300);                     
                }
                position.clear(); 
            }
            
        }
        
    
    
    }

}
