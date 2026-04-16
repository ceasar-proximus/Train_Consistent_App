import java.util.ArrayList;
import java.util.List;

/**
 * UC10: Count Total Seats in Train (reduce)
 * Author: Karthik
 * Class Name: Train_Consistent_App
 */
public class Train_Consistent_App {

    // Internal Bogie Class
    static class Bogie {
        String id;
        String type;
        int capacity;

        public Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return String.format("Bogie[ID: %s | Type: %-12s | Capacity: %d]", id, type, capacity);
        }
    }

    public static void main(String[] args) {
        // 1. Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B001", "Sleeper", 72));
        bogies.add(new Bogie("B002", "AC Chair", 60));
        bogies.add(new Bogie("B003", "First Class", 24));
        bogies.add(new Bogie("B004", "Sleeper", 72));
        bogies.add(new Bogie("B005", "General", 80));

        System.out.println("--- Current Train Consist ---");
        bogies.forEach(System.out::println);

        // 2. Convert list to stream
        // 3. map() extracts capacity values
        // 4. reduce() sums the capacities (0 is the identity/starting value)
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // 5. Display the total seating capacity
        System.out.println("\n========================================");
        System.out.println(" TOTAL SEATING CAPACITY: " + totalSeats);
        System.out.println("========================================");

        // Validation Checks
        validateAggregation(bogies, totalSeats);
    }

    private static void validateAggregation(List<Bogie> list, int calculatedTotal) {
        System.out.println("\n--- Validation Logs ---");

        // Test: Empty Collection Handling
        List<Bogie> emptyList = new ArrayList<>();
        int emptyTotal = emptyList.stream().map(Bogie::getCapacity).reduce(0, Integer::sum);
        System.out.println("Empty list total (Expected 0): " + emptyTotal);

        // Test: Original Collection Integrity
        System.out.println("Original list size remains: " + list.size());

        // Test: Single Bogie Handling
        if (!list.isEmpty()) {
            int singleTotal = list.subList(0, 1).stream().map(Bogie::getCapacity).reduce(0, Integer::sum);
            System.out.println("Single bogie test (B001): " + singleTotal);
        }
    }
}
