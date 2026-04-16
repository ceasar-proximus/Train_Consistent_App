import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 * Author: Karthik
 * Class Name: Train_Consistent_App
 */
public class Train_Consistent_App {

    // Internal Bogie Class
    static class Bogie {
        String id;
        String type; // Used as the grouping key
        int capacity;

        public Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return String.format("Bogie[ID: %s, Cap: %d]", id, capacity);
        }
    }

    public static void main(String[] args) {
        // 1. Create a list of bogies (Reuse setup logic)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B001", "Sleeper", 72));
        bogies.add(new Bogie("B002", "AC Chair", 60));
        bogies.add(new Bogie("B003", "First Class", 24));
        bogies.add(new Bogie("B004", "Sleeper", 72));
        bogies.add(new Bogie("B005", "AC Chair", 50));
        bogies.add(new Bogie("B006", "General", 80));

        System.out.println("--- Flat List of Bogies ---");
        bogies.forEach(System.out::println);

        // 2. Convert the list into a stream
        // 3. Apply groupingBy() collector
        // 4. Store the result in Map<String, List<Bogie>>
        Map<String, List<Bogie>> bogiesByType = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // 5. Display the grouped result
        System.out.println("\n=== Structured Report: Bogies Grouped By Type ===");
        bogiesByType.forEach((type, list) -> {
            System.out.println("Category: [" + type + "]");
            list.forEach(b -> System.out.println("  -> " + b));
            System.out.println("  Count: " + list.size());
        });

        // Verification of Requirements
        System.out.println("\n--- Validation Check ---");
        System.out.println("Total Categories Found: " + bogiesByType.keySet().size());
        System.out.println("Original list integrity (size 6): " + bogies.size());

        // Testing specific key existence
        if (bogiesByType.containsKey("Sleeper")) {
            System.out.println("Sleeper group correctly contains " + bogiesByType.get("Sleeper").size() + " bogies.");
        }
    }
}
