package Numbers;

/*
input- "5688248"
output- "5"

input- "61632826"
output- "6163"

input- "616338261"
output- "616338261"

Exp: because the highest odd number occur from that string is that number.
*/
public class highestOddNumber {
    public static String findHighestOdd(String input) {
        StringBuilder highestOdd = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            int digit = ch - '0'; // Convert char to integer

            // Check if digit is odd
            if (digit % 2 != 0) {
                highestOdd.append(digit);
            }
        }

        // If no odd numbers found, return an empty string
        return highestOdd.length() == 0 ? "" : highestOdd.toString();
    }

    public static void main(String[] args) {
        String a = "616338261";
        highestOddNumber h = new highestOddNumber();
        System.out.println(h.findHighestOdd(a));
    }
}
