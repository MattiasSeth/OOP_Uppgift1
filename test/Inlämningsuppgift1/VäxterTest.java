package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {

    Växter v = new Växter("Test", 1);

    @Test
    void setName (){
        String nameChange = "Seth";
        String oldNme = v.getName();

        v.setName(nameChange);
        String newName = v.getName();

        Assertions.assertEquals(nameChange, newName);
        Assertions.assertNotEquals(newName, oldNme);
    }

    @Test
    void getHeight() {
        double newHeight = 10;
        double incorrectHeight = 20;

        v.setHeight(newHeight);
        double height = v.getHeight();

        Assertions.assertEquals(newHeight, height);
        Assertions.assertNotEquals(height, incorrectHeight);
    }

    @Test
    void setHeight() {
        double newHeight = 10.5;
        double incorrectHeight = 20;

        v.setHeight(newHeight);
        double height = v.getHeight();

        Assertions.assertEquals(newHeight, height);
        Assertions.assertNotEquals(height, incorrectHeight);
    }
}