package array;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
//			while (j >= 0) {
//				if (arr[j] > temp) {
//					arr[j + 1] = arr[j];
//					j--;
//				} else {
//					break;
//				}
//
//			}
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] =arr[j];
				j--;
			}
			//position will be j+1
			arr[j + 1] = temp;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 7, 6, 5, 4, 3, 2, 1, 8 };
		insertionSort(arr);
		printArray(arr);
	}

}
