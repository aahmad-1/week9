package main;

// Subclass of RallyCar for specific Asphalt Cars
public class AsphaltCar extends RallyCar {
    private double downforce;

    // Constructor
    public AsphaltCar(String make, String model, int horsepower, double downforce) {
        super(make, model, horsepower); //is used to call the constructor of the parent class
        this.downforce = downforce;
    }

    public double getDownforce() { //Getter for the car's downforce
        return downforce;
    }

    @Override
    public double calculatePerformance() {
        // Example calculation that takes into account downforce into the performance as
        // well as a different factor for horsepower
        return getHorsepower() * 0.82 + downforce * 5.13;
    }
}