import java.util.Arrays;
class SwapFirstLastEle
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50,60};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		swapElement(arr);
		System.out.println("---------");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void swapElement(int[] arr)
	{
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}
}