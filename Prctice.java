import java.util.Arrays;

class Pratice {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 0, 0, 5, 6 };
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
