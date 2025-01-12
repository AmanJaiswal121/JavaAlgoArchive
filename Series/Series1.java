package Series;
//Q1. Find the logic of this series.

// 3 4 9 8 15 12.........
// Logic is:
// -> take n natural numbers
// -> even no. should multiply by 2 & odd no. should multiply by 3
// 1 2 3 4 5 6
// * * * * * *
// 3 2 3 2 3 2

// output - 3 4 9 8 15 12..........

public class Series1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0)
                System.out.println(i * 2);
            else
                System.out.println(i * 3);
        }
    }
}
