package hw3;
import java.util.*;
public class Test 
{
	public static void main(String [] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//prompt for an amount of entries
		System.out.printf("Please type how many entries you would like: ");
		
		String input = scanner.nextLine();
		//fill an array with random integers
		int rando = Integer.parseInt(input);
		Random rand = new Random();
		int[] testArrHS = new int[rando];
		for (int x = 0; x < testArrHS.length; x++) 
		{
			testArrHS[x] = rand.nextInt(100);
		}
		
		//Print the unsorted array for comparison
		System.out.printf("Unsorted Array: ");
		for (int x = 0; x < testArrHS.length; x++)
		{
			System.out.printf(Integer.toString(testArrHS[x]) + " ");
		}
		System.out.printf("\n");
		
		//create a copy of the unsorted array for the quick sort method
		int[] testArrQS = testArrHS;
		
		//instantiate the sort classes
		HeapSort hs = new HeapSort();
		QuickSort qs = new QuickSort();
		
		
		//Heap Sort time and operation
		long startTimeHS = System.nanoTime();	
		hs.heapSort(testArrHS);
		long endTimeHS = System.nanoTime();
		
		//Heap Sort elapsed time
		long runTimeHS = endTimeHS - startTimeHS;
		
		//Quick Sort time and operation
		long startTimeQS = System.nanoTime();	
		qs.quickSort(testArrQS, 0, testArrQS.length-1);
		long endTimeQS = System.nanoTime();
		
		//quick sort elapsed time
		long runTimeQS = endTimeQS - startTimeQS;
	
		//print the Heap sorted array
		System.out.printf("Heap Sort:  ");
		for (int x = 0; x < testArrHS.length; x++)
		{
			System.out.printf(Integer.toString(testArrHS[x]) + " ");
		}
		//print the heap sort time
		System.out.printf("\n  Time elapsed for Heap Sort is: " + Long.toString(runTimeHS) + " ns\n");

		//print the quick sorted array
		System.out.printf("Quick Sort: ");
		for (int x = 0; x < testArrQS.length; x++)
		{
			System.out.printf(Integer.toString(testArrQS[x]) + " ");
		}
		//print the quick sort time
		System.out.printf("\n  Time elapsed for Quick Sort is: " + Long.toString(runTimeQS) + " ns\n");

		scanner.close();
	}

}
