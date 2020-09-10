package mergeAndQuick;

import java.util.Arrays;

public class Quick {
	
	int[] array;
	
	public Quick(int[] array) {
		super();
		this.array = array;
	}

	
	public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}

	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}


	//Partition function implementation
	public int partition(int[] array, int start, int end) {
		int pIndex = start;
		int pivot = array[end];
		
		for(int i = start; i<end; i++) {
			if (array[i] <= pivot) {
				
				//swap(array[i], array[pIndex]);
				int temp = array[i];
				array[i]=array[pIndex];
				array[pIndex] = temp;
				pIndex++;
				
			}
		}	
		//swap(array[pIndex], a[end]);
		int temp = array[pIndex];
		array[pIndex]=array[end];
		array[end] = temp;
		return pIndex;
		
		
	}
	
	//quicksort implementation
	public int[] quickSort(int[] array, int start, int end) {
		
		if(start<end) {
		
		//Recursively sort sub arrays
		int pIndex = partition(array, start, end);
		quickSort(array,start,pIndex-1);
		quickSort(array,pIndex+1,end);
		
	
		}
		return array;
		
	}
	
}
	

