import java.util.ArrayList;
import java.util.List;

/**
 * Author - Karthik
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        // Step 1: Print welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize an empty List to store bogies using ArrayList
        // We use the List interface for abstraction to store dynamic bogie data
        List<Object> trainConsist = new ArrayList<>();

        // Step 3: Display the initial bogie count
        // .size() returns the number of elements currently in the list
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Step 4: Confirm initialization
        System.out.println("Train consist initialized. Ready for bogie management.");
    }
}
