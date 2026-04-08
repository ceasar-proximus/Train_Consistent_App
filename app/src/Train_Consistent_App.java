import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * File Name: Train_Consistent_App.java
 * Author: Karthik
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create a LinkedHashSet to represent the train formation
        // This ensures unique bogies (like HashSet) but keeps them in the order they were added (like List).
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Attach bogies in a specific physical sequence
        System.out.println("\nAttaching bogies to the engine...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to attach a duplicate bogie intentionally
        // Business Rule: The same physical bogie (Sleeper) cannot be attached twice.
        System.out.println("Attempting to add duplicate 'Sleeper'...");
        trainFormation.add("Sleeper");

        // Step 4: Display the final formation order
        // Notice: The order is preserved (Engine -> Sleeper -> Cargo -> Guard)
        // and the duplicate "Sleeper" is automatically ignored.
        System.out.println("\nFinal Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // Step 5: Verify constraints
        System.out.println("\nTotal unique bogies in formation: " + trainFormation.size());
        System.out.println("------------------------------------");
        System.out.println("UC5 Unique Ordered Formation Completed.");
    }
}
