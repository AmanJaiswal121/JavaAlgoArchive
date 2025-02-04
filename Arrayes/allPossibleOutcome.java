package Arrayes;

import java.util.Arrays;

// Find all the possible outcomes for the given target.
// input- arr[] = { 5, 2, 4, 10, 9, 12, 16, 7 } and target = 11
// output- 2 + 9 = 11
//         4 + 7 = 11
// exp: finding two digits whose sum is equal to 11.

public class allPossibleOutcome {
    public static void main(String[] args) {
        int target = 11;
        int[] arr = { 5, 2, 4, 10, 9, 12, 16, 7 };
        int start = 0;
        int end = arr.length - 1;
        boolean noPair=true;
        Arrays.sort(arr);

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println(arr[start] + " + " + arr[end] + " = " + target);
                // If I only want to get pair whose sum is equal to target, then no need to use
                // start++, end--
                // System.exit(0);
                start++;
                end--;
                noPair=false;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        if (noPair) {
            System.out.println("No pair founds");
        }
    }
}
