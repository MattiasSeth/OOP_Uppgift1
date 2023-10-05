package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VätskaTest {

    @Test
    void stringValue() {
        Assertions.assertEquals(Vätska.KRANVATTEN.liquid, "Kranvatten");
        Assertions.assertEquals(Vätska.MINERALVATTEN.liquid, "Mineralvatten");
        Assertions.assertEquals(Vätska.PROTEINDRYCK.liquid, "Proteindryck");
    }
}