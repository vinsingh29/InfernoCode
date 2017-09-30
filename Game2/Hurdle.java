import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hurdle extends Actor
{
   
    
   int Hur_Speed = -4;
    public void act() 
    {
       
        
       setLocation(getX() + Hur_Speed, getY());
        
        
        
        //setLocation(getX()+ Greenfoot.getRandomNumber(5)-1, getY() + Greenfoot.getRandomNumber(40)-20);


    }    
}
