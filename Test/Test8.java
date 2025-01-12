package Test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter number");
        int num = r.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
