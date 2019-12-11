import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args)
	{
		String str="Hello1234",digits="",letter="";
		int len=str.length();
		System.out.println(len);
		for(int i=0;i<len;i++) 
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				digits=digits+ch;
			}
			else 
			{
				letter=letter+ch;
			}
		}
		System.out.println("String="+str);
		System.out.println("alphabets="+letter);
		System.out.println("Numbers="+digits);
	}
}

/*
	String-ABCGOK1567
	Alphabets=ABCGOK
	Number=1567
*/