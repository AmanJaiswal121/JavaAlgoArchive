package Numbers;

import java.lang.reflect.Array;
import java.util.Arrays;

// input - 786234
// output - 876432
// exp: make the biggest number from the given number
public class makeMeBig {
    static String sort(String s) {
        char[] arr = s.toCharArray();// {'7', '8', '6', '2', '3', '4'}
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // arr[i] > arr[j] -> o/p - 234678
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char)temp;
                }
            }
        }
        String str = new String(arr);
        return str;
    }

    public static void main(String[] args) {
        int n = 786234;
        String s = n + "";
        String ans = sort(s);
        System.out.println(Integer.parseInt(ans));
    }
}
