class Pattern5
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int space=1;
		for(int i=4-1;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
			*
		   **
		  ***
		 ****
		*****
		 **** 
		  ***
		   **
		    *
	*/