package Arrayes;

import java.util.Arrays;

//Find the duplicate valuse from array.

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 10, 30, 30, 10, 40, 50, 60, 40 };
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);

                while (arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
