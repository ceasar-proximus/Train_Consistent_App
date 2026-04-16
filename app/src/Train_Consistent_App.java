/**
 * @author karthik
 * UC7: Sort Bogies by Capacity (Comparator)
 * This class demonstrates sorting custom Bogie objects based on their
 * capacity using the Comparator interface.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class to model real-world attributes
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class Train_Consistent_App {
    public static void main(String[] args) {
        // 1. Create a List to store Passenger Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // 2. Add bogies with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("--- Train Planning: Sorting Bogies by Capacity ---");

        // 3. Sort the list using a Comparator (Ascending Order)
        // Using Comparator.comparingInt for a clean, modern approach
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Bogies sorted by capacity (Lowest to Highest):");
        System.out.println("----------------------------------------------");

        // 4. Display the sorted results
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Optional: Sorting in Descending Order for high-capacity planning
        System.out.println("\nBogies sorted by capacity (Highest to Lowest):");
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Sorting and planning complete.");
    }
}
