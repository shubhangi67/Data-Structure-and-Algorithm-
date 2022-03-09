package array2D;

import java.util.Scanner;

public class FunctionsIn2DArray {
	
	public static void rowwisesum(int[][] arr)
	{
		int x= arr.length;
		if(x==0)
		{
			return;
		}
		//int y = arr[0].length;
		int sum=0;
		for (int i = 0; i < x; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
	}
	public static int largestcolwisesum(int[][] arr)
	{
		int x= arr.length;
		
		int y = arr[0].length;
		int largest = Integer.MIN_VALUE;
		
		for (int j = 0; j < y; j++) {
			int sum=0;
			for (int i = 0; i < x; i++) {
				sum+=arr[i][j];
			}
			if(sum>largest)
			{
				largest=sum;
			}
			
		}return largest;
	}
	
	public static void printArray(int[][] arr)
	{
		int x= arr.length;
		int y = arr[0].length;
		if(x==0 && y==0)
		{
			System.out.print(arr.length);
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numuber of Rows");
		int x = s.nextInt();
		System.out.println("Enter the numuber of Columns");
		int y = s.nextInt();
		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.println("Enter the element at " + i + " row " + j + " column");
				arr[i][j] = s.nextInt();
			}
		}return arr;
	}
	public static void main(String[] args) {
		int[][] t = takeInput();
		printArray(t);
		//rowwisesum(t);
		int d = largestcolwisesum(t);
		System.out.println(d);

	}

}
