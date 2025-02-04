package Arrayes;

// Approach 2->
// size - 8
// input - {9 0 7 44 0 78 99 0}
// output - {9 7 44 78 99 0 0 0}

public class NonZeroLeftSide2 {
    public static void main(String[] args) {
        int arr[] = { 9, 0, 7, 44, 0, 78, 99, 0 };
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
