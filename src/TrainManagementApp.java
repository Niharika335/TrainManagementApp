import java.util.LinkedList;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial order
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}