import java.util.ArrayList;
import java.util.HashMap; 
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * Game world class for 3 words 
 */

public class GameWorld extends World
{
    //label for the game 
    Label scoreLabel;
    Label timerLabel;
    Label multiplier; 
    Label letterx; 
    Label timeLeft;
    Label scoreLeft;
    
    
    //score counter 
    public int score = 0; 
    
    //mutiplier 
    public int mul = 1; 
    
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
        
        //bg of the map
        GreenfootImage background = new GreenfootImage("texture_wooden_wood_153268_1280x720.jpg"); 
        setBackground(background); 
        //create new arrayList based off difficulty
        try 
        {
            Reader.readInto(ChoosingGamemodes.numberWords());
        }
        catch (Exception e)
        {
            
        }
         
        int r = 370; 
        int p = 370; 
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char firstChar = ch[Greenfoot.getRandomNumber(27)];
        char secondChar = ch[Greenfoot.getRandomNumber(27)];
        char thirdChar = ch[Greenfoot.getRandomNumber(27)];
        char[] realChars = {firstChar, secondChar, thirdChar}; 
         
        //adding the objects to the arraylist
        for(int i = 0; i < 3; i++)
        {
            let.add(new Letters(realChars[i])); 
        }
        
        // printing the objetcs onto the screen 
        for(int i = 0; i < 3; i++)
        {
            this.addObject(let.get(i), r , 500); 
            r = r + 55; 
        }
        
        //storing objects into the hashmap
        for(int i = 0; i < 3; i++)
        {
            wordStorage.put(let.get(i), realChars[i]); 
        }
        
        //hashamap to store all the positions of every single letter 
        for(int i = 0; i < 3; i++) 
        {
            pos.put(let.get(i), p);
            p = p + 55; 
        }
        
        //adding in the valid words into the array 
        valid = Reader.readThree(firstChar, secondChar, thirdChar);
        check(); 
        
        //adding the scorelabel 
        scoreLabel = new Label(0, 80); 
        timerLabel = new Label(15, 80); 
        multiplier = new Label(1,60); 
        letterx = new Label(" Multiplier: x", 50); 
        timeLeft = new Label("Time Left: ", 80);
        scoreLeft = new Label("Score:", 80); 
        
        addObject(letterx, 650, 600);
        addObject(multiplier, 800, 600); 
        addObject(scoreLabel,260,50); 
        addObject(timerLabel,1200, 50);
        addObject(timeLeft, 975, 50);
        addObject(scoreLeft,125, 50 ); 
    }
    
    public void check()
    {
        for(int i = 0; i < valid.size(); i++)
        {
            System.out.println(valid.get(i)); 
        }
    }
    //method to increase multiplier 
    public void increaseMultiplier()
    {
        mul++; 
        multiplier.setValue(mul); 
    }
    
    //returns what the multiplier is (used for the increaseScore method)
    public int curMul()
    {
        return mul; 
    }
    
    //method to reset multiplier 
    public void resetMultiplier()
    {
        mul = 1; 
        multiplier.setValue(mul); 
    }
    
    //method to increase the score 
    public void increaseScore()
    {
        int curMultiplier = curMul();
        int baseScore = 1; 
        score = score + (baseScore * curMultiplier); 
        scoreLabel.setValue(score); 
    }
    
    //medthod that returns the score for the end screen 
    public int score()
    {
        return score; 
    }
    
    //method that moves the letters 
    public void move(int a, int b, int c) 
    {
         if(Greenfoot.mouseClicked(let.get(a)))
        {
            //variables for changing the location 
            int x =  556; 
            int y = x + 55; 
            int z = 300; 
            
            GreenfootImage image = new GreenfootImage("check mark.png", 20, null, null);
            image.drawImage(image, 500,500); 
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(a))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(a))); 
            //adding letter to array to track to return 
            position.add(let.get(a)); 

            if((let.get(b)).getX() != x && (let.get(c)).getX() != x)
            {
                let.get(a).setLocation(x, z); 
            }
            
            else if((let.get(b)).getX() != y && (let.get(c)).getX() != y)
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
        move(0,1,2);
        move(1,0,2);
        move(2,1,0); 
        
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
                        (position.get(i)).setLocation(posi.dequeue(), 500);                     
                    }
                    position.clear(); 
                    int in = valid.indexOf((String.valueOf(compare))); 
                    valid.remove(in);   
                    increaseMultiplier(); 
                    
                }
            
            else{
                for(int i = 0; i < 3; i++)
                {
                    (position.get(i)).setLocation(posi.dequeue(), 500);                     
                }
                position.clear(); 
                resetMultiplier(); 
            }
            
        }
        
    
    
    }

}