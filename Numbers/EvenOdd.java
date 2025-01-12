package Numbers;


//Even Odd Programm java
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using Ternary Operator :-
        System.out.println("Enter the value :");
        int a = scanner.nextInt();
        String num = (a % 2 == 0) ? "even" : "odd";
        System.out.println(a + " is " + num);

        // Using If Else :-
        /*
         * System.out.println("Enter the value :");
         * int a=scanner.nextInt();
         * if(a%2 == 0)
         * {
         * System.out.println(a+" is a even number.");
         * }
         * else
         * {
         * System.out.println(a+" is a odd number.");
         * }
         */

    }

}