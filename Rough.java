import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int term = r.nextInt();
        int a = 0;
        int b = 1;
        if (term < 0) {
            System.out.println("Term cannot be negative");
        }
        if (term == 0) {
            System.out.println(a);
        } else if (term == 1) {
            System.out.println(b);
        } else {
            int c = 0;
            for (int i = 2; i <= term; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}