import java.util.Arrays;

public class Pratice2 {
    public static void main(String[] args) {
        String s = "abcdeab";
        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                System.out.print(ch[i]);
            } 
        }
    }
}
