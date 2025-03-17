package main;

public class Driver {
    private String name;
    private String country;
    private int points;
    private RallyCar car;

    // Constructor
    public Driver(String name, String country, RallyCar car) {
        this.name = name;
        this.country = country;
        this.car = car;
        this.points = 0;
    }

    public String getName() { //Getter for the driver's name
        return name;
    }

    public String getCountry() { //Getter for the driver's country
        return country;
    }

    public int getPoints() { //Getter for the driver's points
        return points;
    }

    public RallyCar getCar() { // Getter for the driver's car type (GravelCar or AsphaltCar)
        return car;
    }

    public void setCar(RallyCar car) { // Setter for the driver's car type (GravelCar or AsphaltCar)
        this.car = car;
    }

    //Method to add points to the driver's total points
    public void addPoints(int pointsAdded) {
        this.points += pointsAdded;
    }
}