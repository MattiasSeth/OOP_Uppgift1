package Inlämningsuppgift1;

import java.text.DecimalFormat;

public class Palm extends Växter {


    private Vätska vätska = Vätska.KRANVATTEN;

    public Palm (String name, double height){
        super(name, height);
    }

@Override
    public void printMe(){
        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(calculateLiquid());
        System.out.println("Palm\n" + vätska.liquid + ": " + dfNumber+ " l" );
    }

    @Override
    public double calculateLiquid() {
        double result = 0.5 * this.getHeight();
        return result;
    }
}
