/**
 * this is an abstract class of coin.
 * 
 * @author Team 1
 *
 */
public abstract class Coin {
    // work
    private String coinName;

    Smelter smelter;

    public Coin(String inCoinName) {
        coinName = inCoinName;

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

    // USD Coins:
    // Dollar
    // HalfDollar
    // Quarter
    // Dime
    // Nickel
    // Penny

    /**
     * might need to change. tells how much the coin cost.
     */
    abstract public void denomination();

    /**
     * might need to change later on. tells what country it came from.
     */
    abstract public void countryCode();

    /**
     * will call the smelter.
     */
    public void performSmelt() {
        smelter.smelt();
    }

    /**
     * just a to string method for testing can change to something else if needed
     * be.
     */
    public String toString() {

        return "I am a: " + coinName;
    }

}
