package Numbers;

import java.util.*;

// input n=36
// output- yes 
// because number 36 is a PerfectSquare fo 6.
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = r.nextInt();
        boolean flage = false;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                flage = true;
            }
        }
        System.out.println(flage ? "Perfct" : "Not perfect");
    }
}
