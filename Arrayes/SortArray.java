package Arrayes;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 3, 3, 4, 5, 5 };
        System.out.println("Not sorted :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
