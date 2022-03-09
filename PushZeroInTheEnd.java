package array;

public class PushZeroInTheEnd {

	public static void pushzero(int[] arr) {
		int i=0;
        int k=0;
		while(i<arr.length)
		{
	
			if(arr[i]!=0)
			{
				arr[k]=arr[i];
				k++;
			}
			i++;
		}
        while(k<arr.length)
        {
            arr[k]=0;
            k++;
        }
		

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 0, 1, 3, 0, 0 };
		pushzero(arr);
		printArray(arr);

	}

}
