import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * RandomPicker is used to dispense a random gumball. 
 * @author Sagar Mane
 * @version 1.1
 */
public class RandomPicker extends Picker
{
    
    public void act() 
    {
        // Add your action code here.
    }    
    public void pick(World w)
    {
        int choose;
        ShowMessage msg=new ShowMessage();
        ShowMessage msg1=new ShowMessage();
        GumballMachine g=new GumballMachine();
        choose=Greenfoot.getRandomNumber(3);
        switch(choose)
        {
            case 0:
                    w.addObject(new RedGumball(),370,400);
                    msg.display("Enjoy your Gumball");
                    w.addObject(msg,380,450);
                    msg1.display("You got a red gumball");
                    w.addObject(msg1, 643, 104);
                    GumballMachine.haveball=true;
                    break;
            case 1:
                    w.addObject(new GreenGumball(),370,400);
                    msg.display("Enjoy your Gumball");
                    w.addObject(msg,380,450);
                    msg1.display("You got a green gumball");
                    w.addObject(msg1, 643, 104);
                    GumballMachine.haveball=true;
                    break;
            case 2:
                    w.addObject(new BlueGumball(),370,400);
                    msg.display("Enjoy your Gumball");
                    w.addObject(msg,380,450);
                    msg1.display("You got a blue gumball");
                    w.addObject(msg1, 643, 104);
                    GumballMachine.haveball=true;
                    break;
        }
    }
}
