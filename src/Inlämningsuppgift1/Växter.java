package Inlämningsuppgift1;

public class Växter implements Printable{



    private String name;
    private double height;

    public Växter (String name, double height){
        setName(name);
        setHeight(height);
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Höjden måste va störra än 0");
        }
    }

    @Override
    public void printMe() {

    }

    @Override
    public double calculateLiquid() {
        return 0;
    }
}

