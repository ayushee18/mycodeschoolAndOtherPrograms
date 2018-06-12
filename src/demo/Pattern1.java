package demo;

public class Pattern1 {
	static int minSum(int array[], int number)
    {
        int s = array[0], prev = array[0];
     
        for (int i = 1; i < number; i++) {
            if (array[i] <= prev) {
                prev = prev + 1;
                s = s + prev;
            } else {
                s = s + array[i];
                prev = array[i];
            }
        }
     
        return s;
    }
	
	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
