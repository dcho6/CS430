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
		
		MergeSort ms = new MergeSort();
		
		//used to measure runtime
		long startTime = System.nanoTime();	
		
		//Merge Sort
		int[] sortedArr = ms.mergeSort(testArr, testArr.length);
		
		//Mark end time
		long endTime = System.nanoTime();
		
		InsertionSort is = new InsertionSort();
		
		long startTimeIS = System.nanoTime();	
		
		is.insertionSort(testArr);
		
		long endTimeIS = System.nanoTime();
		
		//Measures the time elapsed
		long runTime = endTime - startTime;
		
		long runTimeIS = endTimeIS - startTimeIS;
		
		//print the sorted array
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		//print the run time in nanoseconds
		System.out.printf("\n Time elapsed is: " + Long.toString(runTime) + " ns\n");
		
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		
		System.out.printf("\n Time elapsed is: " + Long.toString(runTimeIS) + " ns\n");
		
		scanner.close();
	}

}
