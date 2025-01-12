package Numbers;

//It statrts with three digits.
//Always first digit is 0, second digit is 1 & third digit is 2.
//It will add last three values till the no. of terms reached.
//eg. 0 1 2 (0+1+2=3) (1+2+3=6) (2+3+6=11) (3+6+11=20) (6+11+20=37)........
//output - 0 1 2 3 6 11 20 37........

public class tribonacci {
    public static void main(String[] args) {
        int term = 10;
        int a = 0, b = 1, c = 2, d;
        for (int i = 0; i < term; i++) {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
}
