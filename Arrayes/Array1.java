package Arrayes;

// input-arr={12,4,7,8,9,7,4,1}
// n=7 
// output-26 
// exp:12+4+9+1=26
// ->whenever the array element value equal to n,then skip that value and the 
//   next element value also.

public class Array1 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 8, 9, 7, 4, 1 };
        int n = 7, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                i++;
            } else {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
