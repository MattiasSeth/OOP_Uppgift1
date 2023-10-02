package Inlämningsuppgift1;

public class Kaktus extends Växter {

    protected Dryck dryck = Dryck.MINERALVATTEN;
    private final double DAILY_LIQUID = 0.02;
    public Kaktus (String name, double height){
        super(name, height);
    }

@Override
    public void printMe(){
        System.out.println("Kaktus\n" + dryck.dryckSort + ": " + DAILY_LIQUID + " l" );
    }


}
