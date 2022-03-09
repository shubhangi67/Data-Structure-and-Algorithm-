package array;

import java.util.Scanner;

public class UniqueNumber {
	
	public static int findunique(int[] arr)
	{
		int n = arr.length;
		int ans = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j] && i==j)
				{
					 return ans= arr[j];
				}
			}
		
		}
	return ans;
	}
	
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the Array ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] d = takeinput();
		int unique = findunique(d);
		System.out.println(unique);

	}

}
