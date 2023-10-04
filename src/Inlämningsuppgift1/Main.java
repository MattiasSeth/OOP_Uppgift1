package Inlämningsuppgift1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // arraylist för växter
    ArrayList<Växter> växtArray = new ArrayList<>();
    private Scanner userInput = new Scanner(System.in);


    public String input () {
        System.out.println("Vilken växt ska få vätska?");
        String input = userInput.nextLine();

        return input;
    }

    public Main (){
        Växter igge = new Kaktus("Igge", 0.2);
        Växter laura = new Palm("Laura", 5);
        Växter meatloaf = new Köttätande("Meatloaf", 0.7);
        Växter olof = new Palm("Olof", 1);

        växtArray.add(igge);
        växtArray.add(laura);
        växtArray.add(meatloaf);
        växtArray.add(olof);

        String inputData = input();
        boolean nameCheck = false;

        for (int i=0; i<växtArray.size(); i++){
            if(växtArray.get(i).getName().equalsIgnoreCase(inputData)){
                växtArray.get(i).printDailyLiquid();
                nameCheck = true;
                break;
            }
        }

        if (nameCheck == false){
            System.out.println(inputData + " är inte inchekad på hotellet");
        }

    }

    public static void main(String[] args) {

        Main m = new Main();

    }
}
