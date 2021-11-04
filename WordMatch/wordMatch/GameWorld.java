import java.util.ArrayList;
import java.util.HashMap; 
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWorld extends World
{
    //label for the game 
    Label scoreLabel;
    Label timerLabel;
    Label multiplier; 
    Label letterx; 
    
    
    //score counter 
    public int score = 0; 
    
    //mutiplier 
    public int mul = 0; 
    
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
        int r = 400; 
        int p = 400; 
        char[] ch = {'a', 'p', 't', 'r', 'e', 'm', 's', 'b', 'o', 'n', 'w'};
        for(int i = 0; i < 11; i++)
        {
            let.add(new Letters(ch[i]));
        }
        // printing the objetcs onto the screen 
        for(int i = 0; i < 11; i++)
        {
            this.addObject(let.get(i), r , 300); 
            r = r + 50; 
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
        multiplier = new Label(0,60); 
        letterx = new Label(" Multiplier: x", 50); 
        addObject(letterx, 650, 500);
        addObject(multiplier, 800, 500); 
        addObject(scoreLabel,50,50); 
        addObject(timerLabel,1200, 50);
    }
    
    public void increaseMultiplier()
    {
        mul++; 
        multiplier.setValue(mul); 
    }
    
    //method to increase the score 
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score); 
    }
    
    //medthod that returns the score for the end screen 
    public int score()
    {
        return score; 
    }
    
    //method that moves the letters 
    public void move(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k) 
    {
         if(Greenfoot.mouseClicked(let.get(a)))
        {
            //variables for changing the location 
            int x =  300; 
            int y = x + 50; 
            int z = 500; 
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(a))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(a))); 
            //adding letter to array to track to return 
            position.add(let.get(a)); 

            if((let.get(b)).getX() != x && (let.get(c)).getX() != x && (let.get(d)).getX() != x && (let.get(e)).getX() != x && (let.get(f)).getX() != x && (let.get(g)).getX() != x && (let.get(h)).getX() != x && (let.get(i)).getX() != x && let.get((j)).getX() != x && let.get((k)).getX() != x)
            {
                let.get(a).setLocation(x, z); 
            }
            
            else if((let.get(b)).getX() != y && (let.get(c)).getX() != y && (let.get(d)).getX() != y && (let.get(e)).getX() != y && (let.get(f)).getX() != y && (let.get(g)).getX() != y && (let.get(h)).getX() != y && (let.get(i)).getX() != y && let.get((j)).getX() != y && let.get((k)).getX() != y)
            {
                let.get(a).setLocation(y,z);
            }
            
            else
            {
                y = y + 50;
                let.get(a).setLocation(x,z); 
            }
        }
    }
    
    //actual game 
    public void act()
    {
        
        //in game timer 
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
        
        //methods for moving all 11 letters 
        move(0,1,2,3,4,5,6,7,8,9,10);
        move(1,0,2,3,4,5,6,7,8,9,10);
        move(2,1,0,3,4,5,6,7,8,9,10);
        move(3,1,2,0,4,5,6,7,8,9,10);
        move(4,1,2,3,0,5,6,7,8,9,10);
        move(5,1,2,3,4,0,6,7,8,9,10);
        move(6,1,2,3,4,5,0,7,8,9,10);
        move(7,1,2,3,4,5,6,0,8,9,10);
        move(8,1,2,3,4,5,6,7,0,9,10);
        move(9,1,2,3,4,5,6,7,8,0,10);
        move(10,1,2,3,4,5,6,7,8,9,0);
        
        //checker for words  
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
                    increaseMultiplier(); 
                    
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