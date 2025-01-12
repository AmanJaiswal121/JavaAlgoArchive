package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = r.nextInt();//8

        System.out.println("Enter second number ");
        int num2 = r.nextInt();//20

        num1 = num2 - num1;//20 - 8 = 12
        num2 = num2 - num1;//8
        num1 = num2 + num1;

        System.out.println("num one " + num1 + " " + "num two " + num2);

    }
}
