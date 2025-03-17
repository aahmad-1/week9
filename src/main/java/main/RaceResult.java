package main;

import java.util.List;

// Interface for recording and retrieving race results
public interface RaceResult {
    void recordResult(Driver driver, int position, int points);
    int getDriverPoints(Driver driver);
    List<Driver> getResults();
}