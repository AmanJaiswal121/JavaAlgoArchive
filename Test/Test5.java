package Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = r.nextLine();
        int cout = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                cout++;
            }
        }

        if (cout > 0) {
            System.out.println("Vowel");
        } else {
            System.out.println("not vowel");
        }
    }
}
