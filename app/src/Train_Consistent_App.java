import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC8: Filter Passenger Bogies Using Streams
 * Author: Karthik
 * Class Name: Train_Consistent_App
 */
public class Train_Consistent_App {

    // Internal Bogie Class representing the model
    static class Bogie {
        String id;
        String type;
        int capacity;

        public Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return String.format("Bogie[ID: %-5s | Type: %-12s | Capacity: %d]", id, type, capacity);
        }
    }

    public static void main(String[] args) {
        // 1. Create a list of bogies (Data setup from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B001", "Sleeper", 72));
        bogies.add(new Bogie("B002", "AC Chair", 60));
        bogies.add(new Bogie("B003", "First Class", 24));
        bogies.add(new Bogie("B004", "Sleeper", 72));
        bogies.add(new Bogie("B005", "General", 80));
        bogies.add(new Bogie("B006", "AC Chair", 50));

        System.out.println("=== Full Train Consist (Original List) ===");
        bogies.forEach(System.out::println);
        System.out.println("Total Bogies: " + bogies.size());

        // 2. Convert the list into a stream
        // 3. Apply filter condition (capacity > 60)
        // 4. Collect matching bogies into a new list
        // Note: Using .collect(Collectors.toList()) for compatibility with older Java 8+
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 5. Display the filtered bogies
        System.out.println("\n=== Filtered Results: High Capacity Bogies (Capacity > 60) ===");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No matching bogies found.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // Verification of Requirements
        System.out.println("\n--- Integrity Check ---");
        System.out.println("Original list size (should be 6): " + bogies.size());
        System.out.println("Filtered list size: " + highCapacityBogies.size());

        // Example of "No Matching Bogies" scenario
        long countAbove100 = bogies.stream()
                .filter(b -> b.capacity > 100)
                .count();
        System.out.println("Bogies with capacity > 100: " + countAbove100);
    }
}
