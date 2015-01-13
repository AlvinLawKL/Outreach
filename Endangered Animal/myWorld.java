import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{
    Counter counter = new Counter("Score: ");
    Counter EndangeredAnimal = new Counter("Endangered Animals Caught(5): ");
    private int timer = 0;
    
    public myWorld()
    {    
        super(1000, 600, 1);
        setPaintOrder(ScoreBoard.class, Counter.class);
        addObject(new ground(), 300, 200);
        addObject(new ground(), 800, 200);
        addObject(new ground(), 550, 500);
        addObject(new ground(), 550, 300);
        addObject(new ground(), 550, 100);
        addObject(new ground(), 300, 400);
        addObject(new ground(), 800, 400);
        addObject(new ground(), 0, 600);
        addObject(new floor(), 500, 600);
        addObject(new human(), 550, 270);
        
        addObject(counter, 100, 560); 
        addObject(EndangeredAnimal, 800, 560);
    }
    
    public void act()
    {
       if (timer % 100 == 0)
       {
           if (Greenfoot.getRandomNumber(6) == 0)
           {
               addObject(new dolphin(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
           else if (Greenfoot.getRandomNumber(6) == 1)
           {
               addObject(new polarBear(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
           else if (Greenfoot.getRandomNumber(6) == 2)
           {
               addObject(new elephant(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
           else if (Greenfoot.getRandomNumber(6) == 3)
           {
               addObject(new pig(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
           else if (Greenfoot.getRandomNumber(6) == 4)
           {
               addObject(new sheep(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
           else if (Greenfoot.getRandomNumber(6) == 5)
           {
               addObject(new alligator(), 0, Greenfoot.getRandomNumber(getHeight()));
               timer++;
           }
       }
       else
       {
           timer ++;
       }
    }
    
    public void EndangeredAnimalCaught()
    {
        EndangeredAnimal.add(1);
    }
    
    public void addScore() {
        counter.add(20);
    }
    
    public void subtractScore() {
        counter.subtract(10);
    }
    
    public int getValue() {
        return counter.getValue();
    }
}
