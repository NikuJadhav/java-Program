class Pattern4
{
	public static void main(String[] args)
	{
		int space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(int i=5-1;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
		 *
	   * * *
     * * * * * 
   * * * * * * *
 * * * * * * * * * 
   * * * * * * * 
     * * * * *
	   * * *
	     *


*/