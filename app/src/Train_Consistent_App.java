/**
 * @author karthik
 * UC6: Map Bogie to Capacity (HashMap)
 * This class demonstrates associating bogie types with their respective
 * capacities using a Key-Value pair structure.
 */
import java.util.HashMap;
import java.util.Map;

public class Train_Consistent_App {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie names (Key) and capacities (Value)
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Insert capacity values using the put() method
        // Mapping Passenger Bogies
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);

        // Mapping Goods Bogies
        bogieCapacityMap.put("Rectangular", 5000); // e.g., in kg or units
        bogieCapacityMap.put("Cylindrical", 3000);

        System.out.println("--- Train Bogie Capacity Management System ---");
        System.out.println("Bogie Name -> Capacity");
        System.out.println("----------------------------------------------");

        // 3. Iterate over the map using entrySet() to display details
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // 4. Demonstration of Fast Lookup
        String searchKey = "Sleeper";
        if (bogieCapacityMap.containsKey(searchKey)) {
            System.out.println("\n[Lookup] Capacity for " + searchKey + " is: " + bogieCapacityMap.get(searchKey));
        }

        System.out.println("----------------------------------------------");
        System.out.println("System update complete.");
    }
}
