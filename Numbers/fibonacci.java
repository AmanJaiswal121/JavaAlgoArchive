package Numbers;
//It starts with two digits
//Always first value is 0 & second value is 1.
//It will add last two values till the no. of terms reached.
//eg. 0 1 (0+1=1) (1+1=2) (1+2=3) (2+3=5) (3+5=8) (5+8=13).......
//output - 0 1 1 2 3 5 8 13......

public class fibonacci {
    public static void main(String[] args) {
        int term = 10;
        int a = 0, b = 1, c;
        for (int i = 0; i < term; i++) {
            System.out.print(a+" ");//0,1,1,2,3,5,8
            c = a + b;//c=1, c=2, c=3, c=5, c=8, c=13
            a = b;//a=1, a=1, a=2, a=3, a=5, a=8
            b = c;//b=1, b=2, b=3, b=5, b=8, b=13
        }
    }
}
