package Arrayes;

// input - arr{3, 7, 1, 4, 5, 6, 7, 10}
// startingPoint - 1
// endingPoint - 6
// output - 27
// emp: 3+7+7+10 = 27
// -> when array element value is equal to startingPoint until unless
//    it will not encounter with endingPoint we cannot make sum of array elemens.
// -> we have to skip array elements from startingPoint to endingPoint.

public class Array2 {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 4, 5, 6, 7, 10 };
        int start = 1, end = 6, sum = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == start) {
                flag = false;
            } else if (flag == true) {
                sum += arr[i];
            } else if (end == arr[i]) {
                flag = true;
            }
        }
        System.out.println(sum);
    }
}
