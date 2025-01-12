package Test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter how many number your want to see for checking the number is maximum number");
            int size = r.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                try {
                    System.out.println("Enter numbers " + (i + 1));
                    arr[i] = r.nextInt();
                } catch (Exception e) {
                    System.out.println("Ivalid input.....Please enter a valid number");
                }
            }
            Arrays.sort(arr);
            System.out.println("Maximum number is :" + arr[size - 1]);

        } catch (Exception e) {
            System.out.println("Invalid input......!");
        }
    }
}
