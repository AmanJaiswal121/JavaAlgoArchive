package Numbers;

import java.util.Scanner;

// Perfect number --->
// int num = 6; then no. less then 6 are 1 2 3 4 5
// check, out of 1 2 3 4 5 how many no. can completly divide 6
// 1 2 3 can completly divide 6
// add all of them, if their sum is equal to the given no. that means our no. in perfect no.
// 1 + 2 + 3 = 6
public class PerfectNo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        int count = 0;
        int check = num;
        for (int i = 1; i < num/2; i++) {
            if (num % i == 0) {
                count += i;
            }
        }
        if (count == check)
            System.out.println("Perfect no.");
        else
            System.out.println("Not perfect no.");
    }
}
// num/2 because, remove the number of iterations
// value cannot exiceeds half of the number.