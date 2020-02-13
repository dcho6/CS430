package hw1.java;
//Class that holds the Merge-Sort Algorithm

public class InsertionSort 
{
	//Insertion Sort takes in an array
	//Does not return an array, merely modifies the currently existing one.
	void insertionSort(int arr[])
	{
		int n = arr.length;
		for (int x = 1; x < n; x++)
		{
			//begin to look backwards
			int key = arr[x];
			int y = x - 1;
			
			while(y > 0 && arr[x] > key)
			{
				arr[y+1] = arr[y];
				y = y-1;
				
			}
			
			arr[y+1] = key;
			
		}
	}
}
