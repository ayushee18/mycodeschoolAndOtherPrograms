package fibonacciAndFactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciRecurssion {
	
	static int n1=0; static int n2=1; int n3; static String numString;
	public static void main(String[] args) {
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter the number");
		try {
				numString = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num = Integer.parseInt(numString);
		System.out.print(n1+", "+n2+", ");
		FibonacciRecurssion fibonacciRecurssion = new FibonacciRecurssion();
		fibonacciRecurssion.fibonacciSeriesRecurssion(num-2);
		
	}

	public void fibonacciSeriesRecurssion(int num) {
		if(num>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+", ");
			fibonacciSeriesRecurssion(num-1);
		}
	}
}
