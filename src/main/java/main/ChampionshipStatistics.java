package main;

import java.util.*;

public class ChampionshipStatistics {
    
    // Method to calculate the average points per driver
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        double averagePointsPerDriver = (double) ChampionshipManager.getTotalChampionshipPoints() / ChampionshipManager.getTotalDrivers();
        return averagePointsPerDriver;
    }

    // Method to find the most successful country (driver with the most points) in the championship
    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        drivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        String mostSuccessfulCountry = drivers.get(0).getCountry();
        return mostSuccessfulCountry;
    }

    // Method to get the total races held
    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }
}