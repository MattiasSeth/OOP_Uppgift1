package Inlämningsuppgift1;

import java.text.DecimalFormat;

public class Palm extends Växter {


    private Vätska vätska = Vätska.KRANVATTEN;

    public Palm (String name, double height){
        super(name, height);
    }

    public String printString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(calculateLiquid());
        String result = "Palm\n" + vätska.liquid + ": " + dfNumber+ " l";

        return result;
    }

@Override
    public void printDailyLiquid(){
        System.out.println(printString());
    }

    @Override
    public double calculateLiquid() {
        double result = 0.5 * this.getHeight();
        return result;
    }
}
