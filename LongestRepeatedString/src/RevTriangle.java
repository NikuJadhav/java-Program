class RevTriangle
{
	public static void main(String[] args)
	{
		int n=4,space=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)	
			{
				System.out.print(" ");
			}
			//space++;
			for(int j=1;j<=(2*n)-(2*i-1);j++)
			{
				if((i==1)||j==1||j==(n*2-(2*i-1)))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}


/*
		********
		 *    *
		  *  *
		   *