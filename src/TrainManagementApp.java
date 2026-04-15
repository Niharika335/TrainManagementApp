import java.util.ArrayList;
import java.util.List;

// GoodsBogie Class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Compliance Check ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nBogie Details:");
        bogies.forEach(System.out::println);

        System.out.println("\nSafety Status: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}