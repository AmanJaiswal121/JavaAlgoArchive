package String;

// input 1 - rahul
// input 2 - harlu
// output - Anagram
// Exp: r = 1, a = 1, h = 1, u = 1, l = 1
//      h = 1, a = 1, r = 1, l = 1, u = 1
// -> number of occurance of both the string can be equal then its a anagram

public class Anagram1 {
    public static void main(String[] args) {
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        String s1 = "rahua";
        String s2 = "harlu";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            arr1[ch]++;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            arr2[ch]++;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                System.out.print((char) (i) + "-" + arr1[i] + "  ");
            }
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                System.out.print((char) (i) + "-" + arr2[i] + "  ");
            }
        }

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        System.out.println();

        System.out.println((count == arr1.length) ? "Anagram" : "Not anagram");

    }
}
