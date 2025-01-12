package Patterns;

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// for:- i + j >= n + 1, else:- one space

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
