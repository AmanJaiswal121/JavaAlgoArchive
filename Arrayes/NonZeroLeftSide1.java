package Arrayes;

import java.util.Scanner;
// Approach 1->
// size - 8
// input - {9 0 7 44 0 78 99 0}
// output - {9 7 44 78 99 0 0 0}
public class NonZeroLeftSide1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size = r.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }

        int temp[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < temp.length; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
