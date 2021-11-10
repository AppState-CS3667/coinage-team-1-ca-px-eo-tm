public class Demo{
    public static void main(String[] args){
        USDMint m = USDMint.getInstance();
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
    }
}
