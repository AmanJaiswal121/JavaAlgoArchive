package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = r.nextInt();// 1634
        int count = 0;
        int check = num;

        while (check > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);

    }
}
