------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------
PROJECT TITLE: Word Match!
------------------------------------------------------------------------
PURPOSE OF PROJECT: It is a game that give you multiple letters in order for you to match words up to gain points. Try to beat the time as well as your high score!
VERSION or DATE: October 9th 2021
------------------------------------------------------------------------
HOW TO START THIS PROJECT: With Greenfoot and start the game world.
------------------------------------------------------------------------
AUTHORS: Ethan Woo and Kenny Zhao
USER INSTRUCTIONS: 

Start the Greenfoot project and click on one of the buttons. If you would like to look at the instructions, go ahead and click the instructions
button. After that read the instructions and click back to go back to the main screen. Then, click play and it will bring you to difficulty select. That will lead you
to 3 buttons that will select the difficulty. Click desired difficulty and start the game. 

The actual game: Click on the row of letters given to you at the bottom and try to create a word. A sound effect and a check mark or a x mark will pop up if you get a 
correct letter or a wrong letter. The difficulty that you selected will be the length of the word. The more you get in a row, the more points you will get since there
is a multiplier that will ensure that you will get more points if you get more correct consecutively. There is also a time limit which will signify the end of the game. 

Once the game has ended, you will be brought to a win or lose screen that will tell you your score and high score. Try your best to beat your high score on the highest 
difficulty as you can select play again or quit the game. Play again will bring you back to the original world when you first start the game. Do not worry, your high
score is still kept. 
------------------------------------------------------------------------
DATA STRUCTURES: 
- Array: to keep randomized letters, constanants and vowels. As well as to keep a list of all names of image files (GameWorld, Letters)  
- ArrayList: To keep valid words, words of correct letters, words of correct length, the position of words, the objects on screen, constanants and vowels (GameWorld) 
- HashMap: To store position of each letter, to map each character of the alphabet to its letter picture (GameWorld, Letters)
- Queues: To put store and return back the positions of each character (GameWorld) 
------------------------------------------------------------------------
