/**
 * this is the mint method it should only have 1 instance of it (a singleton)
 * 
 * @author Team 1
 *
 */
public abstract class Mint {

    /**
     * 
     * making coin. Factory method USDmint CADmint EURmint GBPmint will implement
     * makeCoin method. only 1 mint. A siglenton
     * 
     * @return a coin object
     */

    public abstract Coin makeCoin(String Type);

    public void inspect(String coin){
                System.out.println("Inspecting the " + coin + " for imperfect impressions");
                System.out.println("This " + coin + " is perfect!");
    }

    public void smooth(String coin){
        System.out.println("Smoothing the rough edges on the " + coin);
        System.out.println("The edges on the " + coin + " are very smooth now!");
    }
    public void buff(String coin){
        System.out.println("Buffing the " + coin + "..");
        System.out.println("It's very shiny now!!");
    }

}
