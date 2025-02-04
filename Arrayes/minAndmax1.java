package Arrayes;
// Using Arrays.sort() method.

import java.util.Arrays;
import java.util.Scanner;
public class minAndmax1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size = r.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();     
        }
        Arrays.sort(arr);
        
        System.out.println("Min "+arr[0]);
        System.out.println("Max "+arr[size - 1]);
    }
}
