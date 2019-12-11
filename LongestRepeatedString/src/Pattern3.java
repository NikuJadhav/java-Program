
class Pattern3
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int l=1;
			char c='A';
			for(int j=4;j>=i;j--)
			{
				if(i%2!=0)
				{
					System.out.print(c);
					c++;
				}
				else
				{
					System.out.print(l);
					l++;
				}	
			}
			System.out.println();
		}
	}
}
/*
	ABCD
	123
	AB
	1
	
*/