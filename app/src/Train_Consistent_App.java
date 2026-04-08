import java.util.LinkedList;
import java.util.List;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 * File Name: Train_Consistent_App.java
 * Author: Karthik
 *
 * Note: While the UC4 title mentioned TreeSet/SortedSet, the requirements
 * and logic specifically call for LinkedList to model the physical
 * chaining and sequence of a train consist.
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Initialize a LinkedList to maintain physical sequence
        // Unlike ArrayList, LinkedList is efficient for insertions in the middle.
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add initial bogies to the consist
        System.out.println("\nAssembling the Train...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Sequence: " + trainConsist);

        // Step 3: Insert a Pantry Car at specific position (index 2)
        // This demonstrates the "insertion" benefit of linked structures
        System.out.println("\nAdding Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        // Step 4: Display the list after middle insertion
        System.out.println("Updated Sequence: " + trainConsist);

        // Step 5: Remove the first and last bogie (Head and Tail operations)
        System.out.println("\nDetaching Engine and Guard coach...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Display final ordered train consist
        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Total Bogies remaining: " + trainConsist.size());

        System.out.println("------------------------------------");
        System.out.println("UC4 Sequence Management Completed.");
    }
}
