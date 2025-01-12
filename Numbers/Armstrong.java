package Numbers;

import java.util.Scanner;
// eg. int num = 153
// if((1*1*1) + (5*5*5) + (3*3*3) = 153 then its an armstrong number.

public class Armstrong {
    static int fact(int base, int power) {
        int f = 1;
        for (int i = 1; i <= power; i++) {
            f *= base;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = r.nextInt();
        int check = num;
        int check2 = num;
        int digit = 0;
        int sum = 0;
        while (check > 0) {
            check /= 10;
            digit++;
        }

        while (check2 > 0) {
            int rem = check2 % 10;
            sum += fact(rem, digit);
            check2 /= 10;
        }
        System.out.println((num == sum) ? "Armstrom number" : "Not armstrom number");
    }
}
