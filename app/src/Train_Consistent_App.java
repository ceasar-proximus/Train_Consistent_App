import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * File Name: Train_Consistent_App.java
 * Author: Karthik
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // --- UC2 Recap: List for Bogie Types ---
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("First Class");

        // --- UC3: HashSet for Unique Bogie IDs ---
        // Step 1: Initialize a HashSet to store unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add IDs to the Set (including intentional duplicates)
        System.out.println("\nRegistering Bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Attempting to add a duplicate ID

        // Step 3: Display the Set
        // Notice that "BG101" appears only once because HashSet enforces uniqueness
        System.out.println("Registered Unique Bogie IDs: " + bogieIds);
        System.out.println("Total Unique IDs tracked: " + bogieIds.size());

        // Step 4: Verification
        if (bogieIds.contains("BG101")) {
            System.out.println("System Check: Bogie BG101 is successfully registered and unique.");
        }

        System.out.println("------------------------------------");
        System.out.println("UC3 Uniqueness Constraints applied successfully.");
    }
}
