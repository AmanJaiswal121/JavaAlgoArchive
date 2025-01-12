package Numbers;


import java.util.*;

public class primeNo_range {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range one :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the range two :");
        int num2 = scanner.nextInt();

        for (i = num1; i <= num2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
               System.out.println(j + " ");
        }
    }
}

