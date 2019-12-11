class LargerSmaller
{
	public static void main(String[] args)
	{
		int[] arr={10,50,05,60,00};
		int larger=arr[0];
		int smaller=arr[1];
		for(int number:arr)
		{
			if(number>larger)
				larger=number;
			else if(number<smaller)
				smaller=number;
		}
		System.out.println("Larger="+larger);
		System.out.println("Smaller="+smaller);
	}
}

/*
	Array=[10,50,05,60,00]
	Larger=60
	Smaller=00

*/