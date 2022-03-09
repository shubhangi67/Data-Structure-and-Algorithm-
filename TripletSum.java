package array;

import java.util.Scanner;

public class TripletSum {
	public static int tripletsum(int[] arr,int sum)
	{
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			
					if(arr[i]+arr[i+1]+arr[i+2]==sum)
					{
						count++;
					}
					
		}
		return count;
	}
	
	
	public static void display(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] Takeinput()
	{
		Scanner s = new Scanner(System.in);
		int  n  = s.nextInt();
		
		int arr[] = new int[n];
		for(int  i = 0; i<n ;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] d = {2,3,4,1,8,8,9};
		//display(d);
		int f=tripletsum(d, 10);
		System.out.println(f);

	}

}
