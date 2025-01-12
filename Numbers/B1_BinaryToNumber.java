package Numbers;

// input - 1101
// output - 13
// exp: binary of 1101 is 13
// other example:-
// 1000 - 8
// 111 - 7

public class B1_BinaryToNumber {
    public static void main(String[] args) {
        int n = 1101, bi = 1;
        int rem = 0, sum = 0;

        while (n > 0) {
            rem = n % 10;
            sum += rem * bi;
            n /= 10;
            bi *= 2;
        }
        System.out.println(sum);
    }
}
