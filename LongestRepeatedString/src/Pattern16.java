class Pattern16
{
	public static void main(String [] args)
	{
		int space=9;
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=i;j<=9;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=9-1; j>=i; j--) 
			{
				System.out.print(j+" ");
		    }
		}
		System.out.println();
	}
}

/*

				   9
				  9 8
			     9 8 7 
		        9 8 7 6 
	           9 8 7 6 5 
              9 8 7 6 5 4 
	         9 8 7 6 5 4 3 
            9 8 7 6 5 4 3 2 
           9 8 7 6 5 4 3 2 1


   */