import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Sagar Mane
 * @version 1.1
 * Removes the ball from the world after clicking on the ball.
 */
public class RedGumball extends Gumball
{
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            GumballMachine.haveball=false;
            GumballMachine.hascoin=false;
        }
    }    
}
