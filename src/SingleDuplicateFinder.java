import java.util.*;

public class SingleDuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int duplicate = findSingleDuplicate(arr);
        if (duplicate != -1) {
            System.out.println("The single duplicate in the array is: " + duplicate);
        } else {
            System.out.println("No duplicate found in the array.");
        }

        scanner.close();
    }

    public static int findSingleDuplicate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                return Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Restore the array to its original state
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        return -1; // Indicates no duplicate found
    }
}
