// Class that holds the Merge-Sort Algorithm
// This part is done by David Cho - Seat 12

public class MergeSort {
	
	// Divide function takes in an Array arr and an integer n, where arr is the array to be sorted
	// and n is the size of the array that needs to be sorted.
	// Breaks down the array to very small arrays.
	// It is assumed that Array arr has no null values.
	void mergeSort(int arr[], int n)
	{
		//First check to see if the array is the minimum size. If it is, return
		if (n < 2) {
			return;
		}
		
		// Find the middle of the Array and split it into 2 sub-arrays: left and right
		int middle = n / 2; //Find the midpoint of the array
		int leftSize = middle;
		int rightSize = n-middle;
		int leftArr[] = new int[leftSize];
		int rightArr[] = new int[rightSize];
		
		//fill the sub-arrays
		int rightIndex = 0;
		for (int x = 0; x < n; x++) {
			if (x < middle) {
				leftArr[x] = arr[x];
			}
			
			//After filling the left array, start filling the right array
			else if (x >= middle) {
				rightArr[rightIndex] = arr[x];
				rightIndex++;
			}
		}
		
		// Recurse to Recursively break the array down until it is small
		mergeSort(leftArr, leftSize);
		mergeSort(rightArr, rightSize);
		
		//Finally, merge the two sub-arrays while sorting
		merge(arr, leftArr, leftSize, rightArr, rightSize);
	}
	
	// Merge function merges two arrays
	// Checks for sorting during merge.
	void merge(int arr[], int leftArr[], int leftSize, int rightArr[], int rightSize)
	{
		
		
		
	}
	
	
	
}
