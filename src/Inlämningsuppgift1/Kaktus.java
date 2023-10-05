package Inlämningsuppgift1;

import java.text.DecimalFormat;

public class Kaktus extends Växter {

    private Vätska vätska = Vätska.MINERALVATTEN;
    private final double DAILY_LIQUID = 0.02;
    public Kaktus (String name, double height){
        super(name, height);
    }

    public double getDAILY_LIQUID() {
        return DAILY_LIQUID;
    }

    public String printString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(calculateLiquid());
        String result = "Kaktus\n" + vätska.liquid + ": " + getDAILY_LIQUID() + " l";

        return result;
    }
@Override
public void printDailyLiquid(){
    System.out.println(printString());
}


}
