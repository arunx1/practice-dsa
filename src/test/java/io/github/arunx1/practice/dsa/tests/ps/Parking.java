package io.github.arunx1.practice.dsa.tests.ps;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;


/**
 * The Parking class simulates a simple, fixed-size car parking system.
 * It manages parking spots, vehicle entry/exit, calculates parking duration and cost,
 * and provides real-time status updates via a simple CLI.
 */
public class Parking {
    // The rate charged per unit of time (e.g., per second).
    public final Double costPerUnit = 0.10;

    // An array representing all physical parking spots.
    // Each index holds the Instant (timestamp) of arrival for the parked vehicle, or null if the spot is empty.
    public Instant[] spots;

    // A stack used to track indices of spots that were previously occupied and are now available.
    public Stack<Integer> vacatedSpots;

    // A map linking a vehicle's registration number (String key) to its physical spot index (Integer value).
    public Map<String, Integer> occupancyDetails;

    // An index pointer used to track the next never-before-used spot when the vacatedSpots stack is empty.
    public int nextFreeSlotIndex;

    /**
     * Constructor to initialize the parking system.
     *
     * @param maxSpots The total capacity of the parking lot.
     */
    public Parking(int maxSpots) {
        this.spots = new Instant[maxSpots];
        this.occupancyDetails = new HashMap<>();
        this.vacatedSpots = new Stack<>();
        this.nextFreeSlotIndex = 0;
    }

    /**
     * The entry point of the application, running a command-line interface (CLI) in a continuous loop.
     * It provides an interactive simulation of the parking system.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int maxSpots = 20;
        Parking parking = new Parking(maxSpots);
        System.out.println("=".repeat(50));
        System.out.println("Welcome to parking management application");
        System.out.println("=".repeat(50));
        while (true) {
            parking.showParking();
            System.out.printf("Available Spots: %d of %d%n", parking.getAvailableSpots(), maxSpots);
            System.out.println("-".repeat(50));
            System.out.println("0. Exit");
            System.out.println("1. Gate in new vehicle");
            System.out.println("2. Gate out parked vehicle");
            System.out.println("3. Get location");
            System.out.println();
            System.out.print("Choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 3)
                break;
            System.out.print("Enter vehicle: ");
            String reg = scanner.next();

            if (choice == 1)
                parking.gateIn(reg); // Handle vehicle arrival
            else if (choice == 2)
                parking.gateOut(reg); // Handle vehicle departure
            else
                parking.whereIsMyVehicle(reg); // Locate a parked vehicle
        }
    }

    /**
     * Handles the arrival (gate-in) of a new vehicle.
     *
     * @param reg The registration number of the arriving vehicle.
     */
    public void gateIn(String reg) {
        if (isFull()) {
            System.out.println("Parking Full. No available spots");
            return;
        }

        if (occupancyDetails.containsKey(reg)) {
            System.out.println("Vehicle is already parked");
            return;
        }

        int availableSpotIndex;
        // Prioritize reusing a vacated spot index
        if (!vacatedSpots.isEmpty()) {
            availableSpotIndex = vacatedSpots.pop();
        } else {
            // Otherwise, use the next previously unused slot index
            availableSpotIndex = nextFreeSlotIndex++;
        }
        occupancyDetails.put(reg, availableSpotIndex);
        Instant gateInTime = new Date().toInstant();
        spots[availableSpotIndex] = gateInTime;
        System.out.printf("Vehicle %s Gated-in at %s on spot %d%n", reg, getReadableTime(gateInTime), availableSpotIndex);
    }

    /**
     * Handles the departure (gate-out) of a parked vehicle.
     * Calculates duration and cost.
     *
     * @param reg The registration number of the departing vehicle.
     */
    public void gateOut(String reg) {
        if (isEmpty()) {
            System.out.println("Parking is empty");
            return;
        }
        // Find the spot index using the registration number and remove it from occupancy tracking
        int spotIndex = occupancyDetails.remove(reg);
        Instant gateInTime = spots[spotIndex];
        spots[spotIndex] = null; // Free the spot
        vacatedSpots.push(spotIndex); // Mark index as available for reuse

        // Edge case: if all spots are suddenly free, reset counters/structures
        if (vacatedSpots.size() == spots.length) {
            System.out.println("Parking is empty now");
            nextFreeSlotIndex = 0;
            vacatedSpots.empty();
            occupancyDetails.clear();
        }
        Instant gateOutTime = new Date().toInstant();
        // Calculate duration in seconds
        long parkedDuration = Duration.between(gateInTime, gateOutTime).toSeconds();

        Double cost = parkedDuration * costPerUnit;
        System.out.printf("Vehicle %s gated out.%n", reg);
        System.out.printf("Gate-In: %s | Gate-out: %s | Duration %d Seconds | Cost: %f%n", getReadableTime(gateInTime), getReadableTime(gateOutTime), parkedDuration, cost);
    }

    /**
     * Checks if the parking lot is completely empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return occupancyDetails.isEmpty();
    }

    /**
     * Checks if the parking lot is completely full.
     *
     * @return true if full, false otherwise.
     */
    public boolean isFull() {
        return occupancyDetails.size() == spots.length;
    }

    /**
     * Calculates the number of available parking spots.
     *
     * @return The count of free spots.
     */
    public int getAvailableSpots() {
        return spots.length - occupancyDetails.size();
    }

    /**
     * Utility method to format an Instant timestamp into a user-friendly String.
     *
     * @param instant The time instant to format.
     * @return A formatted date/time string.
     */
    private String getReadableTime(Instant instant) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss"));
    }

    /**
     * Locates a vehicle based on its registration number and prints its location details.
     *
     * @param reg The registration number to search for.
     */
    public void whereIsMyVehicle(String reg) {
        int spotIndex = occupancyDetails.getOrDefault(reg, -1);
        if (spotIndex == -1)
            System.out.println("Vehicle is not parked");
        else
            System.out.printf("Vehicle is parked at %d since %s%n", spotIndex, getReadableTime(spots[spotIndex]));
    }

    /**
     * Prints a visual representation of the entire parking lot's current state.
     * Sorts entries by physical spot index before display.
     */
    public void showParking() {
        // Use a LinkedHashMap to store data sorted by the *value* (spot index)
        Map<Integer, String> indexedOccupancy = new LinkedHashMap<>();
        occupancyDetails.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) // Sort entries by their index value (ascending)
                .forEachOrdered(entry -> indexedOccupancy.put(entry.getValue(), entry.getKey())); // Put into linked map to preserve order
        System.out.println();
        // Iterate through all possible spot indices to display the full lot
        for (int index = 0; index < spots.length; index++) {
            String reg = indexedOccupancy.getOrDefault(index, "-"); // Get reg number or "-" if spot empty
            // String parkedSince = spots[index] == null ? "" : getReadableTime(spots[index]);
            System.out.printf("| %s ", reg);
        }
        System.out.println("|\n");
    }
}
