import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * UC11: Validate Train ID & Cargo Codes (Regex)
 * Author: Karthik
 * Class Name: Train_Consistent_App
 */
public class Train_Consistent_App {

    // Regex Definitions
    // TRN- followed by exactly 4 digits
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";

    // PET- followed by exactly 2 uppercase letters
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    public static void main(String[] args) {
        System.out.println("=== Railway Input Validation System ===\n");

        // Test Cases for Train ID
        validateTrainID("TRN-1234");  // Valid
        validateTrainID("TRAIN12");   // Invalid: Wrong prefix
        validateTrainID("TRN-123");    // Invalid: Too few digits
        validateTrainID("TRN-12345");  // Invalid: Too many digits

        System.out.println();

        // Test Cases for Cargo Code
        validateCargoCode("PET-AB");    // Valid
        validateCargoCode("PET-ab");    // Invalid: Lowercase
        validateCargoCode("PET-12");    // Invalid: Digits instead of letters
        validateCargoCode("PET-ABC");   // Invalid: Too many letters

        System.out.println("\nValidation process complete. Program continues...");
    }

    /**
     * Validates Train ID using Pattern and Matcher
     */
    public static void validateTrainID(String input) {
        // Compile the pattern
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        // Create matcher for the input
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("[SUCCESS] Train ID '" + input + "' is VALID.");
        } else {
            System.out.println("[ERROR] Train ID '" + input + "' is INVALID. (Expected Format: TRN-1234)");
        }
    }

    /**
     * Validates Cargo Code using Pattern and Matcher
     */
    public static void validateCargoCode(String input) {
        Pattern pattern = Pattern.compile(CARGO_CODE_REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("[SUCCESS] Cargo Code '" + input + "' is VALID.");
        } else {
            System.out.println("[ERROR] Cargo Code '" + input + "' is INVALID. (Expected Format: PET-AB)");
        }
    }
}
