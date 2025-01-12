package String;

// input - "abhbbacdl"
// output - 
//  a -> 2
//  b -> 3
//  c -> 1
//  d -> 1
//  h -> 1
//  l -> 1 
// exp: We have to count the number of occurence of each character.

public class ASCIcharFrequency {
    public static void main(String[] args) {
        // [128]- because total number of ASCI range is 0 - 127.
        int arr[] = new int[128];
        String str = "abhbbacdl";
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) i + " - " + arr[i]);
                // (char)i- Type caasting the integer to ASCI value of the character.
            }
        }
    }
}
