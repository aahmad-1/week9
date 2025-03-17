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

    //Getter for the driver's name
    public String getName() { 
        return name;
    }

    //Getter for the driver's country
    public String getCountry() { 
        return country;
    }

    //Getter for the driver's points
    public int getPoints() { 
        return points;
    }

    // Getter for the driver's car type (GravelCar or AsphaltCar)
    public RallyCar getCar() { 
        return car;
    }

    // Setter for the driver's car type (GravelCar or AsphaltCar)
    public void setCar(RallyCar car) { 
        this.car = car;
    }

    //Method to add points to the driver's total points
    public void addPoints(int pointsAdded) {
        this.points += pointsAdded;
    }
}