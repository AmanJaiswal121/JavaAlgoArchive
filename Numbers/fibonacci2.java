package Numbers;

// Q. Find the given number is a fibonacci number or not.
// fibo series - 0 1 1 2 3 5 8 13 21 34......
// formula to check a number is a fibonacci no. or not is [5*(num*num)+4]
// eg. 5--->fibo, 15--->not fibo
//     8--->fibo,  4--->not fibo

public class fibonacci2 {
    public static void main(String[] args) {
        int num = 15;
        int sq = (5 * (num * num)) + 4;
        int check = (int) Math.sqrt(sq);
        System.out.println(sq == (check * check) ? "Fibo" : "Not fibo");
    }
}

