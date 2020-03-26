package hw4;
//Package for the java classes for this assignment

public class CountingSort {

	//Counting Sort sorts an array of integers by counting the number of times an integer is in the unsorted array
	//arr is the array to be sorted, while bArr is the output array. k is the maximum value inside of arr
	void countingSort(int arr[], int bArr[], int k)
	{
		 
		 //Create the scratch array to store counts. Every value in the array must be initialized to 0
		 int cArr[] = new int[k+1];
		 for (int i = 0; i <= k; i++) 
		 {
			 cArr[i] = 0;
			 
		 }
		 
		 //Keep track of the counts of each number. 
		 for (int i = 0; i < arr.length; i++)
		 {
			 cArr[arr[i]]++;
			 
		 }
		 
		 //Have cArr contain the number of elements less than or equal to i
		 for (int i = 1; i <= k; i++) 
		 {
			 cArr[i] += cArr[i-1];
			 
		 }
		 
		 //build the output array
		 for (int i = arr.length-1; i >= 0; i--)
		 {
			 bArr[cArr[arr[i]]-1] = arr[i];
			 cArr[arr[i]]--;
		 }
		
	}
	
}
