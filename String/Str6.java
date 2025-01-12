package String;

import java.util.Scanner;

// input - 1234
// output - one two three four

public class Str6 {
    public static void main(String[] args) {
        String[] arr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        String s = "";
        while (n > 0) {
            int rem = n % 10;
            s = arr[rem] + " "+s;
            n /= 10;
        }
        System.out.println(s);
    }
}
