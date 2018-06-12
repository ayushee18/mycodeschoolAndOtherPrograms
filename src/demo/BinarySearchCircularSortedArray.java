package demo;

public class BinarySearchCircularSortedArray {
	public static void main(String[] args) {
		
		BinarySearchCircularSortedArray binarySearchCircularSortedArray = new BinarySearchCircularSortedArray();
		int arr[] = {12,14,18,21,3,6,8,9};
		System.out.println(binarySearchCircularSortedArray.search(arr, 18));
	}
	
	public int search(int[] arr, int num) {
		int high = arr.length-1;
		int low = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == num) {
				return mid;
			}
			else if(arr[mid]<=arr[high]) {
				if(arr[mid]<num && num<=arr[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
			else if(low<=arr[mid]) {
				if(num<arr[mid] && num>=arr[low]) {
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
		}
		return -1;
	}
}
