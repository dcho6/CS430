package hw3;
//Package for the java classes for this assignment

public class HeapSort 
{
	
	//HeapSort takes in an array to be sorted
	//The passed array is modified. There is no return
	public void heapSort(int arr[])
	{
		int size = arr.length;
		
		//Convert the array of values into a heap
		for (int index = size/2 - 1; index >= 0; index--)
		{
			reheapDown(arr, index, size);
			
		}
		
		//Sort the Array
		for (int index = size - 1; index >= 0; index--)
		{
			//Swap the root and the end
			int x = arr[0];
			arr[0] = arr[index];
			arr[index] = x;
			
			//Reheap the reduced tree
			reheapDown(arr, 0, index);
			
		}
	}

	//Used to form heaps
	//index is a node in arr, size refers to the size of the array
	void reheapDown(int arr[], int index, int size)
	{
		//initialize values
		int max = index;
		int left = 2*index + 1;
		int right = 2*index + 2;
		
		//Check if the left child is larger than the root node
		if (left < size && arr[left] > arr[max]) 
		{
			//if the child is larger, set the max to the left child index
			max = left;
			
		}
		
		//Check if the right child is larger than the root node
		if (right < size && arr[right] > arr[max])
		{
			//if the child is larger, set the max to the right child index
			max = right;
			
		}
		
		//Check if the maximum is still the root
		if (max != index)
		{
			//Swap the index to the larger child index
			int x = arr[index];
			arr[index] = arr[max];
			arr[max] = x;
			
			//Recursively reheap the subtree
			reheapDown(arr, max, size);
			
		}
		
		
	}

}
