package Numbers;

import java.util.*;

public class prim_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Prime number ");
        else
            System.out.println("Not a prime number");

    }
}
