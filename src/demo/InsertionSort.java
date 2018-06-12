package demo;

public class InsertionSort {
 public static void main(String[] args) {
	int arr[] = {4,6,3,2,1};
	for(int i=1;i<arr.length;i++) {
		int key = arr[i];
		for(int j=i-1;j>=0;j--) {
			if(arr[j]>key) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
}
}
