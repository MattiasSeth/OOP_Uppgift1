package Inlämningsuppgift1;

import java.text.DecimalFormat;

public class Köttätande extends Växter {

    protected Dryck dryck = Dryck.PROTEINDRYCK;
    private final double DAILY_LIQUID = 0.1;

    public Köttätande (String name, double height){
        super(name, height);
    }

    @Override
    public void printMe(){
        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(calculateLiquid());
        System.out.println("Köttätande växt\n" + dryck.dryckSort + ": " + dfNumber + " l" );
    }

    @Override
    public double calculateLiquid() {
        double result = DAILY_LIQUID + (0.2*this.getHeight());
        return result;
    }
}
