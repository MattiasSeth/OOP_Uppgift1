package Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {

    Växter v = new Växter("Test", 1);
    @Test
    void setInvalidHeight() {
        assertThrows(IllegalArgumentException.class, () -> {v.setHeight(0);} );
        assertThrows(IllegalArgumentException.class, () -> {v.setHeight(-1);} );
    }
}