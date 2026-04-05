
import java.util.Scanner;

public class SecondLargest {

    // Task: Find the 2nd largest element without sorting
    public int getSecondLargest(int[] arr, int n) {
        // Edge case: If there are fewer than 2 elements, a second largest doesn't exist
        if (n < 2) return -1;

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            // If we find a new largest, the old largest gets bumped down to second largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            // If it's not the largest, but it is bigger than our current second largest
            // (and we ensure it's not a duplicate of the largest)
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            SecondLargest solver = new SecondLargest();
            System.out.println(solver.getSecondLargest(arr, n));
        }
        
        sc.close();
    }
}
