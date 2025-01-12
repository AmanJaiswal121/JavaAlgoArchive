import java.util.Scanner;

public class PassWord {
    // false - weak
    // true - stong
    static boolean sequence(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length() - 2; i++) {
            char ch = s.charAt(i);
            if (s.charAt(i + 1) == ch + 1 && s.charAt(i + 2) == ch + 2) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static boolean consecutive(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length() - 2; i++) {
            char ch = s.charAt(i);
            if (s.charAt(i + 1) == s.charAt(i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static boolean count(String s) {
        boolean flag = true;
        if (s.length() < 8) {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String str = r.next();
        int count = 0;

        if (sequence(str) == false) {
            count++;
        }
    }
}
