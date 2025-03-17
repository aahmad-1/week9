package main;

import java.util.ArrayList;
import java.util.List;

// Singleton class to manage the rally championship
public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers;
    private List<RallyRaceResult> races; 
    private static int totalDrivers; 
    private static int totalRaces; 

    // Private constructor to enforce Singleton pattern
    private ChampionshipManager() {
        drivers = new ArrayList<>();
        races = new ArrayList<>();
        totalDrivers = 0;
        totalRaces = 0;
    }

    // Get the singleton instance of the ChampionshipManager
    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    // Register a new driver in the championship
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        totalDrivers++; // Increment totalDrivers
    }


    // Add the race results
    public void addRaceResult(RallyRaceResult result) { 
        races.add(result);
        totalRaces++; // Increment totalRaces
    }

    // Sort the drivers by their points in descending order
    public List<Driver> getDriverStandings() {
        drivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        return drivers;
    }

    // Get the leading driver in the championship
    public static Driver getLeadingDriver() { 
        if (instance == null || instance.drivers.isEmpty()) {
            return null;
        }
        // Get the sorted list of drivers (standings)
        List<Driver> standings = instance.getDriverStandings();
        Driver leadingDriver = standings.get(0);
        return leadingDriver; // Return the driver with the highest points (first in the standings)
    }

    // Get the total championship points per driver
    public static int getTotalChampionshipPoints() { 
        if (instance == null) {
            return 0;
        }
        int totalPoints = 0;
        for (Driver driver : instance.drivers) {
            totalPoints += driver.getPoints();
        }
    
        return totalPoints;    
    }

    // getter for races
    public List<RallyRaceResult> getRaces() {  
        return races;
    }

    // getter for totalDrivers
    public static int getTotalDrivers() { 
        return totalDrivers;
    }

    // getter for totalRaces
    public static int getTotalRaces() { 
        return totalRaces;
    }
}