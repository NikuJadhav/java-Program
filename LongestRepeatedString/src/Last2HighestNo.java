class Last2HighestNo
{
	public static void main(String [] args)
	{
		int []arr={50,10,60,30,90};
		int largestNo=arr[0],SecdLargestNo=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largestNo)
			{
				SecdLargestNo=largestNo;
				largestNo=arr[i];
			}
			else if(arr[i]>SecdLargestNo && arr[i]!=largestNo)
				SecdLargestNo=arr[i];
		}
		System.out.println("Highest No="+largestNo);
		System.out.println("Second Highest No="+SecdLargestNo);
	}
}

/*
	array=50,10,60,30,90
	Highest No-90
	Second Highest No-60