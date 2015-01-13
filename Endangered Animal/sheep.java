import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sheep extends normal
{
    /**
     * Act - do whatever the sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if (getX() >= getWorld().getWidth() - getImage().getWidth()/2)
        {
            getWorld().removeObject(this);
        }
    }    
}
