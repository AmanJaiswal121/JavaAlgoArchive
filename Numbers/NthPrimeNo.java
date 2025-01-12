package Numbers;

// input - 4
// output - 7
// exp: 2,3,5,7,11,13,17,19,23.......N, this are prime no. and go upto Nth term.
// if user give the input 4, means show the output as the 4th term prime number, which is 7.

public class NthPrimeNo {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return (count == 2);
    }

    public static void main(String[] args) {
        int term = 6;
        int c = 0;
        for (int i = 1;; i++) {
            if (isPrime(i)) {
                c++;
            }
            if (c == term) {
                System.out.println(i);
                break;
            }
        }
    }
}
