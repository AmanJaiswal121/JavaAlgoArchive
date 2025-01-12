package Recursion;

// input - 4
// output - 4 3 2 1 1 2 3 4
// input - 5
// output - 5 4 3 2 1 1 2 3 4 5

public class Rec2 {
    static void disp(int n) {
        if (n >= 1) {
            System.out.print(n+" ");
            disp(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        disp(5);
    }

}
