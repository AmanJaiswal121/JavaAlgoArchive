package String;

import java.util.Arrays;

// Remove the duplicate values from the string
// input: s = "abcdeab";
// output: abcde
public class DuplicateRemove {
    public static void main(String[] args) {
        String s = "abcdaeb";
        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        System.out.print(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                System.out.print(ch[i]);
            }
        }
    }
}
