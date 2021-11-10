public class Demo{
    public static void main(String[] args){
        USDMint m = USDMint.getInstance();

        EURMint e = EURMint.getInstance();

        m.makeCoin("Penny");
        System.out.println("");
        m.makeCoin("Nickel");
        System.out.println("");
        m.makeCoin("Dime");
        System.out.println("");
        m.makeCoin("Quarter");
        System.out.println("");
        m.makeCoin("HalfDollar");
        System.out.println("");
        m.makeCoin("Dollar");

        e.makeCoin("OneEuro");
        System.out.println("");
        e.makeCoin("TwoEuro");
        System.out.println("");
        e.makeCoin("FiftyEuroCent");
        System.out.println("");
        e.makeCoin("TwentyEuroCent");
        System.out.println("");
        e.makeCoin("TenEuroCent");
        System.out.println("");
        e.makeCoin("FiveEuroCent");
        System.out.println("");
        e.makeCoin("TwoEuroCent");
        System.out.println("");
        e.makeCoin("EuroCent");

    }
}
