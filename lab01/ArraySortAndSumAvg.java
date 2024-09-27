package lab01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndSumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Your array is: " + Arrays.toString(arr));

        Arrays.sort(arr);
        
        int sum = 0;
        for(int i=0; i<size; i++) {
            sum += arr[i];
        }

        System.out.println("Your array after sort is: " + Arrays.toString(arr));
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + (double)sum/size);

        scanner.close();
    }
}
