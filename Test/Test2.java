package Test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter the number of table");
            int num = r.nextInt();
            int val = 0;
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    val = num * i;
                    System.out.println(num + " * " + i + " = " + val);
                }
            }else{
                System.out.println("Number should be greater then ZERO");
            }

        } catch (Exception e) {
            System.out.println("Enter a valid number.....");
        }
    }
}
