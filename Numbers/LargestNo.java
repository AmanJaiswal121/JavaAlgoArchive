package Numbers;

import java.util.*;

public class LargestNo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size");
        System.out.println("array value are");
        int size = r.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Value is " + arr[1]);
    }

}
