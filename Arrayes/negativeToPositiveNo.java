package Arrayes;

import java.util.Arrays;
import java.util.Scanner;

public class negativeToPositiveNo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt();
        }
        Arrays.sort(arr);
        for (int e : arr) {
            System.out.println(e + " ");
        }
    }
}
