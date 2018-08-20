package fibonacciAndFactorial;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fibonacci number");
		int num = sc.nextInt();
		fibonacci.fibonacciSeries(num);
		sc.close();
	}
	
	public void fibonacciSeries(int num) {
		int n1 = 0; int n2 = 1; int n3;
		System.out.print(n1+", "+n2+", ");
		for(int i=2;i<num;i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+", ");
		}
	}
}
