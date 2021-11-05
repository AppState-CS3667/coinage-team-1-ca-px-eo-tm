public class USDMint extends Mint{

    private static USDMint theMint;
    
    private Coin c;

    smelter s = new smelter();

    public USDMint(){
        c = null;
    }

    public Coin makeCoin(String type){
        s.smelt(type);
        inspect(type);
        smooth(type);
        buff(type);
        if (type.equals("Penny")){
            c = new Penny();
        }
        else if (type.equals("Nickel")){
            c = new Nickel();
        }
        else if (type.equals("Dime")){
            c = new Dime();
        }
        else if (type.equals("Quarter")){
            c = new Quarter();
        }
        else if (type.equals("HalfDollar")){
            c = new HalfDollar();
        }
        else if (type.equals("Dollar")){
            c = new Dollar();
        }

        return c;
    }

    public static USDMint getInstance(){
        if (theMint == null){
            theMint = new USDMint();
        }
        return theMint;
    }
}
