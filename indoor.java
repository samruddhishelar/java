package game;
public class Indoor
{
    String game;
    String players;
    public Indoor()
    {
        game = "Chess";
        players = "Rahul, Amit";
    }
    public Indoor(String game, String players)
    {
        this.game = game;
        this.players = players;
    }
    public void display()
    {
        System.out.println("Indoor Game : " + game);
        System.out.println("Players     : " + players);
    }
}


package game;
public class Outdoor
{
    String game;
    String players;
    public Outdoor()
    {
        game = "Cricket";
        players = "Rohit, Virat, Rahul";
    }
    public Outdoor(String game, String players)
    {
        this.game = game;
        this.players = players;
    }
    public void display()
    {
        System.out.println("Outdoor Game : " + game);
        System.out.println("Players      : " + players);
    }
}


import game.*;
class GameDemo
{
    public static void main(String args[])
    {
    	
        Indoor i1 = new Indoor();
        Outdoor o1 = new Outdoor();
        System.out.println("Using Default Constructor:");
        i1.display();
        o1.display();

       
        Indoor i2 = new Indoor("Carrom", "Amit, Sumit");
        Outdoor o2 = new Outdoor("Football", "Rahul, Raj, Ajay");
        i2.display();
        o2.display();
    }
}