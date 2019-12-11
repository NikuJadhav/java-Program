import java.util.HashMap;
public class CountDuplicateChar
{
	public static void main(String[] args) 
	{
		characterCount("Java J2EE Jaca JSP J2EE");
	}

	static void characterCount(String input)
	{
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		char[] charArray=input.toCharArray();
		for(char ch:charArray)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, hm.get(ch));
			}
		}
		System.out.print(input+":"+hm);
	}
}