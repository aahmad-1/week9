package main;

public abstract class RallyCar {
    private String make;
    private String model;
    private int horsepower;

    // Constructor
    public RallyCar(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }

    // Getter for the car's make
    public String getMake() {
        return make;
    }

    // Getter for the car's model
    public String getModel() {
        return model;
    }

    // Getter for the car's horsepowerx
    public int getHorsepower() { 
        return horsepower;
    }

    // Abstract method to calculate the performance of the car
    public abstract double calculatePerformance();
}