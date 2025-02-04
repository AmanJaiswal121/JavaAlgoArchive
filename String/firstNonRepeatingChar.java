package String;
/*
input- "rtyttrfxf"
output- y
exp: print the first non repeating character from array.
 */
public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "rtyttrfxf";
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                System.exit(0);
            }
        }
    }
}
