package array;

public class BubbleSort {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 9, 7, 6, 2, 3, 4, 0 ,5 };
		bubblesort(arr);
		printArray(arr);

	}

}
