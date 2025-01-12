package Numbers;

// input - 13
// output - 1101
// exp: binary of 1101 is 13

public class B2_NumberToBinary {
    public static void main(String[] args) {
        int n = 13;
        int rem = 0;
        String bi = "";

        while (n > 0) {
            rem = n % 2;
            bi = rem + bi;
            n /= 2;
        }
        System.out.println(bi);
    }
}
