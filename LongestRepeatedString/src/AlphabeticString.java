import java.util.Scanner;
class AlphabeticString
{
	public static void main(String[] args)
	{
		String str="";
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		for(int i=0;i<5;i++)
		{
			str[i]=sc.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(str[j-1].compareTo(str[j])>0)
				{
					temp=str[j-1];
					str[j-1]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Sorted String=");
		for(int i=0;i<5;i++)
			System.out.println(str[i]);
	}
}
/*
	Enter The String:
						Nikita
						Aaradhya
						Bhagyashri
						prashant
						Jadhav
	Sorted String:
						Aaradhya
						Bhagyashri
						Jadhav
						Nikita
						Prashant

