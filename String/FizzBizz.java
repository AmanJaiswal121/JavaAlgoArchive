package String;

// FizzBuzz: Write a program that prints the numbers from 1 to 100.
// But for multiples of three print"Fizz" instead of the number 
// and for the multiples of five print"Buzz".
// For numbers which are multiples of both three and five print"FizzBuzz".

public class FizzBizz {
    public static void main(String[] args) {
        int n = 100;
        if (n >= 1 && n <= 100) {
            if (n % 15 == 0)
                System.out.println("FizzBuzz");
            else if (n % 3 == 0)
                System.out.println("Fizz");
            else if (n % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println();
        } else {
            System.out.println("Number should not be in range");
        }
    }

}
