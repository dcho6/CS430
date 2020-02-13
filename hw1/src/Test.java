import java.util.*;
public class Test 
{
	public static void main(String [] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("please type how many entries you would like: ");
		
		String input = scanner.nextLine();
		int rando = Integer.parseInt(input);
		
		Random rand = new Random();
		
		int[] testArr = new int[rando];
		
		for (int x = 0; x < testArr.length; x++) 
		{
			testArr[x] = rand.nextInt(100);
		}
		
		
		MergeSort ms = new MergeSort();
		
		int[] sortedArr = ms.mergeSort(testArr, testArr.length);
		for (int x = 0; x < testArr.length; x++)
		{
			System.out.printf(Integer.toString(sortedArr[x]) + " ");
		}
		scanner.close();
	}

}
