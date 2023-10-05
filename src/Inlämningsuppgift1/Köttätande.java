package Inlämningsuppgift1;

import java.text.DecimalFormat;

public class Köttätande extends Växter {

    private Vätska vätska = Vätska.PROTEINDRYCK;
    private final double DAILY_LIQUID = 0.1;

    public Köttätande (String name, double height){
        super(name, height);
    }
    public String printString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(calculateLiquid());
        String result = "Köttätande växt\n" + vätska.liquid + ": " + dfNumber + " l";

        return result;
    }
    @Override
    public void printDailyLiquid(){
        System.out.println(printString());
    }

    @Override
    public double calculateLiquid() {
        double result = DAILY_LIQUID + (0.2*this.getHeight());
        return result;
    }
}
