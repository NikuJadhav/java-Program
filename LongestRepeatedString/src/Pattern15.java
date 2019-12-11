class Pattern15
{

	public static void main(String[] args)
	{
		int space=4;
		for(int i=1;i<=4;i++)		
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==1 || i-j==0 || j-i==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
	
	* * * * * * * * * 
	  *           *
        *       *
		  *   *
		    *

*/