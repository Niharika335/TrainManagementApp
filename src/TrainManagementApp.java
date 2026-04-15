import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample Inputs (you can later replace with Scanner input)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display Results
        System.out.println("\nTrain ID: " + trainId + " -> " +
                (isTrainValid ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode + " -> " +
                (isCargoValid ? "Valid" : "Invalid"));
    }
}