import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (Jacky Liang) 
 * @version (12/05/22)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Add your code here
        if(Greenfoot.isKeyDown("left")) {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right")) {
            move(+1);
        }
        
        // Remove apple if elephant eats it
        removeTouching(Apple.class);
    }    
}
