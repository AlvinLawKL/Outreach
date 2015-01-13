import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class floor extends Actor
{
    private GreenfootImage floor = new GreenfootImage("brick.png");
    
    public floor()
    {
        floor.scale(1000,10);
        setImage(floor);
    }  
}
