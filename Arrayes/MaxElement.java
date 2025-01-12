package Arrayes;

import java.util.Scanner;

//Q. Find the max element from the given array.
public class MaxElement {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = r.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nMax element of the array is " + max);
    }
}
