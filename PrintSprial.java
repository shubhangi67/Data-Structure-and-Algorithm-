package array2D;

import java.util.Scanner;

public class PrintSprial {

	public static void boundarysumdiagonal(int[][] arr) {
		int row = arr.length;
		int col = arr.length;
		int[] ans = new int[col * row];
		int k = 0;
		int left = 0, top = 0, right = arr.length, bottom = arr[0].length;
		for (int i = left; i < right; i++) {
			ans[k] = arr[top][i];
			k++;
		}
		top++;
		for (int i = top; i < bottom; i++) {
			ans[k] = arr[i][right - 1];
			k++;
		}
		right--;
		for (int i = right-1; i >= 0; i--) {
			ans[k] = arr[bottom-1][i];
			k++;
		}
		bottom--;
		for (int i = bottom; i <= top; i++) {
			ans[k] = arr[i][bottom];
			k++;
		}
		left++;
		
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static void printArray(int[][] arr) {
		int x = arr.length;
		int y = arr[0].length;
		if (x == 0) {
			return;
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] takeInput() {
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
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] d = takeInput();
		// printArray(d);
		boundarysumdiagonal(d);
	}

}
