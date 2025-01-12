package Recursion;

//input - 5
// output - 15
// exp: 5+4+3+2+1 = 15
public class Rec3 {
    //static int sum = 0;

    static int fun(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + fun(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}
