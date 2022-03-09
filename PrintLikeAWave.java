package array2D;

import java.util.Scanner;

public class PrintLikeAWave {

	public static void wavePrint(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		for (int i = 0; i < row; i++) {
			
			if (i% 2 == 0)
			{
				for (int j = 0; j < col; j++) 
				{
					System.out.print(arr[i][j]);
				}
			}
			else
			{
				for (int j = col-1; j >=0 ; j--) 
				{
					System.out.print(arr[i][j]);
				}
			}
			
		}
	}

	public static void printArray(int[][] arr) {
		int x = arr.length;
		int y = arr[0].length;
		if (x == 0 && y == 0) {
			System.out.print(arr.length);
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
		int[][] t = takeInput();
		// printArray(t);
		wavePrint(t);

	}

}
