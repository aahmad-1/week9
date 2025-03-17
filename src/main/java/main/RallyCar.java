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

    public String getMake() { // Getter for the car's make
        return make;
    }

    public String getModel() { // Getter for the car's model
        return model;
    }

    public int getHorsepower() { // Getter for the car's horsepower
        return horsepower;
    }

    // Abstract method to calculate the performance of the car
    public abstract double calculatePerformance();
}