package com.workshop;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class SmartCityDashboard {

    public static void main(String[] args) {

        // Fare calculator using lambda
        FareCalculator fareCalculator = (baseFare, distance) -> baseFare + (distance * 2);

        double distance = GeoUtils.calculateDistance(0, 0, 3, 4); // static method usage

        List<TransportService> services = new ArrayList<>();
        services.add(new BusService("A-B", fareCalculator.calculateFare(10, distance), true));
        services.add(new MetroService("A-C", fareCalculator.calculateFare(15, distance), false));
        services.add(new TaxiService("B-C", fareCalculator.calculateFare(20, distance), true));
        services.add(new BusService("A-B", fareCalculator.calculateFare(10, distance), false));
        services.add(new AmbulanceService("C-D")); // Emergency service

        // forEach() + method reference + default method
        System.out.println("=== Live Transport Services ===");
        services.forEach(TransportService::printServiceDetails);

        // Lambda: Filter & sort by fare
        System.out.println("\n=== Sorted by Fare (Cheapest First) ===");
        services.stream()
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        // Collectors.groupingBy()
        System.out.println("\n=== Grouped by Route ===");
        Map<String, List<TransportService>> byRoute =
                services.stream().collect(groupingBy(TransportService::getRoute));

        byRoute.forEach((route, list) -> {
            System.out.println("Route: " + route);
            list.forEach(s -> System.out.println("  " + s.getServiceName()));
        });

        // Collectors.partitioningBy()
        System.out.println("\n=== Peak vs Non-Peak Services ===");
        Map<Boolean, List<TransportService>> peakPartition =
                services.stream().collect(partitioningBy(TransportService::isPeakTime));

        System.out.println("Peak Time:");
        peakPartition.get(true).forEach(s -> System.out.println("  " + s.getServiceName() + " " + s.getRoute()));

        System.out.println("Non-Peak Time:");
        peakPartition.get(false).forEach(s -> System.out.println("  " + s.getServiceName() + " " + s.getRoute()));

        // Collectors.summarizingDouble()
        System.out.println("\n=== Fare Statistics ===");
        DoubleSummaryStatistics stats =
                services.stream().collect(summarizingDouble(TransportService::getFare));

        System.out.println("Total Fare: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());
        System.out.println("Max Fare: " + stats.getMax());

        // Marker Interface check
        System.out.println("\n=== Emergency Service Priority Check ===");
        services.forEach(service -> {
            if (service instanceof EmergencyService) {
                System.out.println(service.getServiceName() + " on route " + service.getRoute() + " gets PRIORITY!");
            }
        });
    }
}
