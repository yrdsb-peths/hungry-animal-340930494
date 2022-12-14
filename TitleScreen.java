import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (Jacky Liang) 
 * @version (12/13/22)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /*
     * The main world act loop
     */
    public void act() {
        // Starts game if user presses the space bar
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        titleLabel.setLocation(300,60);
        Elephant elephant = new Elephant();
        addObject(elephant,506,60);
        Label label = new Label("Use \u2190 \u2192to Move", 40);
        addObject(label,300,240);
        elephant.setLocation(311,150);
        Label label2 = new Label("Press <space> to Start", 30);
        addObject(label2,297,321);
    }
}
