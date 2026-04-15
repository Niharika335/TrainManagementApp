import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Sort Bogie Names (Arrays.sort) ===");

        // Array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        // After sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}
