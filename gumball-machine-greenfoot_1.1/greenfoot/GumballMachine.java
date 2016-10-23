import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GumballMachine is used for interacting with the user.
 * 
 * @author Sagar Mane 
 * @version 1.1
 */
public class GumballMachine extends Actor
{
    World w;
    int flag;
    Inspector i=new Inspector();
    int random;
    Picker r=new RandomPicker();
    Picker g=new GreenPicker();
    ShowMessage msg=new ShowMessage();
    static boolean haveball=false;
    static boolean hascoin=false;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        w=getWorld();
        // Add your action code here.
        Actor a=getOneIntersectingObject(Coin.class);
        if(a!=null)
        {
            msg.display("Have Coin");
            w.addObject(msg,367 , 237);
            if(a.getX()>340&&a.getX()<500&&a.getY()>265&&a.getY()<330)
            {
                w.removeObject(a);  //removing coin after intersection.
                msg.display("Turn Crank");
                w.addObject(msg,367 , 237);
                hascoin=true;
                flag=i.inspect(a);  //calling inspector to validate the coin
            } 
        }
        if(Greenfoot.mousePressed(this))
        {
            if(hascoin==false)
            {
                msg.display("You need to insert coin first");
                w.addObject(msg, 367, 237);
            }
            if(haveball==false&&hascoin==true)
            {
            msg.removemsg(w);
            if(flag==1)
            {
                random=Greenfoot.getRandomNumber(2);
            switch(random)
            {
                case 0:
                        r.pick(w);    //pick random gumball
                        break;
                case 1:
                        g.pick(w);     //pick green gumball
                        break;
            }
            }
            if(flag==2)
            {
                msg.display("Its a penny");
                w.addObject(msg, 533, 291);
              //  Greenfoot.delay(80);
              //  msg.removemsg(w);
            }
            if(flag==3)
            {
                msg.display("Fake Quarter");
                w.addObject(msg, 533, 291);
             //   Greenfoot.delay(80);
              //  msg.removemsg(w);
            }
        }
        }
        
            
    }
}

           
        
   

