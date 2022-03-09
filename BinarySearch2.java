package array;

public class BinarySearch2 {
	public static int binarySearch(int[] arr,int ele)
	{
		int start=0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]>ele)
			{
				end=mid-1;
			}
			else if(arr[mid]<ele)
			{
				start =mid+1;
			}
			else if(arr[mid]==ele)
			{
				return mid;
			}
		}return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,4,7,10,20,35,40};
		int index = binarySearch(arr,10);
		System.out.println(index);

	}

}
