import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * File Name: Train_Consistent_App.java
 * Author: Karthik
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        // Step 1: Initialize the application
        System.out.println("=== Train Consist Management App ===");

        // UC2: Create an ArrayList to store Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add passenger bogies (CRUD - Create)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display the list after insertion (CRUD - Read)
        System.out.println("Passenger Bogies Added: " + passengerBogies);
        System.out.println("Current Bogie Count: " + passengerBogies.size());

        // Step 4: Remove a bogie (CRUD - Delete)
        System.out.println("\nRemoving AC Chair...");
        passengerBogies.remove("AC Chair");

        // Step 5: Check if a specific bogie exists (Search)
        System.out.println("Is 'Sleeper' still in the consist? " + passengerBogies.contains("Sleeper"));

        // Step 6: Print final list state
        System.out.println("Final Passenger Consist: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());

        System.out.println("------------------------------------");
        System.out.println("UC2 Operations Completed successfully.");
    }
}
