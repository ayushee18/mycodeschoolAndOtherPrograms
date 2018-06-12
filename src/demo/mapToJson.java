package demo;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();                 // Reading input from STDIN
        String[] cases = s.next().split(" ");
        int[] a = new int[t];
        for (int i =0 ; i<t;i++) {
        	a[i] = Integer.parseInt(cases[i]);
		}
        
        for(int i = 0;i<t;i++) {
        	for(int j = 1;j<=a[i];j++) {
        		if(j/3==0 && j/5==0) {
        			System.out.println("FizzBuzz");
        		}else if(j/5==0) {
        			System.out.println("Buzz");
        		}else if(j/3==0) {
        			System.out.println("Fizz");
        		}else {
        			System.out.println(j);
        		}	
        	}
        }
        

        // Write your code here

    }
}