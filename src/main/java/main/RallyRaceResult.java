package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    // Constructor
    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
        this.results = new HashMap<>();
    }

    public String getRaceName() { // Getter for the race name
        return raceName;
    }

    public String getLocation() { // Getter for the race location
        return location;
    }

    // Records the results for a driver
    @Override
    public void recordResult(Driver driver, int position, int points) {
        driver.addPoints(points);
        results.put(driver, points);
    }

    // Retrieves the points for a given driver
    @Override
    public int getDriverPoints(Driver driver) {
        // Retrieve the points for the given driver from the results map
        int driverPoints = results.getOrDefault(driver, 0);

        // Return the driver's points (defaults to 0 if not found)
        return driverPoints;
    }

    @Override
    public List<Driver> getResults() {
        List<Driver> sortedDrivers = new ArrayList<>(results.keySet());
        sortedDrivers.sort((d1, d2) -> Integer.compare(results.get(d2), results.get(d1))); // Sort by race-specific points
        return sortedDrivers;
    }
}