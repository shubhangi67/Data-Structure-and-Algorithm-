package array;

public class BinarySearch {
	public static int binarySearch(int[] arr,int ele)
	{
		int n = arr.length;
		int start = 0;
		int end= n-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]>ele)
				end = mid- 1;
			else if(arr[mid]<ele)
				start = mid+1;
			else 
				return mid ;
			
		}return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,4,7,10,20,35,40};
		int index = binarySearch(arr,40);
		System.out.println("Index is :- "+index);

	}

}
