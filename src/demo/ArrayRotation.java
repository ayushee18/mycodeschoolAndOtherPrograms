package demo;

public class ArrayRotation {
	public static void main(String[] args) {
		
		ArrayRotation arrayRotation = new ArrayRotation();
		int arr[] = {1,2,3,4,5};
		System.out.println("Before Rotation:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		arrayRotation.simpleRoation(arr, 2);
		System.out.println("After Rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void simpleRoation(int[] arr, int rotationFactor) {
		if(rotationFactor>arr.length)
			rotationFactor=rotationFactor%arr.length;
		
		int[] arrResult = new int [arr.length];
		for(int i=0;i<arrResult.length-rotationFactor;i++) {
			arrResult[i] = arr[rotationFactor+i];
		}
		int j = rotationFactor-1;
		for(int i=arrResult.length-1; i> rotationFactor; i--) {
			arrResult[i] = arr[j];
			j--;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arrResult[i];
		}
	}
	
	public int gcd(int a, int b){
		if(b==0)
			return a;
		else
			return (gcd(b,a%b));
	}
	
	public void rotationAntiClockwise(int[] arr, int rotationFactor) {
		if(rotationFactor>arr.length)
			rotationFactor = rotationFactor%arr.length;
		
		
	}
}
