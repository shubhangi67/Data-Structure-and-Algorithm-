package array;

//port sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class SelectionSort {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void selectionsort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			// Insert element at ith position.
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = i; j < n; j++) {
				// Find the minimum element among j positions.
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
				// swap element at minIndex with ith element.
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
//			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 5, 6, 3, 2, 1, 4 }; 

		selectionsort(arr);
		printArray(arr);

	}

}
