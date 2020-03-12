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
		int[] testArrIS = testArrHS;
		
		//instantiate the sort classes
		HeapSort hs = new HeapSort();
		//InsertionSort is = new InsertionSort();
		
		//Heap Sort time and operation
		long startTimeHS = System.nanoTime();	
		hs.heapSort(testArrHS);
		long endTimeHS = System.nanoTime();
		
		//Heap Sort elapsed time
		long runTimeHS = endTimeHS - startTimeHS;
/*		
		//Insertion Sort time and operation
		long startTimeIS = System.nanoTime();	
		is.insertionSort(testArrIS);
		long endTimeIS = System.nanoTime();
		
		//insertion sort elapsed time
		long runTimeIS = endTimeIS - startTimeIS;
*/		
		//print the merge sorted array
		System.out.printf("Heap Sort: ");
		for (int x = 0; x < testArrHS.length; x++)
		{
			System.out.printf(Integer.toString(testArrHS[x]) + " ");
		}
		//print the heap sort time
		System.out.printf("\nTime elapsed for Heap Sort is: " + Long.toString(runTimeHS) + " ns\n");
/*		
		//print the insertion sorted array
		System.out.printf("InsertionSort: \n ");
		for (int x = 0; x < testArrHS.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		//print the insertion sort time
		System.out.printf("\n Time elapsed is: " + Long.toString(runTimeIS) + " ns\n");
*/		
		scanner.close();
	}

}
