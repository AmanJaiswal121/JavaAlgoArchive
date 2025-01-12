package Arrayes;
import java.util.Scanner;
// //input - arr[6]={1,2,3,0,5,1}
// output - Yes
// exp: addition of first half of array + addition of second half of array
//           1+2+3 = 0+5+1
// if resultant is same thn print YES, if wrong print NO

public class firsthalfSecondhalf {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Size of the array");
        int size=r.nextInt();
        int[] arr = new int[7];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        for (int i = 0; i <= arr.length / 2; i++) {
            sum1 += arr[i];
        }
        
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println(sum1 +" "+sum2);
        //System.out.println((sum1 == sum2) ? "Yes" : "No");
    }
}
