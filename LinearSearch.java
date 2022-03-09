package array;

import java.util.Scanner;

public class LinearSearch {
	public static int linearsearch(int[] arr,int x)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
			return i;
			}
		}return -1;
		
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] TakeInput()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0;i<=n;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[]  d = TakeInput();
		printArray(d);
		System.out.println(d);
//		int linear=linearsearch(d, 0);
//		System.err.println(linear);

	}

}
