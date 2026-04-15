import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Binary Search: Find Bogie ID ===");

        // Unsorted bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort the array (MANDATORY)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Search key
        String searchKey = "BG309";

        int result = binarySearch(bogieIds, searchKey);

        if (result != -1) {
            System.out.println("Bogie Found at index: " + result);
        } else {
            System.out.println("Bogie not found.");
        }
    }

    // Binary Search Method
    public static int binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid; // found
            }
            else if (comparison > 0) {
                low = mid + 1; // search right
            }
            else {
                high = mid - 1; // search left
            }
        }

        return -1; // not found
    }
}

