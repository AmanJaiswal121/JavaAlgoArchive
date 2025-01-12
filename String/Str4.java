package String;

// input - acatcatbcat
// output - 3
// exp: number of cat present in a string.
public class Str4 {
    public static void main(String[] args) {
        String str = "acatcatbcat";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                i++;
                if (str.charAt(i) == 'a') {
                    i++;
                    if (str.charAt(i) == 't') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
