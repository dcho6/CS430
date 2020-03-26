package hw4;
//Package for the java classes for this assignment

public class CountingSort {

	//Counting Sort sorts an array of integers by counting the number of times an integer is in the unsorted array
	//arr is the array to be sorted, while bArr is the output array. k is the maximum value inside of arr
	void countingSort(int arr[], int bArr[], int k)
	{
		 
		//Create the scratch array to store counts. Every value in the array must be initialized to 0
		int cArr[] = new int[k+1];
		for (int x = 0; x <= k; x++) 
		{
			cArr[x] = 0;
			 
		}
		 
		//Keep track of the counts of each number. 
		for (int x = 0; x < arr.length; x++)
		{
			cArr[arr[x]]++;
			 
		}
		 
		//Have cArr contain the number of elements less than or equal to i
		for (int x = 1; x <= k; x++) 
		{
			cArr[x] += cArr[x - 1];
			 
		}
		 
		//build the output array
		for (int x = arr.length - 1; x >= 0; x--)
		{
			bArr[cArr[arr[x]] - 1] = arr[x];
			cArr[arr[x]]--;
		}
		
	}
	
}
