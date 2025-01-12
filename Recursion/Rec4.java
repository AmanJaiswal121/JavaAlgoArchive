package Recursion;
// input - 5 
// output - 120
// factorial of then nummber
// exp: 5*4*3*2*1=120
public class Rec4 {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
