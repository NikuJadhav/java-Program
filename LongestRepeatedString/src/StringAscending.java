class StringAscending
{
	public static void main(String[] args)
	{
		String str="aaedc";
		for(int i=0;i<str.length();i++)
		{
			String temp="";
			int j=i+1;
			char ch=str.charAt(i);
			if(ch[i]>ch[j])
			{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
			else
			{
				temp.concat(ch);
			}
		}
	}
}

	/* String=aaedc
	Reverse=aacdee