package Inlämningsuppgift1;

public class Växter implements VäxtInterface {


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
            this.height = height;
    }

    @Override
    public void printMe() {
    }

    @Override
    public double calculateLiquid() {
        return 0;
    }
}

