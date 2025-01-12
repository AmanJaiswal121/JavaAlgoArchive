package String;

// String pangram means a single string contain all the 26 letters of alphabets.
// input = "The quick brown fox jumps over the lazy dog"
// output = pangram
// explanation: this string contains all 26 alphbets

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangram(str.toLowerCase()));
    }

    public static String pangram(String str) {
        if (str.length() < 26) {
            return "No pangram";
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                // "str.indexOf(ch) < 0" it return some value if the char is present
                // but in case, if the char is not present then it return -1
                if (str.indexOf(ch) < 0) {
                    return "No pangram " + str.indexOf(ch);
                }
            }
        }
        return "Yes pangram";
    }
}
