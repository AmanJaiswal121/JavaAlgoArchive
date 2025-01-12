package Arrayes;

import java.util.Scanner;

public class ArrayPalindrom {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size = r.nextInt();
        int[] arr = new int[size];
        int i = 0;
        int j = size - 1;
        for (int z = 0; z < size; z++) {
            arr[z] = r.nextInt();
        }
        while (i < j) {
            if (arr[i] != arr[j]) {
                System.out.println("Not palindrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrom");
    }
}
