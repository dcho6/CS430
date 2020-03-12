package hw3;
//Package for the java classes for this assignment

public class QuickSort {
	
	//The overarching quick sort function
	//Utilizes partition method to sort a passed array
	//first is the starting index to be sorted
	//last is the ending index to be sorted.
	public void quickSort(int arr[], int first, int last)
	{
		
		if (first < last)
		{
			//Find the split point using the partition function
			int split = partition(arr, first, last);
			
			//sort the elements before the partition
			quickSort(arr, first, split - 1);
			
			//sort the elements after the partition
			quickSort(arr, split + 1, last);
		}
		
		
	}
	
	//partition function to find the split point
	int partition(int arr[], int first, int last)
	{
		//pivot value is the last value in the array
		int pivot = arr[last]; 
		
		//starting index initialized
		int i = first-1;
		
		//iterate through to place values smaller than the pivot at the left 
		//and larger values to the right
		for (int x = first; x < last; x++)
		{
			//If the current value is smaller than the pivot
			if (arr[x] <= pivot)
			{
				i++;
				
				//swap the current value with the value at the index
				int y = arr[i];
				arr[i] = arr[x];
				arr[x] = y;
			}
		}
		
		i++;
		
		//swap the values so the pivot is in the correct place
		int x = arr[i];
		arr[i] = arr[last];
		arr[last] = x;
		
		return i;
	}
	
}
