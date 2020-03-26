package hw4;
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
		int[] testArrCS = new int[rando];
		for (int x = 0; x < testArrCS.length; x++) 
		{
			testArrCS[x] = rand.nextInt(10);
		}
		
		//Print the unsorted array for comparison
		System.out.printf("Unsorted Array: ");
		for (int x = 0; x < testArrCS.length; x++)
		{
			System.out.printf(Integer.toString(testArrCS[x]) + " ");
		}
		System.out.printf("\n");
		
		//create a copy of the unsorted array for the radix sort method
		int[] testArrRS = testArrCS;
		
		//create an output array for Counting Sort
		int[] sortedArrCS = new int[testArrCS.length];
		
		//find the maximum value within the test array
		int maxInArr = 0;
		for (int i = 0; i < testArrCS.length; i++) 
		{
			if (testArrCS[i] > maxInArr)
			{
				maxInArr = testArrCS[i];
			}
		}
		
		//instantiate the sort classes
		CountingSort cs = new CountingSort();
		RadixSort rs = new RadixSort();
		
		
		//Counting Sort time and operation
		long startTimeCS = System.nanoTime();	
		cs.countingSort(testArrCS, sortedArrCS, maxInArr);
		long endTimeCS = System.nanoTime();
		
		//Counting Sort elapsed time
		long runTimeCS = endTimeCS - startTimeCS;
/*
		//Radix Sort time and operation
		long startTimeRS = System.nanoTime();	
		rs.radixSort(testArrRS);
		long endTimeRS = System.nanoTime();
		
		//radix sort elapsed time
		long runTimeRS = endTimeRS - startTimeRS;
*/
		//print the Counting sorted array
		System.out.printf("Counting Sort:  ");
		for (int x = 0; x < sortedArrCS.length; x++)
		{
			System.out.printf(Integer.toString(sortedArrCS[x]) + " ");
		}
		//print the counting sort time
		System.out.printf("\n  Time elapsed for Counting Sort is: " + Long.toString(runTimeCS) + " ns\n");
/*
		//print the radix sorted array
		System.out.printf("Radix Sort: ");
		for (int x = 0; x < testArrRS.length; x++)
		{
			System.out.printf(Integer.toString(testArrRS[x]) + " ");
		}
		//print the radix sort time
		System.out.printf("\n  Time elapsed for Radix Sort is: " + Long.toString(runTimeRS) + " ns\n");
*/
		scanner.close();
	}

}
