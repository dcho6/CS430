package hw4;
//Package for the java classes for this assignment

public class RadixSort {

	void radixSort(int arr[], int bArr[], int maxInArr) 
	{
		
		//Do a counting sort on Array arr on each digit
		for (int d = 1; maxInArr/d > 0; d *= 10)
		{
			radCountingSort(arr, bArr, d);
		}
		
	}
	
	//A new Counting Sort that sorts Arr according to the current digit
	//arr is the array to be sorted, while bArr is the output array. k is the maximum value inside of arr
	void radCountingSort(int arr[], int bArr[], int d)
	{
		//Create the scratch array to store counts. Every value in the array must be initialized to 0
		//Values range from [0,9] because it is per digit.
		int cArr[] = new int[10];
		for (int i = 0; i < 10; i++) 
		{
			cArr[i] = 0;
			 
		}
		 
		//Keep track of the counts of each number. 
		for (int i = 0; i < arr.length; i++)
		{
			cArr[(arr[i]/d) % 10]++;
			 
		}
		 
		//Have cArr contain the number of elements less than or equal to i
		for (int i = 1; i < 10; i++) 
		{
			cArr[i] += cArr[i - 1];
			 
		}
		 
		//build the output array
		for (int i = arr.length - 1; i >= 0; i--)
		{
			bArr[cArr[(arr[i]/d) % 10] - 1] = arr[i];
			cArr[(arr[i]/d) % 10]--;
		}
		
	}
	
}
