package array2D;

import java.util.Scanner;

public class BasicsOf2DArray {
	

	public static void main(String[] args) {
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
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
