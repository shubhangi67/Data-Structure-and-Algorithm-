package array;

import java.util.Scanner;

public class ArrangeNumberinArray {
	Scanner s = new Scanner(System.in);

	public static void arrange(int[] arr) {
		int s= 0;
		int start = (arr.length - 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			if(i<=start)	
			if (arr[i] % 2 != 0) {
				s=arr[i];
				s++;
			}
		}
		int e = start+1;
		int end = ((arr.length - 1) / 2) + 1;
		for (int i = 0; i < arr.length; i++) {
			if(i<end)
			if (arr[i] % 2 == 0) {
				e=arr[i];
				e++;
			}
		}
//		int n = arr.length;
//		int i=0;
//		while(i<=n)
//		{
//			int j = 1;
//			while(j<=i)
//			{
//				System.out.print(arr[i]);
//				j=j+1;
//			}
//		System.out.println();
//		i=i+1;
//		}
		System.out.println(arr);
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		System.out.println("You Enter Array list are:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");

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
		printArray(d);
		arrange(d);

	}

}
