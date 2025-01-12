package Numbers;

import java.util.*;

// input- 145
// output- Yes
// exp: 1! + 4! + 5! = 145 which is equal to the sum of number.

public class StrongNumber {
    static int fac(int p) {
        int fact = 1;
        for (int i = 1; i <= p; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = r.nextInt();
        int sum = 0, rem = 0, chek = n;
        while (n > 0) {
            rem = n % 10;// 145=5
            sum += fac(rem);
            n /= 10;
        }
        System.out.println(chek == sum ? "Yes strong" : "No strong");
    }

}
