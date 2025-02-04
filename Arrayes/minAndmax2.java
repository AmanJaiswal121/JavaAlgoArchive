package Arrayes;

import java.util.Scanner;

// without using Arrays.sort() method
public class minAndmax2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = r.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
