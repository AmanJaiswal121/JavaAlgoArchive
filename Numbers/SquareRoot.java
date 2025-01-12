package Numbers;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        double squareroot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + squareroot);
    }
}
