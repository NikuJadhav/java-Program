class ArmstrongNo
{
	public static void main(String[] args)
	{
		int no=153,a,c=0;
		int temp=no;
		while(no!=0)
		{
			a=no%10;	
			no=no/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		System.out.println("ArmStrong No");
		else
			System.out.println("is not armstrong NO");
	}
}