import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Safe Search Operation ===");

        // Example 1: Empty array (will throw exception)
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear Search (can replace with Binary if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}

