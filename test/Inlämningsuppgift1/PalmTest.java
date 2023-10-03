package Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm laura = new Palm("Laura", 5);

    @Test
    void calculateLiquid() {
        assert (laura.calculateLiquid() == 0.25);
        laura.setHeight(10);
        assert (laura.calculateLiquid() == 5);
        laura.setHeight(0.005);
        assert (laura.calculateLiquid() == 0.0025);
        laura.setHeight(25);
        assert (laura.calculateLiquid() == 12.5);
    }
}