package Recursion;

// input - 5
// output - 1 2 3 4 5
// -> Without using loops

public class Rec1 {
    static int i = 1;

    static void disp(int n) {
        if (i <= n) {
            System.out.println(i);
            i++;
            disp(n);
        }
    }

    public static void main(String[] args) {
        disp(10);
    }
}
// public class Rec1 {
// static void disp(int n) {
// if (n>=1) {
// disp(n-1)
// System.out.println(n);
// }
// }

// public static void main(String[] args) {
// disp(5);
// }
// }
