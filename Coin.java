/**
 * this is an abstract class of coin.
 * 
 * @author Team 1
 *
 */
public abstract class Coin {

    private String coinName;
    private String countryCode;
    private double denomination;

    Smelter smelter;

    public Coin(String inCoinName, String cc, double denom) {
        coinName = inCoinName;
        countryCode = cc;
        denomination = denom;

    }

    /**
     * not sure if this is correct will need to double check the con. will take in
     * the name...
     * 
     * @return the coin
     */
    public String getCoinName() {
        return coinName;
    }

    /**
     * might need to change. tells how much the coin cost.
     */
    public double denomination(){
        return denomination;
    }

    /**
     * might need to change later on. tells what country it came from.
     */
    public String countryCode(){
        return countryCode;
    }

    /**
     * will call the smelter.
     */
    public void performSmelt() {
        Smelter.smelt(coinName);
    }

    /**
     * just a to string method for testing can change to something else if needed
     * be.
     */
    public String toString() {

        return "I am a: " + coinName;
    }

}
