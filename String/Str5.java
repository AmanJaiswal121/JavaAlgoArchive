package String;

// input - "welcome"
// output - "welcemo"
// exp: first half remins same and second half shouled be in reverse order
public class Str5 {
    public static void main(String[] args) {
        String s = "welcome";
        String ans = "";
        for (int i = 0; i <= s.length() / 2; i++) {
            char ch = s.charAt(i);
            ans += ch;
        }

        for (int i = s.length() - 1; i > s.length() / 2; i--) {
            char ch = s.charAt(i);
            ans += ch;
        }
        System.out.println(ans);
    }
}
