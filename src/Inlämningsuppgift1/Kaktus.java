package Inlämningsuppgift1;

public class Kaktus extends Växter {

    private Vätska vätska = Vätska.MINERALVATTEN;
    private final double DAILY_LIQUID = 0.02;
    public Kaktus (String name, double height){
        super(name, height);
    }

@Override
    public void printDailyLiquid(){
        System.out.println("Kaktus\n" + vätska.liquid + ": " + DAILY_LIQUID + " l" );
    }


}
