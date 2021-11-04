public class USDMint extends Mint{

    public Coin makeCoin(String coinType){
        return new Coin(coinType); 
    }
}
