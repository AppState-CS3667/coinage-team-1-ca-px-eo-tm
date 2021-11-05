public class EURMint extends Mint{

    private static EURMint theMint;
    
    private Coin c;

    public EURMint(){
        c = null;
    }

    public Coin makeCoin(String type){
        inspect(type);
        smooth(type);
        buff(type);
        if (type.equals("OneEuro")){
            c = new OneEuro();
        }
        else if (type.equals("TwoEuro")){
            c = new TwoEuro();
        }
        else if (type.equals("FiftyEuroCent")){
            c = new FiftyEuroCent();
        }
        else if (type.equals("TwentyEuroCent")){
            c = new TwentyEuroCent();
        }
        else if (type.equals("TenEuroCent")){
            c = new TenEuroCent();
        }
        else if (type.equals("FiveEuroCent")){
            c = new FiveEuroCent();
        }
        else if (type.equals("TwoEuroCent")) {
            c = new TwoEuroCent();
        }
        else if (type.equals("EuroCent")) {
            c = EuroCent;
        }


        return c;
    }

    public static USDMint getInstance(){
        if (theMint == null){
            theMint = new EURMint();
        }
        return theMint;
    }
}
