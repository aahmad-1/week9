package main;

// Subclass of RallyCar for speciifc Gravel Cars
public class GravelCar extends RallyCar {
    private double suspensionTravel;

    // Constructor
    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower); // is used to call the constructor of the parent class
        this.suspensionTravel = suspensionTravel;
    }

    public double getSuspensionTravel() { //Getter for the car's suspension travel
        return suspensionTravel;
    }

    @Override
    public double calculatePerformance() {
        // Example calculation that takes into account suspensionTravel into the performance as
        // well as a different factor for horsepower
        return getHorsepower() * 0.72 + suspensionTravel * 10.27;
    }
}