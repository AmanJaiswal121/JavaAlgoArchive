package Numbers;

// input n=9
// output- yes
// because squre of 9=81 and if we count the digite sum of 81(8+1)=9
public class NeonNo {
    public static void main(String[] args) {
        int n = 9, check = n, sum = 0, rem = 0,sq=n*n;
        while (n > 0) {
            rem = sq % 10;
            sum += rem;
            sq /= 10;
        }
        System.out.println(check == sum ? "Neon number" : "Not neon number");
    }
}
