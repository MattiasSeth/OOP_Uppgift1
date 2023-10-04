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
    void getName (){

    }

    @Test
    void setHeight (){

    }

    @Test
    void getHeight (){

    }
}