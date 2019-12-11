class PascalTriangle
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=1;j--)
			{
				System.out.print(" ");
			}
			int number=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
