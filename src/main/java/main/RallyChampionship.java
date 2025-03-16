package main;

import java.util.List;

public class RallyChampionship {
    public static void main(String[] args) {
        ChampionshipManager manager = ChampionshipManager.getInstance();

        // Create drivers and cars
        Driver driver1 = new Driver("Sébastien Ogier", "France", new GravelCar("Toyota", "Yaris", 380, 12.5));
        Driver driver2 = new Driver("Kalle Rovanperä", "Finland", new AsphaltCar("Toyota", "Yaris", 400, 8.2));
        Driver driver3 = new Driver("Ott Tänak", "Estonia", new GravelCar("Hyundai", "i20", 370, 11));
        Driver driver4 = new Driver("Thierry Neuville", "Belgium", new AsphaltCar("Hyundai", "i20", 390, 7.5));

        // Register drivers
        manager.registerDriver(driver1);
        manager.registerDriver(driver2);
        manager.registerDriver(driver3);
        manager.registerDriver(driver4);

        // Simulate races
        RallyRaceResult race1 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        race1.recordResult(driver1, 1, 25);
        race1.recordResult(driver3, 2, 18);
        race1.recordResult(driver2, 3,15);
        race1.recordResult(driver4, 4, 12);
        manager.addRaceResult(race1);

        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally", "Monaco");
        race2.recordResult(driver2, 1, 25);
        race2.recordResult(driver4, 2, 18);
        race2.recordResult(driver1, 3, 15);
        race2.recordResult(driver3, 4, 12);
        manager.addRaceResult(race2);

        // Display championship standings
        System.out.println("===== CHAMPIONSHIP STANDINGS ====");
        manager.getDriverStandings().forEach(driver -> 
            System.out.println(driver.getName() + " (" + driver.getCountry() + "): " + driver.getPoints() + " points"));

        // Display championship leader
        System.out.println("\n===== CHAMPIONSHIP LEADER ====");
        System.out.println(ChampionshipManager.getLeadingDriver().getName() + " with " + ChampionshipManager.getLeadingDriver().getPoints() + " points");

        // Display championship statistics
        System.out.println("\n===== CHAMPIONSHIP STATISTICS ====");
        System.out.println("Total Drivers: " + ChampionshipManager.getTotalDrivers());
        System.out.println("Total Races: " + ChampionshipStatistics.getTotalRacesHeld());
        System.out.println("Average Points Per Driver: " + ChampionshipStatistics.calculateAveragePointsPerDriver(manager.getDriverStandings()));
        System.out.println("Most Successful Country: " + ChampionshipStatistics.findMostSuccessfulCountry(manager.getDriverStandings()));
        System.out.println("Total Championship Points: " + ChampionshipManager.getTotalChampionshipPoints());

        // Display race results
        System.out.println("\n===== RACE RESULTS ====");
        for (RaceResult result : manager.getRaces()) {
            RallyRaceResult rallyResult = (RallyRaceResult) result;
            System.out.println("Race: " + rallyResult.getRaceName() + " (" + rallyResult.getLocation() + ")");
            List<Driver> results = rallyResult.getResults();
            for (int i = 0; i < results.size(); i++) {
                System.out.println("    Position " + (i + 1) + ": " + results.get(i).getName() + " - " + rallyResult.getDriverPoints(results.get(i)) + " points");
            }
            System.out.println(); // Add a newline after each race's results
        }

        // Display car performance ratings
        System.out.println("\n===== CAR PERFORMANCE RATINGS ====");
        System.out.println("Gravel Car Performance: " + new GravelCar("Toyota", "Yaris", 380, 12.5).calculatePerformance());
        System.out.println("Asphalt Car Performance: " + new AsphaltCar("Toyota", "Yaris", 400, 8.2).calculatePerformance());
    }
}