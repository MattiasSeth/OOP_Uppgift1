package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande meatloaf = new Köttätande("Meatloaf", 0.7);

    @Test
    void calculateLiquid() {
        assert (meatloaf.calculateLiquid() == 0.24);
        meatloaf.setHeight(10);
        assert (meatloaf.calculateLiquid() == 2.1);
        meatloaf.setHeight(0.005);
        assert (meatloaf.calculateLiquid() == 0.101);
        meatloaf.setHeight(25);
        assert (meatloaf.calculateLiquid() == 5.1);
    }

    @Test
    void print(){
        String expectedDfNumber = "0,24";
        String incorrectdfNumber = "2,50000";

        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(meatloaf.calculateLiquid());

        Assertions.assertEquals(dfNumber, expectedDfNumber);
        Assertions.assertNotEquals(dfNumber, incorrectdfNumber);

        String expectedString = "Köttätande växt\n" + Vätska.PROTEINDRYCK.liquid + ": " +dfNumber + " l";
        String printString = meatloaf.printString();
        Assertions.assertEquals(expectedString, printString);

    }
}