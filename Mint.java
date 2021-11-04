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

    public abstract Coin makeCoin();

}
