package demo;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {4,6,3,2,1};
		MergeSort sort = new MergeSort();
		sort.split(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void split(int arr[], int low, int high) {
		if(low<high) {
			int middle = (low+high)/2;
			split(arr,low,middle);
			split(arr,middle+1,high);
			merge(arr,low, middle,high);
		}
	}
	
	public void merge(int arr[], int low, int middle, int high) {
		int l1 = middle-low+1;
		int l2 = high - middle;
		
		int arr1[] = new int[l1];
		int arr2[] = new int[l2];
		
		System.out.println();
		
		for(int i=0;i<l1;i++) {
			arr1[i] = arr[low+i];
		}
		for(int j=0;j<l2;j++) {
			arr2[j] = arr[middle+1+j];
		}
		
		int i=0; int j=0;
		int k = low;
		
		while(i<l1 && j<l2) {
			if(arr1[i]<=arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<l1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<l2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
	
}
