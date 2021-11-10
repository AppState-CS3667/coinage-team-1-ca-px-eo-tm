import java.util.Random;

/**
 * this is the mint method it should only have 1 instance of it (a singleton)
 * 
 * @author Team 1
 *
 */
public abstract class Mint {

    Random rand = new Random(); //to generate numbers for our failure;

    /**
     * 
     * making coin. Factory method USDmint CADmint EURmint GBPmint will implement
     * makeCoin method. only 1 mint. A siglenton
     * 
     * @return a coin object
     */

    public abstract Coin makeCoin(String Type);

    public boolean inspect(String coin){
        int x = rand.nextInt(12);
        int y = rand.nextInt(12);
                
        System.out.println("Inspecting the " + coin + " for imperfect impressions");
        System.out.println("This " + coin + " is perfect!");

        return (x != y);
    }

    public boolean smooth(String coin){
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);

        System.out.println("Smoothing the rough edges on the " + coin);
        System.out.println("The edges on the " + coin + " are very smooth now!");

        return (x != y);
    }
    public boolean buff(String coin){
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);

        System.out.println("Buffing the " + coin + "..");
        System.out.println("It's very shiny now!!");

        return (x != y);
    }

}
