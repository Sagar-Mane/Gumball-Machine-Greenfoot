import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GreenPicker is used for dispensing GreenGumball to the user. 
 * @author Sagar Mane 
 * @version 1.1
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void pick(World w)
    {
        ShowMessage msg=new ShowMessage();
        ShowMessage msg1=new ShowMessage();
        w.addObject(new GreenGumball(),370,400);
        msg.display("Enjoy your Gumball");
        w.addObject(msg,380,450);
        msg1.display("You got a green gumball");
        w.addObject(msg1, 686, 454);
        GumballMachine.haveball=true;
    }
}
