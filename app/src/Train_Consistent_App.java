import java.util.ArrayList;
import java.util.List;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 * Author: Karthik
 * Class Name: Train_Consistent_App
 */
public class Train_Consistent_App {

    // Internal class representing a Goods Bogie
    static class GoodsBogie {
        String id;
        String shape; // e.g., Cylindrical, Rectangular
        String cargo;

        public GoodsBogie(String id, String shape, String cargo) {
            this.id = id;
            this.shape = shape;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return String.format("GoodsBogie[ID: %s, Shape: %-12s, Cargo: %s]", id, shape, cargo);
        }
    }

    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("G001", "Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("G002", "Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("G003", "Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("G004", "Box", "Grain"));

        System.out.println("--- Checking Train Safety Compliance ---");
        goodsConsist.forEach(System.out::println);

        // 2, 3 & 4. Use stream().allMatch() to validate every bogie against safety rules
        // Business Rule: If shape is "Cylindrical", cargo MUST be "Petroleum"
        boolean isTrainSafe = goodsConsist.stream().allMatch(b -> {
            if (b.shape.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Other shapes are inherently safe for now
        });

        // 5. Display result
        System.out.println("\nFinal Safety Status:");
        if (isTrainSafe) {
            System.out.println("[COMPLIANT] All bogies meet safety standards. Ready for departure.");
        } else {
            System.out.println("[DANGER] Safety violation detected! Check cylindrical bogie cargo.");
        }

        // Testing an invalid scenario
        System.out.println("\n--- Testing Invalid Scenario (Cylindrical carrying Coal) ---");
        List<GoodsBogie> unsafeConsist = new ArrayList<>();
        unsafeConsist.add(new GoodsBogie("G005", "Cylindrical", "Coal"));

        boolean unsafeCheck = unsafeConsist.stream().allMatch(b ->
                !b.shape.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum")
        );
        System.out.println("Is unsafe train marked safe? " + unsafeCheck);
    }
}
