package Numbers;

import java.util.Scanner;

//Q. -> Number has already given
//   -> Add all the odd no. and even no. then multiply them.
//   Input- 2514795 
//   even no. 2,4 = 6, odd no. 5,1,7,9,5 = 27
//   output - 27 * 6 = 162
public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int input = r.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (input > 0) {
            int digit = input % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            input /= 10;
        }
        int result = evenSum * oddSum;
        System.out.println(result);
    }
}
