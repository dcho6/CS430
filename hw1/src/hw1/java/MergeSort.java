package hw1.java;
// Class that holds the Merge-Sort Algorithm

public class MergeSort 
{
	
	// Divide function takes in an Array arr and an integer n, where arr is the array to be sorted
	// and n is the size of the array that needs to be sorted.
	// Breaks down the array to very small arrays.
	// It is assumed that Array arr has no null values., and that n is known
	int[] mergeSort(int arr[], int n)
	{
		//First check to see if the array is the minimum size. If it is, return
		if (n == 1) 
		{
			return arr;
		}
		else 
		{
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
			
			// Call the recursive function break the array down until it is the smallest size. Store as sorted arrays
			int sortedLeft[] = new int[leftSize];
			int sortedRight[] = new int[rightSize];
			sortedLeft = mergeSort(leftArr, leftSize);
			sortedRight = mergeSort(rightArr, rightSize);
			
			//Finally, merge the two sub-arrays while sorting
			return merge(sortedLeft, leftSize, sortedRight, rightSize);
		}
	}
	
	// Merge function merges two arrays
	// Checks for sorting during merge. Takes in the sub-arrays and the sub-array sizes.
	int[] merge(int leftArr[], int leftSize, int rightArr[], int rightSize)
	{
		// create the array that will be returned. It is the combined size of both sub-arrays
		int retArr[] = new int[leftSize + rightSize];
		
		//initialize the indices
		int leftIndex = 0;
		int rightIndex = 0;
		
		
		//Iterate through the 3 arrays. By the end, all 3 have been iterated through.
		for (int retIndex = 0; retIndex < retArr.length; retIndex++) 
		{
			if (rightIndex > rightSize-1 || (leftIndex < leftSize && leftArr[leftIndex] < rightArr[rightIndex]))
			{
				//moves to the next element in the Left side array
				retArr[retIndex] = leftArr[leftIndex];
				leftIndex++;
			}
			else
			{
				//moves to the next element in the Right side array
				retArr[retIndex] = rightArr[rightIndex];
				rightIndex++;
			}
			
		}
		
		//return the sorted array
		return retArr;
		
	}
	
	
	
}
