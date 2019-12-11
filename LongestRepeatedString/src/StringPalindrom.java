import java.util.Scanner;
class StringPalindrom
{
	public static void main(String[] args)
	{
		 String str1="radar",rev="";
		 int length = str1.length();
		for int i = str1.length()-1; i >= 0; i-- )
			rev = rev + str1.charAt(i);
 
		 if (str1.equals(rev))
			System.out.println(str1+" is a palindrome");
		else
			 System.out.println(str1+" is not a palindrome");
 
		}
}l