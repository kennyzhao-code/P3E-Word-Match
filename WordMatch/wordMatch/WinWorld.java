import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */

public class WinWorld extends World
{

    Color beige = new Color(224, 171, 113); 
    Font titleFont = new Font("Calibri", true, false, 60);
    Font textFont = new Font("Calibri", false, false, 25);
    Button playAgain;
    Button quit; //make objects
    public WinWorld()
    {    
        super(1280, 720, 1); 
        GreenfootImage background = new GreenfootImage(1280, 720);
        playAgain = new Button("Play Again");
        quit = new Button("Quit"); //make objects
        background.setColor(beige);  
        background.fill();  //pure beige background
        background.setFont(titleFont); 
        background.setColor(Color.BLACK); 
        background.drawRect(200, 100, 880, 520); 
        background.setColor(Color.WHITE); 
        background.fillRect(201, 101, 879, 519);
        background.setColor(Color.BLACK); //white rectangle with black outline
        background.drawString("You Win!", 525, 250);
        addObject(playAgain, 900, 520);
        addObject(quit, 400, 520); 
        setBackground(background); //set background
        String highText = "High score: "+ GameWorld.myInfo.getScore(); //myInfo from userinfo greenfoot API
        //String scoreText = "Your score: "+ GameWorld.getScore(); //make high score and current score text
        //GreenfootImage score = new GreenfootImage(scoreText, 50, Color.BLACK, Color.WHITE);
        GreenfootImage highScore = new GreenfootImage(highText, 50, Color.BLACK, Color.WHITE);
        background.drawImage(highScore, 525, 350);
        //background.drawImage(score, 525, 300); //draw the high score and current score
    }
     public void act()
    {
        if(quit.touchingCursor() == true)
        {
            Greenfoot.stop(); //quit
        }
        if(playAgain.touchingCursor() == true)
        {
            Greenfoot.setWorld(new WelcomeWorld()); //restart back to welcome world 
        }
    }
}

