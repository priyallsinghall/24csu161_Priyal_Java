import java.util.Scanner;

public class RemoveDuplicatesArray {

    // Function to remove duplicates and return new array size
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];  // last element always included

        // Copy back to original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j; // new length
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Priyal Singhal 24csu161");

        int[] arr = new int[5];

        // DoD 1: Input
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Sort array first (so duplicates are together)
        java.util.Arrays.sort(arr);

        // Remove duplicates
        int newLength = removeDuplicates(arr, arr.length);

        // DoD 2: Display result
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
