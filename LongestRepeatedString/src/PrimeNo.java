class PrimeNo
{
	public static void main(String[] args)
	{
		/*int no=9;
		boolean flag=false;
		int n=no/2;
		for(int i=2;i<=n;i++)
		{
			if(no%i!=0)
			{
				flag=true;
				 break;
			}
		}
		if(flag==false)
			System.out.println(no+" is Prime NO");
		else
			System.out.println(no+" is not prime No");


		
			Sum Of all 100 No
*/
		int i, number, count,sum=0; 
		
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = 1; number <= 100; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number%i==0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
				if(count==0 && count!=1)
				{
					sum=sum+number;
				}
		}
		    	System.out.print(sum + " ");
		   
		
	}
}