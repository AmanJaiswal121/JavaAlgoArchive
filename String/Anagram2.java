package String;
import java.util.Arrays;
// Compaire two strings if both are same then they are anagram.
// s1="listen" and s2="silent" 
// Exp: count of each alpabet of s1 is equl to s2.
// s1: l=1, i=1, s=1, t=1, e=1, n=1
// s2: s=1, i=1, l=1, e=1, n=1, t=1 
// another example s1="abcde" and s2="bdeac"

public class Anagram2 {
    static boolean check(String s1, String s2) {
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() == s2.length()) {
            if (check(s1, s2)) {
                System.out.println("Yes Strings are Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
}
