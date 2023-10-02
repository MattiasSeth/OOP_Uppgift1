package Inlämningsuppgift1;

import org.w3c.dom.ls.LSOutput;

public class Main {

    // arraylist för växter


    public static void main(String[] args) {

        Växter igge = new Kaktus("Igge", 0.2);
        Växter laura = new Palm("Laura", 5);
        Växter meatloaf = new Köttätande("Meatloaf", 0.7);
        Växter olof = new Palm("Olof", 1);

        System.out.println(olof.getName());

    }
}
