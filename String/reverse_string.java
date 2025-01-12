package String;
//Reverse a String without using StringBuffer and StringBuilder
import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        String s = "hello";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
// Scanner r = new Scanner(System.in);
// String str = r.nextLine();
// StringBuffer s = new StringBuffer(str);
// System.out.println(s.reverse());