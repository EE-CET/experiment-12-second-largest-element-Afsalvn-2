import java.util.Scanner;

public class SecondLargest {

    public int getSecondLargest(int[] arr, int n) {
        if (n < 2) return -1;

        // FIX 1: Use the absolute minimum possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            // FIX 2: Allow duplicates to be captured as the second largest
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            SecondLargest solver = new SecondLargest();
            System.out.println(solver.getSecondLargest(arr, n));
        }
        
        sc.close();
    }
}
