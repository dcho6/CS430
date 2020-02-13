package hw1.java;
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
		int[] testArr = new int[rando];
		for (int x = 0; x < testArr.length; x++) 
		{
			testArr[x] = rand.nextInt(100);
		}
		
		int[] testArrIS = testArr;
		
		MergeSort ms = new MergeSort();
		InsertionSort is = new InsertionSort();
		
		//Merge Sort time and operation
		long startTime = System.nanoTime();	
		int[] sortedArr = ms.mergeSort(testArr, testArr.length);
		long endTime = System.nanoTime();
		
		//merge sort elapsed time
		long runTime = endTime - startTime;
		
		//Insertion Sort time and operation
		long startTimeIS = System.nanoTime();	
		is.insertionSort(testArrIS);
		long endTimeIS = System.nanoTime();
		
		//insertion sort elapsed time
		long runTimeIS = endTimeIS - startTimeIS;
		
		//print the merge sorted array
		System.out.printf("Merge Sort: \n ");
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		//print the merge sort time
		System.out.printf("\n Time elapsed for Merge Sort is: " + Long.toString(runTime) + " ns\n");
		
		//print the insertion sorted array
		System.out.printf("InsertionSort: \n ");
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		//print the insertion sort time
		System.out.printf("\n Time elapsed is: " + Long.toString(runTimeIS) + " ns\n");
		
		scanner.close();
	}

}
