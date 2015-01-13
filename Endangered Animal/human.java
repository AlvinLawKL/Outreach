import greenfoot.*;

public class human extends Actor
{
    private int speed = 5;
    private int fallingSpeed = 0;
    private int acceleration = 1;
    private int jumpSpeed = 10;
    private int numberOfEndangeredAnimal = 0;
    
    public human()
    {
    }
    
    public void act()
    {
        checkKeys();
        checkFall();
        checkAnimal();
        gameOver();
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        else if (Greenfoot.isKeyDown("space"))
        {
            jump();
        }
    }
    
    public void checkFall()
    {
        if (onGround() || onFloor())
        {
            fallingSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
    public void checkAnimal()
    {
        Actor endangered = getOneObjectAtOffset (0, getImage().getHeight()/2, endangered.class);
        Actor normal = getOneObjectAtOffset (0, getImage().getHeight()/2, normal.class);
        if (endangered != null)
        {
            getWorld().removeObject(endangered);
            ((myWorld) getWorld()).subtractScore();
            ((myWorld) getWorld()).EndangeredAnimalCaught();
            numberOfEndangeredAnimal++;
        }
        else if (normal != null)
        {
            getWorld().removeObject(normal);
            ((myWorld) getWorld()).addScore();
        }
    }
    
    public void gameOver()
    {
        if (numberOfEndangeredAnimal == 5)
        {
            getWorld().addObject(new ScoreBoard(((myWorld) getWorld()).getValue()), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    public void jump()
    {
        fallingSpeed = -jumpSpeed;
        fall();
    }
    
    public void fall()
    {
        setLocation (getX(), getY() + fallingSpeed);
        fallingSpeed = fallingSpeed + acceleration;
    }
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, ground.class);
        return under != null;
    }
    
      public boolean onFloor()
    {
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, floor.class);
        return under != null;
    }
        
}
