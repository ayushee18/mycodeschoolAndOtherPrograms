package demo;

public class NoOfTimesArrayRotationBinarySearch {
	public static void main(String[] args) {
		NoOfTimesArrayRotationBinarySearch noOfTimesArrayRotationBinarySearch = new NoOfTimesArrayRotationBinarySearch();
		int[] arr1 = {11,12,15,13,2,5,6,8};
		System.out.println("First "+noOfTimesArrayRotationBinarySearch.rotationTimes(arr1, arr1.length));
		int[] arr2 = {1,2,3,4,5};
		System.out.println("Second "+noOfTimesArrayRotationBinarySearch.rotationTimes(arr2, arr2.length));
	}
	
	public int rotationTimes(int[] arr, int length) {
		int low = 0;
		int high = length-1;
		while(low<=high) {
		if(arr[low]<=arr[high])
			return low;
		else {
			int mid = (low+high)/2;
			int next = (mid+1)%length;
			int prev = (mid-1+length)%length;
			if(arr[mid]<=arr[next] && arr[prev]>=arr[mid]) {
				return mid;
			}
			else if(arr[mid]<= arr[high]) {
				high = mid-1;
			}
			else if(arr[mid]>=low) {
				low = mid+1;
			}
		}
		}
		return -1;
	}
}
