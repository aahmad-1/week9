package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers;
    private List<RallyRaceResult> races; 
    private static int totalDrivers; 
    private static int totalRaces; 

    private ChampionshipManager() {
        drivers = new ArrayList<>();
        races = new ArrayList<>();
        totalDrivers = 0;
        totalRaces = 0;
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        totalDrivers++; // Increment totalDrivers
    }

    public void addRaceResult(RallyRaceResult result) { 
        races.add(result);
        totalRaces++; // Increment totalRaces
    }

    public List<Driver> getDriverStandings() {
        // Sort the drivers by their points in descending order
        drivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        return drivers;
    }

    public static Driver getLeadingDriver() { 
        if (instance == null || instance.drivers.isEmpty()) {
            return null;
        }
        // Get the sorted list of drivers (standings)
        List<Driver> standings = instance.getDriverStandings();
        Driver leadingDriver = standings.get(0);
        return leadingDriver; // Return the driver with the highest points (first in the standings)
    }

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

    public List<RallyRaceResult> getRaces() {  // getter for races
        return races;
    }

    public static int getTotalDrivers() { // getter for totalDrivers
        return totalDrivers;
    }

    public static int getTotalRaces() { // getter for totalRaces
        return totalRaces;
    }
}