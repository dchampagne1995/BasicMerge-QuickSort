package mergeAndQuick;

import java.util.Arrays;

public class Merge {
	
	int[] arr;
	
	public Merge(int[] arr) {
		super();
		this.arr = arr;
	}

	
	@Override
	public String toString() {
		return  Arrays.toString(arr);
	}


	//Mersort Implementation
	public void mergeSort(int[] arr) {
		
		int n = arr.length;
		
		if(n<2) {
			return;
		}
		
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid]; 
		
		for(int i = 0; i<=mid-1; i++) {
			left[i]=arr[i];
			
		}
		
		for(int i = mid; i<=n-1; i++) {
			right[i-mid] = arr[i];
			
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
		
		
		
	}
	
	//Merge Function
	public static void merge(int[] left, int[] right, int[] arr) {
		
		int Ln = left.length;
		int Rn = right.length;
		int i=0, k=0, j=0;

		
		while(i<Ln && j<Rn) {
			
			if(left[i] <= right[j]) {
				arr[k]=left[i];
				i++;
				
			}
			
			else {
				arr[k] = right[j];
				j++;
				
			}
			
			k++;
		}	
		while(i<Ln) {
			arr[k]= left[i];
			i++;
			k++;
			
		}
		
		while(j<Rn) {
			arr[k] = right[j];
			j++;
			k++;
			
		}
			
		
	}
	
	
	
	
}
