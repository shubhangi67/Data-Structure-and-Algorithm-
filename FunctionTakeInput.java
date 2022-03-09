package array;

import java.util.Scanner;

public class FunctionTakeInput {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Element at " + i + " th index.");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		printArray(arr);
	}

}
