package String;

import java.util.Arrays;

// Show the duplicate values from string
// input: s = "abcdeab";
// output: a b
public class DuplicateShow {
    public static void main(String[] args) {
        String s = "abcdeab";
        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String a = "";
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                // System.out.print(ch[i] + " ");
                a += ch[i] + " ";
                while ((i < ch.length - 1) && (ch[i] == ch[i + 1])) {
                    i++;
                }
            }
        }
        System.out.println(a);
    }
}
