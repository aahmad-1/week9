package main;

public class GravelCar extends RallyCar {
    private double suspensionTravel;

    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower); //is used to call the constructor of the parent class
        this.suspensionTravel = suspensionTravel;
    }

    public double getSuspensionTravel() {
        return suspensionTravel;
    }

    @Override
    public double calculatePerformance() {
        // Example calculation that takes into account suspensionTravel into the performance as
        // well as a different factor for horsepower
        return getHorsepower() + suspensionTravel;
    }
}