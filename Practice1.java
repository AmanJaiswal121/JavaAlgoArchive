import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 20, 80, 40, 10, 50, 20 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Max : " + arr[0]);
        System.out.println("Min : " + arr[arr.length - 1]);
    }
}
