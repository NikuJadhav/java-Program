class Pattern7
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==4 || (i+j==5)||(j-i==3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
		*
	  *   *
	*       *
  *           *
 ***************

*/