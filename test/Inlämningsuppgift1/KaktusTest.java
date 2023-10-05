package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus igge = new Kaktus("Igge", 0.2);
    @Test
    void print() {
        String expectedString = "Kaktus\n" + Vätska.MINERALVATTEN.liquid + ": " +igge.getDAILY_LIQUID() + " l";
        String printString = igge.printString();
        Assertions.assertEquals(expectedString, printString);
    }
}