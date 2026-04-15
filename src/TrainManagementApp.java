import java.util.LinkedHashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}