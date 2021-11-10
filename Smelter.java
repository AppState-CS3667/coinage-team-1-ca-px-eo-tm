public class Smelter{


    //This is what will get called- add cases for different coins
    public static void smelt(String type){
        if(type.equals("Penny") || type.equals("TwoEuroCent") || type.equals("EuroCent") || type.equals("FiveEuroCent")){
            spec4();
        }
        else if(type.equals("Quarter") || type.equals("Dime") || type.equals("HalfDollar")){
            spec2();
        }
        else if(type.equals("Dollar") || type.equals("OneEuro")){
            spec1();
        }
        else if(type.equals("Nickel") || type.equals("FiftyEuroCent") || type.equals("TwentyEuroCent") || type.equals("TenEuroCent")){
            spec3();
        }
    }
    
    private static void spec1(){
        System.out.print("Smelting with ");
        System.out.println("88.5% Cu, 6% Zi, 3.5% Mn, 2% Ni");
        System.out.println("Done smelting!");
    }

    private static void spec2(){
        System.out.print("Smelting with ");
        System.out.println("91.67% Cu, 8.33% Ni");
        System.out.println("Done smelting!");
    }

    private static void spec3(){
        System.out.print("Smelting with ");
        System.out.println("75% Cu, 25% Ni");
        System.out.println("Done smelting!");
    }

    private static void spec4(){
        System.out.print("Smelting with ");
        System.out.println("2.5% Cu, 97.5% Zi");
        System.out.println("Done smelting");
    }

    private static void spec5(){
        System.out.print("Smelting with ");
        System.out.println("75% Cu, 20% Zi, 5% Ni");
        System.out.println("Done smelting");
    }

}
