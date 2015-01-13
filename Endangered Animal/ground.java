import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{
    private GreenfootImage ground = new GreenfootImage("brick.png");
    
    public ground()
    {
        ground.scale(150,10);
        setImage(ground);
    }
}
