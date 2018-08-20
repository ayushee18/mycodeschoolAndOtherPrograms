package fibonacciAndFactorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(factorial.findFactorial(num));
	}
	
	public int findFactorial(int num) {
		 int result = 1;
		 for(int i=1;i<num;i++) {
			 result = result*(i+1);
		 }
		 
		 return result;
	}
}
