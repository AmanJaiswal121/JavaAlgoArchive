package String;

// input - hello123@&bye##44ZZ
// output - hellobyeZZ12344@&##
public class Str1 {
    public static void main(String[] args) {
        String str = "hello123@&bye##44ZZ";
        String alpha = "", numeric = "", specialChar = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alpha += ch;
            } else if (ch >= '0' && ch <= '9') {
                numeric += ch;
            } else {
                specialChar += ch;
            }
        }
        System.out.println(alpha + numeric + specialChar);
    }
}
