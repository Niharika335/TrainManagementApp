import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        // UC2: Add Passenger Bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display after insertion
        System.out.println("\nAfter adding bogies:");
        System.out.println(trainConsist);

        // Remove a bogie (AC Chair)
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        // Check if Sleeper exists
        boolean exists = trainConsist.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}