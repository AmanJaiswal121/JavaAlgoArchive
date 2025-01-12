package Test;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        try {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = r.nextInt();
            if (num > 0) {
                System.out.println(num + " is a positive number");
            } else if (num == 0) {
                System.out.println(num + " is a whole number");
            } else {
                System.out.println(num + " is a negitive nuber");
            }
        } catch (Exception e) {
            System.out.println("Invalide number");
        }

    }
}
