package String;

// input - ab12g4
// output - 7
// exp: 1+2+4=7 Add all the digits present in a string.
public class Str3 {
    public static void main(String[] args) {
        String str = "ab12g4";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += (str.charAt(i) - 48);
            }
        }
        System.out.println(sum);
    }
}
// sum += (str.charAt(i) - 48); the ASCI value of 0 is 48,
// if we subtract any numeric cgaracter value with 48 then we get the number
// itself.