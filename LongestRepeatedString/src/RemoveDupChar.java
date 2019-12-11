class RemoveDupChar
{
	public static void main(String[] args)
	{
		String str="NikNitaN";
		String sb=new String("");
		int len=str.length();
		System.out.println(str);
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(sb .indexOf(ch)<0)
				sb=sb+ch;
		}
		System.out.println(sb);
	}
} 