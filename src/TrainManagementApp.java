public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Linear Search: Find Bogie ID ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // early termination
            }
        }

        // Result if not found
        if (!found) {
            System.out.println("Bogie not found.");
        }
    }
}
