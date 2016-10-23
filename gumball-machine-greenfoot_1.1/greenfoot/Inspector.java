import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Inspector class is used for validating the coin inserted by the user in the gumball machine and perform specific actions based on that.
 * @author Sagar Mane 
 * @version 1.1
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public int inspect(Actor p)
    {
        int random;
        int flag=0;
        //validating the coin
        if(p.toString().subSequence(0,7).equals("Quarter"))
        {
            flag=1; 
        }
        if(p.toString().subSequence(0,5).equals("Penny"))
        {
            flag=2;
        }
        if(p.toString().subSequence(0,11).equals("FakeQuarter"))
        {
            flag=3;
        }
        return flag;
    }
}
