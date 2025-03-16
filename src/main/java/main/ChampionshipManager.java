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
        drivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        return drivers;
    }

    public static Driver getLeadingDriver() { 
        if (instance == null || instance.drivers.isEmpty()) {
            return null;
        }
        return instance.getDriverStandings().get(0);
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

    public List<RallyRaceResult> getRaces() { 
        return races;
    }

    public static int getTotalDrivers() { // getter for totalDrivers
        return totalDrivers;
    }

    public static int getTotalRaces() { // getter for totalRaces
        return totalRaces;
    }
}