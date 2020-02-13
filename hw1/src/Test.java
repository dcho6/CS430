import java.util.*;
public class Test 
{
	public static void main(String [] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Please type how many entries you would like: ");
		
		String input = scanner.nextLine();
		int rando = Integer.parseInt(input);
		
		Random rand = new Random();
		
		int[] testArr = new int[rando];
		
		for (int x = 0; x < testArr.length; x++) 
		{
			testArr[x] = rand.nextInt(100);
		}
		
		MergeSort ms = new MergeSort();
		
		long startTime = System.nanoTime();	
	
		int[] sortedArr = ms.mergeSort(testArr, testArr.length);
		
		long endTime = System.nanoTime();
		
		long runTime = endTime - startTime;
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		System.out.printf("\n Time elapsed is: " + Long.toString(runTime) + " ns");
		scanner.close();
	}

}
