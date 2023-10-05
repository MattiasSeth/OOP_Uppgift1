package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm laura = new Palm("Laura", 5);

    @Test
    void calculateLiquid() {
        assert (laura.calculateLiquid() == 2.5);
        laura.setHeight(10);
        assert (laura.calculateLiquid() == 5);
        laura.setHeight(0.005);
        assert (laura.calculateLiquid() != 0.00125);
        laura.setHeight(25);
        assert (laura.calculateLiquid() == 12.5);
    }

    @Test
    void print(){
        String expectedDfNumber = "2,50";
        String incorrectdfNumber = "2,50000";

        DecimalFormat df = new DecimalFormat("0.00");
        String dfNumber = df.format(laura.calculateLiquid());

        Assertions.assertEquals(dfNumber, expectedDfNumber);
        Assertions.assertNotEquals(dfNumber, incorrectdfNumber);

        String expectedString = "Palm\n" + Vätska.KRANVATTEN.liquid + ": " +dfNumber + " l";
        String printString = laura.printString();
        Assertions.assertEquals(expectedString, printString);
    }
}