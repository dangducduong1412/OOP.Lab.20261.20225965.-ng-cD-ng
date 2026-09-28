import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in array (n): ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        System.out.println("Enter " + n + " elements:");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        
        Arrays.sort(arr);

        double average = sum / n;

        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}