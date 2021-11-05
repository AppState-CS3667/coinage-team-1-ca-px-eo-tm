public class smelter{


    //This is what will get called- add cases for different coins
    public void smelt(String type){
        if(type.equals("Penny")){
            spec4();
        }
    }
    
    private void spec1(){
        System.out.print("Smelting with ");
        System.out.println("88.5% Cu, 6% Zi, 3.5% Mn, 2% Ni");
        System.out.println("Done smelting!");
    }

    private void spec2(){
        System.out.print("Smelting with ");
        System.out.println("91.67% Cu, 8.33% Ni");
        System.out.println("Done smelting!");
    }

    private void spec3(){
        System.out.print("Smelting with ");
        System.out.println("75% Cu, 25% Ni");
        System.out.println("Done smelting!");
    }

    private void spec4(){
        System.out.print("Smelting with ");
        System.out.println("2.5% Cu, 97.5% Zi");
        System.out.println("Done smelting");
    }


}
