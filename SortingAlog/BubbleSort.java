package SortingAlog;
// Bubble sort:

// -> Bubble sort arrange n number of element of array by placing the biggest element in proper position.
// arr[] = {8, 7, 5, 6, 2}
// step-1: [8,7,5,6,2], [7,8,5,6,2], [7,5,8,6,2], [7,5,6,8,2], [7,5,6,2,8]
// step-2: [7,5,6,2], [5,7,6,2], [5,6,7,2], [5,6,2,7]
// step-3: [5,6,2], [5,2,6]
// step-4: [5,2], [2,5]
// Result is: [2,5,6,7,8]

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 8, 7, 5, 6, 2 };
        int temp;
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
