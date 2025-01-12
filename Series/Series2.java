package Series;

//Q2. Find the logic of this series.
// 0 3 8 15 24 35.......
// Logic is: 
// -> starts with n natural no.
// -> square the each natural no. and subtract it by 1.
// no. is 1 2 3 4 5 6 7......
// sq. is 1 4 9 16 25 36 49......
// subtract it by 1
// output- 0 3 8 15 24 35 48

public class Series2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print((i * i) - 1+" ");
        }
    }
}
