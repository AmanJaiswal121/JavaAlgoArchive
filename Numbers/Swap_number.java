package Numbers;

import java.util.*;

public class Swap_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b = sc.nextInt();
		int c;

		// with using third variable
		c = b - a;
		a = a + c;
		b = b - c;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);

		// without using third varable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);

	}
}
