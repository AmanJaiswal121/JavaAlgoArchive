package String;

// input - a67Jk&op#Hello
// output - A67jK&OP#hELLO
public class Str2 {
    public static void main(String[] args) {
        String str = "a67Jk&op#Hello";
        String sl = str.toLowerCase(), su = str.toUpperCase();
        String sb = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lower = sl.charAt(i);
            char upper = su.charAt(i);
            if (ch == lower) {
                sb += upper;
            } else if (ch == upper) {
                sb += lower;
            } else {

            }
        }
        System.out.println(sb);
    }
}
