public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Bubble Sort: Passenger Bogie Capacities ===");

        // Array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.println("\nBefore Sorting:");
        printArray(capacities);

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\nAfter Sorting:");
        printArray(capacities);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}