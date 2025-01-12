package Test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter String");
        String s = r.next();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not pallindrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Pallindrom");
    }

}
