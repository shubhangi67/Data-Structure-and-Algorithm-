package array;

public class PrimitiveAndNonPrimitive {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] incrementArray(int[] input)
	{
//		System.out.println(input);
		input = new int[7];
		for(int i=0;i<input.length;i++)
		{
			input[i] = input[i]+1;
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
//		System.out.println(arr);
		arr=incrementArray(arr);
		printArray(arr);

	}

}
