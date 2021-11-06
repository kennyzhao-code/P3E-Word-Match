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
    //Arraylist for words that fit the 3 letters of words
    ArrayList<String> threeWords = new ArrayList<String>();
    //Arraylist for words that fit the 4 letters of words
    ArrayList<String> fourWords = new ArrayList<String>();
    //Arraylist for words that fit the 5 letters of words
    ArrayList<String> fiveWords = new ArrayList<String>();
    //Arraylist that adds the valid words to check if a user gets it right
    ArrayList<String> valid;
    
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
            Reader.readInto();
        }
        catch (Exception e)
        {
            
        }
        threeWords = Reader.readNum(3); 
        fourWords = Reader.readNum(4);
        fiveWords = Reader.readNum(5);
        int r = 370; 
        int p = 370; 
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char firstChar = ch[Greenfoot.getRandomNumber(25)];
        char secondChar = ch[Greenfoot.getRandomNumber(25)];
        char thirdChar = ch[Greenfoot.getRandomNumber(25)];
        char fourthChar = ch[Greenfoot.getRandomNumber(25)];
        char fifthChar = ch[Greenfoot.getRandomNumber(25)];
        char sixthChar = ch[Greenfoot.getRandomNumber(25)];
        char seventhChar = ch[Greenfoot.getRandomNumber(25)];
        char eighthChar = ch[Greenfoot.getRandomNumber(25)];
        char ninthChar = ch[Greenfoot.getRandomNumber(25)];
        char tenthChar = ch[Greenfoot.getRandomNumber(25)];
        char eleventhChar = ch[Greenfoot.getRandomNumber(25)];
        char[] realChars = {firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar};
        
        //adding in the valid words into the array 
        if(ChoosingGamemodes.numberWords() == 3)
        {
            valid = Reader.readThree(threeWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        }
        if(ChoosingGamemodes.numberWords() == 4)
        {
            valid = Reader.readFour(fourWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        }
        if(ChoosingGamemodes.numberWords() == 5)
        {
            valid = Reader.readFive(fiveWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        }
        
        //adding the objects to the arraylist
        for(int i = 0; i < 11; i++)
        {
            let.add(new Letters(realChars[i])); 
        }
        
        // printing the objetcs onto the screen 
        for(int i = 0; i < 11; i++)
        {
            this.addObject(let.get(i), r , 500); 
            r = r + 55; 
        }
        
        //storing objects into the hashmap
        for(int i = 0; i < 11; i++)
        {
            wordStorage.put(let.get(i), realChars[i]); 
        }
        
        //hashamap to store all the positions of every single letter 
        for(int i = 0; i < 11; i++) 
        {
            pos.put(let.get(i), p);
            p = p + 55; 
        }
        
         
        
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
    public void move(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k) 
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
        
        //checker for words + this is the only part that isnt working as  need to make it if word size == into 4 and 5  
        if(ChoosingGamemodes.numberWords() == 3)
        {
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
        if(ChoosingGamemodes.numberWords() == 4)
        {
            if(word.size() == 4)
            {
                char[] compare = new char[4]; 
                for(int i = 0; i < 4 ; i++ )
                {
                    compare[i] = word.dequeue(); 
                }
                
                if(valid.contains((String.valueOf(compare))))
                    {
                            
                        increaseScore(); 
                        for(int i = 0; i < 4; i++)
                        {
                            (position.get(i)).setLocation(posi.dequeue(), 500);                     
                        }
                        position.clear(); 
                        int in = valid.indexOf((String.valueOf(compare))); 
                        valid.remove(in);   
                        increaseMultiplier(); 
                        
                    }
                
                else{
                    for(int i = 0; i < 4; i++)
                    {
                        (position.get(i)).setLocation(posi.dequeue(), 500);                     
                    }
                    position.clear(); 
                    resetMultiplier(); 
                }
                
            }
        }
        if(ChoosingGamemodes.numberWords() == 5)
        {
            if(word.size() == 5)
            {
                char[] compare = new char[5]; 
                for(int i = 0; i < 5 ; i++ )
                {
                    compare[i] = word.dequeue(); 
                }
                
                if(valid.contains((String.valueOf(compare))))
                    {
                            
                        increaseScore(); 
                        for(int i = 0; i < 5; i++)
                        {
                            (position.get(i)).setLocation(posi.dequeue(), 500);                     
                        }
                        position.clear(); 
                        int in = valid.indexOf((String.valueOf(compare))); 
                        valid.remove(in);   
                        increaseMultiplier(); 
                        
                    }
                
                else{
                    for(int i = 0; i < 5; i++)
                    {
                        (position.get(i)).setLocation(posi.dequeue(), 500);                     
                    }
                    position.clear(); 
                    resetMultiplier(); 
                }
                
            }
        }
    
    }

}