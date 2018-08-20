package fibonacciAndFactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecurssion {
	
	public static void main(String[] args) {
		String numString = "";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter the number");
		try {
			numString = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num = Integer.parseInt(numString);
		FactorialRecurssion factorialRecurssion = new FactorialRecurssion();
		System.out.println(factorialRecurssion.findFactorialRecurssion(num));
	}

	public int findFactorialRecurssion(int num) {
		if(num == 0)
			return 1;
		else
			return num*findFactorialRecurssion(num-1);
	}
}
