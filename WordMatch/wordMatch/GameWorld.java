import java.util.ArrayList;
import java.util.HashMap; 
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */

//This is the main world

public class GameWorld extends World
{
    //label for the game 
    Label scoreLabel;
    Label timerLabel;
    Label multiplier; 
    Label letterx; 
    Label timeLeft;
    Label scoreLeft;
    Label wordsDone; 
    
    
    //variables for handling score 
    //Create new userInfo to store High Score
    public static UserInfo myInfo; 
    //score counter 
    public static int score = 0;
    //mutiplier 
    public int mul = 1; 
    
     
    //arraylist to add the objects to the screen 
    ArrayList<Letters> let = new ArrayList<Letters>();

    
    //Data strucutres for changing location of letters 
    //Hashmap to store the positions of each letter 
    HashMap<Letters, Integer> pos = new HashMap<Letters, Integer>(); 
    //Queue to put store and return back the positions of each character
    Queue<Integer> posi = new Queue<Integer>();  
 
    
    //Arraylists for the checker and reader 
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
    //Queue to check if the word exist 
    Queue<Character> word = new Queue<Character>(); 
    //Hashmap to map the image to the right letter 
    HashMap<Letters, Character> wordStorage = new HashMap<Letters, Character>(); 
    //ArrayList to add in already valid words
    ArrayList<String> validWords = new ArrayList<String>(); 
    //variable to control y value of the word
    int correctWordYPosition = 200; 
    int correctWordXPosition = 1100;
     
    //GreenfootSounds for the sound effects
    GreenfootSound right;
    GreenfootSound wrong; 
    GreenfootSound pop; 

    //the Check mark and X mark
    x xmark; 
    check checkMark; 
    
    //bg of the map
    GreenfootImage background = new GreenfootImage("bgfinal.png"); 
    
    
    //variables for timer for the game 
    public int time = 30;
    SimpleTimer timer = new SimpleTimer();  
    int counter = 0; 
    
    public GameWorld()
    {    
        super(1280, 720, 1);
        
        //setting bg picture 
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
        fiveWords = Reader.readNum(5); //create the possible arrays for each difficulty
       
        //get random letters to randomize game and make it fun
        //data structures for the randomizer 
        Character[] chCon = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'}; 
        Character[] chVow = {'a', 'e', 'i', 'o', 'u'};
        ArrayList<Character> consonant = new ArrayList<Character>(Arrays.asList(chCon)); 
        ArrayList<Character> vowel = new ArrayList<Character>(Arrays.asList(chVow)); 
        
        //Array to store the letters that will be present in the game
        //loops to add in the randomly chosen character, making sure there are 3 different vowels 
        ArrayList<Character> letForRan = new ArrayList<Character>(); 
        int numberOfLettersVOW = 5; 
        int numberOfLettersCON = 20; 
        for(int i = 0; i < 4; i++)
        {
            letForRan.add(vowel.remove(Greenfoot.getRandomNumber(numberOfLettersVOW)));
            numberOfLettersVOW--; 
        }
        
        for(int i = 0; i < 7; i++)
        {
            letForRan.add(consonant.remove(Greenfoot.getRandomNumber(numberOfLettersCON)));
            numberOfLettersCON--; 
        }
        
        //randomizing the order of letters in the array 
        char firstChar = letForRan.remove(Greenfoot.getRandomNumber(10));
        char secondChar = letForRan.remove(Greenfoot.getRandomNumber(9));
        char thirdChar = letForRan.remove(Greenfoot.getRandomNumber(8));
        char fourthChar = letForRan.remove(Greenfoot.getRandomNumber(7));
        char fifthChar = letForRan.remove(Greenfoot.getRandomNumber(6));
        char sixthChar = letForRan.remove(Greenfoot.getRandomNumber(5));
        char seventhChar = letForRan.remove(Greenfoot.getRandomNumber(4));
        char eighthChar = letForRan.remove(Greenfoot.getRandomNumber(3));
        char ninthChar = letForRan.remove(Greenfoot.getRandomNumber(2));
        char tenthChar = letForRan.remove(Greenfoot.getRandomNumber(1));
        char eleventhChar = letForRan.remove(0);
        //putting all new letters in a new array for them to be added 
        char[] realChars = {firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar};
        
        //adding the objects to the arraylist
        for(int i = 0; i < 11; i++)
        {
            let.add(new Letters(realChars[i])); 
        }
        
        // printing the objetcs onto the screen 
        int r = 160; 
        int p = 160; 
        for(int i = 0; i < 11; i++)
        {
            this.addObject(let.get(i), r , 575); 
            r = r + 55; 
        }
        
        //storing objects into the hashmap, hashamp for returning the characters back to their original position 
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
        
        //adding in the valid words into the array called valid. It calls the reader method of readThree, readFour or readFive  
      
        valid = Reader.readThree(threeWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        
        if(ChoosingGamemodes.numberWords() == 4)
        {
            valid = Reader.readFour(fourWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        }
        if(ChoosingGamemodes.numberWords() == 5)
        {
            valid = Reader.readFive(fiveWords, firstChar, secondChar, thirdChar, fourthChar, fifthChar, sixthChar, seventhChar, eighthChar, ninthChar, tenthChar, eleventhChar);
        }
        //check marks
        xmark = new x();
        checkMark = new check(); 
        //creating the sound effects
        right = new GreenfootSound("sounds/correct.mp3"); 
        wrong = new GreenfootSound("sounds/wrong.mp3");  
        pop = new GreenfootSound("sounds/pop.mp3"); 
        
        //adding the scorelabel 
        scoreLabel = new Label(0, 80); 
        timerLabel = new Label(30, 80); 
        multiplier = new Label(1,60); 
        letterx = new Label(" Multiplier: x", 50); 
        timeLeft = new Label("Time Left: ", 80);
        scoreLeft = new Label("Score:", 80); 
        wordsDone = new Label("Correct Words", 50); 
        
        //show the labels and scores
        addObject(letterx, 125, 675);
        addObject(multiplier, 275, 675); 
        addObject(scoreLabel,260,50); 
        addObject(timerLabel,1200, 50);
        addObject(timeLeft, 1000, 50);
        addObject(scoreLeft,125, 50 ); 
        addObject(wordsDone, 1100, 150); 
        
        //set score to 0
        score = 0;
        
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
    public static int score()
    {
        return score; 
    }
    //method that moves the letters 
    public void move(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k) 
    {
         if(Greenfoot.mouseClicked(let.get(a)))
        {
            //variables for changing the location 
            int x =  156; 
            int y = x + 55; 
            int z = 300; 
            
            //GreenfootImage image = new GreenfootImage("check mark.png", 20, null, null);
            //image.drawImage(image, 500,500); 
            Greenfoot.playSound("pop.mp3"); 
            
            //adding word to queue 
            word.enqueue(wordStorage.get(let.get(a))); 
            //adding position to queue 
            posi.enqueue(pos.get(let.get(a))); 
            //adding letter to array to track to return 
            position.add(let.get(a)); 
            
            //checks if the first position is clear 
            if((let.get(b)).getX() != x && (let.get(c)).getX() != x && (let.get(d)).getX() != x && (let.get(e)).getX() != x && (let.get(f)).getX() != x && (let.get(g)).getX() != x && (let.get(h)).getX() != x && (let.get(i)).getX() != x && let.get((j)).getX() != x && let.get((k)).getX() != x)
            {
                //set the location to the first position 
                let.get(a).setLocation(x, z); 
            }
            //checks if the second position is clear 
            else if((let.get(b)).getX() != y && (let.get(c)).getX() != y && (let.get(d)).getX() != y && (let.get(e)).getX() != y && (let.get(f)).getX() != y && (let.get(g)).getX() != y && (let.get(h)).getX() != y && (let.get(i)).getX() != y && let.get((j)).getX() != y && let.get((k)).getX() != y)
            {
                //set the location to the second position 
                let.get(a).setLocation(y,z);
            }
            //if both false, set letter to third position 
            else
            {
                //set the location to the third position 
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
        if(word.size() == 3)
        {
            //loop to add the letters the user chose into an array
            char[] compare = new char[3]; 
            for(int i = 0; i < 3 ; i++ )
            {
                compare[i] = word.dequeue(); 
            }
                
            //conver the array into a string and compare it to the valid arraylist and the arraylist of already checked words 
            if(valid.contains((String.valueOf(compare))) && !validWords.contains((String.valueOf(compare))))
            {
                //sounds effects 
                right.setVolume(30); 
                right.play(); 
                //calls increase score method 
                increaseScore(); 
                //adds the valid word to an arraylist so that it will not count again if the user puts it
                //add the valid word onto the screen so the user knows 
                validWords.add(String.valueOf(compare)); 
                addObject(new Label(String.valueOf(compare), 45), correctWordXPosition, correctWordYPosition); 
                correctWordYPosition = correctWordYPosition + 40;
               
                        
                //loop to return the words back to its original position, clear the position arraylist for next word 
                for(int i = 0; i < 3; i++)
                {
                    (position.get(i)).setLocation(posi.dequeue(), 575);                     
                }
                position.clear(); 
                //checker
                int in = valid.indexOf((String.valueOf(compare))); 
                valid.remove(in);   
                //increase the multiplier 
                increaseMultiplier(); 
                
                //add check mark
                addObject(checkMark, 400,300);
                checkMark = new check(); 
            }
                
            else
            {
                //if wrong, play sound effect 
                wrong.setVolume(20); 
                wrong.play(); 

                //loop to return the words back to its original position, clear the position arraylist for next word 
                for(int i = 0; i < 3; i++)
                {
                    (position.get(i)).setLocation(posi.dequeue(), 575);                     
                }
                position.clear(); 
                //reset the multiplier 
                resetMultiplier();
                
                //add red x 
                addObject(xmark, 400,300);
                xmark = new x(); 
                
            }
                
        }
        
        if (UserInfo.isStorageAvailable()) //this is for high score. 
        {
            myInfo = UserInfo.getMyInfo(); //get the server info
            if (myInfo != null)
            {
                if (score > myInfo.getScore()) //if the current score is greater than high score, then store the current score as the new high score. 
                {
                    myInfo.setScore(score);
                    myInfo.store();
                }
            }
        }
        
        /*
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
        */
       
       
    }

}