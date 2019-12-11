class Vowels
{
	public static void main(String[] args)
	{
		int vowel=0,con=0,digit=0,space=0;
		String str="Nikita Jadhav 2205";
		int len=str.length();
		str=str.toLowerCase();
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				vowel++;
			else if(c>='a'&&c<='z')
				con++;
			else if(c>='0'&&c<='9')
				digit++;
			else
				space++;
		}
		System.out.println("string="+str);
		System.out.println("vowels="+vowel);
		System.out.println("consonent="+con);
		System.out.println("Digits="+digit);
		System.out.println("Space="+space);

	}
}
/*
	String="Nikita Jadhav2205"
	Vowels=5
	Consonent=7
	Digits=4
	Space=2