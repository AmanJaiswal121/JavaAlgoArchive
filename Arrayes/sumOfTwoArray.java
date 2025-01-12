package Arrayes;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfTwoArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Size 1");
        int size1 = r.nextInt();
        int arr1[] = new int[size1];

        for (int i = 0; i < size1; i++) {
            arr1[i] = r.nextInt();
        }

        System.out.println("Size 2");
        int size2 = r.nextInt();
        int arr2[] = new int[size2];

        for (int j = 0; j < size2; j++) {
            arr2[j] = r.nextInt();
        }
        int temp1 = arr1[size1 - 1];
        int temp2 = arr2[size2 - 1];

        temp1 = arr1[0] + arr1[1] + arr1[2];
        temp2 = arr2[0] + arr2[1] + arr2[2];
        System.out.println(temp1 + temp2);
    }
}
