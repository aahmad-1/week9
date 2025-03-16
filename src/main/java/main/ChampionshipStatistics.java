package main;

import java.util.*;

public class ChampionshipStatistics {
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        double average = (double) ChampionshipManager.getTotalChampionshipPoints() / ChampionshipManager.getTotalDrivers();
        return average;
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        drivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        String mostSuccessfulCountry = drivers.get(0).getCountry();
        return mostSuccessfulCountry;
    }

    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }
}