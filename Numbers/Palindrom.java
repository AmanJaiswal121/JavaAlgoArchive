package Numbers;

import java.util.Scanner;
// Palindrom number means, a number which mirror image looks same.
// eg. num = 121 - it is looks same "thats an palindrom no."
//123321, 0990 ...... - palindrom
//123, 445566, 123123 - not palindrom
public class Palindrom {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        int rem;
        int count = 0;
        int check = num;

        while (num > 0) {
            rem = num % 10;
            count = (count * 10) + rem;
            num /= 10;
        }

        if (check == count)
            System.out.println("Palindrom");
        else
            System.out.println("not palindrom");
    }
}
