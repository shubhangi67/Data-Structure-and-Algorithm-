package array;

import java.util.Scanner;

public class PrintAllPairs {
	public static void PrintAllpair(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}System.out.println();
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		System.out.println("You Enter Array list are:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

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
		PrintAllpair(d);

	}

}
