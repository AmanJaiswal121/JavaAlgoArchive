package Numbers;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        int rem = 0;
        System.out.println("Reverse order is ");
        while (num > 0) {
            rem = num % 10;
            
            System.out.print(rem);
            num /= 10;
        }

    }
}
