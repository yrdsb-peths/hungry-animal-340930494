import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Creates the elephant object
        Elephant elephant1 = new Elephant();
        addObject(elephant1, 300, 300);
        //Create a label
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 15, 20);
        
        //Creates the apple object
        spawnApple();
    }
    
    /**
     * Ends the game and creates "GameOver"
     */
    
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score method
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0) {
            level++;
        }
    }
    
    /**
     * Create a new apple at random location at the top of screen
     */
    public void spawnApple() {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);    
    }
    
}