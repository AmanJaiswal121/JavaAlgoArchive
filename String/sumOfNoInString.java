package String;

import java.util.regex.Pattern;

// input - "hello hii 1000 bye 200 hi 123"
// output - 1323
// exp: 1000 + 200 + 123 = 1323
public class sumOfNoInString {
    public static void main(String[] args) {
        String s = "hello hii 1000 bye 200 hi 123";
        int sum = 0;
        String[] arr = s.split(" ");
        //{"hello", "hii", "1000", "bye", "200", "hi", "123"}
        for (String e : arr) {
            //System.out.println(e);
            if (e.charAt(0) >= '0' && e.charAt(0) <= '9') {
                sum += Integer.parseInt(e);
            }
        }
        System.out.println(sum);
    }
}
// Another method -
// for (String e : arr) {
//     boolean b=Pattern.matches("[0-9]*", e);
//     sum += Integer.parseInt(e);
// }
// System.out.println(sum);

