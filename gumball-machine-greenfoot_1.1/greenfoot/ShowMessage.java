import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * ShowMessage class is used for displaying messages to the user. It has two methods display() and removemsg() which are used for showing a message to the user
 * and removing that message later repectively.
 * @author Sagar Mane 
 * @version 1.1
 */
public class ShowMessage extends Actor
{
    
    public void display(String text)
    {
       
       GreenfootImage img=new GreenfootImage(text,25,Color.WHITE,Color.MAGENTA);
       setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
        }
    }    
     public void removemsg(World w)
    {
        w.removeObjects(w.getObjects(ShowMessage.class));
    }
}
