class FibonacciSeries
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		int n=6;
		for(int i=1;i<6;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}

/*
	0 1 1


	*/