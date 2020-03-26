package hw4;
//Package for the java classes for this assignment

public class RadixSort {

	void radixSort(int arr[], int maxInArr) 
	{
		
		//Do a counting sort on Array arr on each digit
		for (int d = 1; maxInArr/d > 0; d *= 10)
		{
			radCountingSort(arr, d);
		}
		
	}
	
	//A new Counting Sort that sorts Arr according to the current digit
	//Arr itself is being modified, not the output array like in CountingSort.java
	void radCountingSort(int arr[], int d)
	{
		//create a temporary output array.
		int bArr[] = new int[arr.length];
		
		//Create the scratch array to store counts. Every value in the array must be initialized to 0
		//Values range from [0,9] because it is per digit.
		int cArr[] = new int[10];
		for (int x = 0; x < 10; x++) 
		{
			cArr[x] = 0;
			 
		}
		 
		//Keep track of the counts of each number. 
		for (int x = 0; x < arr.length; x++)
		{
			cArr[(arr[x]/d) % 10]++;
			 
		}
		 
		//Have cArr contain the number of elements less than or equal to i
		for (int x = 1; x < 10; x++) 
		{
			cArr[x] += cArr[x - 1];
			 
		}
		 
		//build the output array
		for (int x = arr.length - 1; x >= 0; x--)
		{
			bArr[cArr[(arr[x]/d) % 10] - 1] = arr[x];
			cArr[(arr[x]/d) % 10]--;
		}
		
		//replace arr's values with the output array's
		for (int x = 0; x < arr.length; x++)
		{
			arr[x] = bArr[x];
		}
		
	}
	
}
