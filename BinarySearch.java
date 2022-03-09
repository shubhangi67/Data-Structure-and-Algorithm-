package recursion;

public class BinarySearch {
	public static int search(int arr[], int startIndex, int endIndex, int x) {
		if (startIndex > endIndex) {
			return -1;
		}
		int mid = (startIndex + endIndex) / 2;
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] < x) {
			return search(arr, mid + 1, endIndex, x);
		} else {
			return search(arr, startIndex, mid - 1, x);
		}
	}

	public static void main(String[] args) {
		int[] d = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(search(d, 0, d.length-1, 2));

	}

}
