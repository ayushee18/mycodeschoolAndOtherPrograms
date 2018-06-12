package demo;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = new int[] {10,4,10,2,10,18,20};
		Arrays.sort(arr);
		BinarySearch binarySearch = new BinarySearch();
//		int result[] = binarySearch.binarySearchBasic(arr, 10,0,arr.length-1);
//		if(result != null)
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
//		else
//			System.out.println(result);
		
		//System.out.println("First Occurence: "+binarySearch.binarySearchFirst(arr, 10, 0, arr.length-1, -1));
		System.out.println("Last Occurence: "+binarySearch.binarySearchLast(arr, 10, 0, arr.length-1, -1));
	}
	
	public int[] binarySearchBasic(int[] arr, int i,int low, int high) {
		Arrays.sort(arr);
		int returnArray[];
		if(low<=high) {
		int mid = (low+high)/2;
		if(arr[mid]==i) {
			returnArray = new int[] {mid,i};
			return returnArray;
		}
		else if(arr[mid]>i) {
			high = mid-1;
			return binarySearchBasic(arr, i,0,high);
		}
		else if(arr[mid]<i) {
			low = mid+1;
			return binarySearchBasic(arr, i,low,arr.length-1);
		}
		}
		
		return null;
	}
	
	public int binarySearchFirst(int[] arr,int i,int low, int high, int result) {
		if(low<=high) {
		int mid = (low+high)/2;
		if(arr[mid]==i) {
			high = mid-1;
			result = mid;
			return binarySearchFirst(arr, i, low, high, result);
		}
		else if(arr[mid]>i) {
			System.out.println("hi");
			high = mid-1;
			return binarySearchFirst(arr, i,low,high, result);
		}
		else if(arr[mid]<i) {
			low = mid+1;
			return binarySearchFirst(arr, i,low,high, result);
		}
		}
		return result;
	}
	
	public int binarySearchLast(int[] arr,int i,int low, int high, int result) {
		if(low<=high) {
		int mid = (low+high)/2;
		if(arr[mid]==i) {
			low = mid+1;
			result = mid;
			return binarySearchLast(arr, i, low, high, result);
		}
		else if(arr[mid]>i) {
			System.out.println("hi");
			high = mid-1;
			return binarySearchLast(arr, i,low,high, result);
		}
		else if(arr[mid]<i) {
			low = mid+1;
			return binarySearchLast(arr, i,low,high, result);
		}
		}
		return result;
	}
}
