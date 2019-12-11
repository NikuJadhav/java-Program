import java.util.LinkedHashMap;
public class LongString
{
	public static void main(String[] args)
	{
		LongestSubString("javaconceptoftheday");
		System.out.println("---------------------");
		LongestSubString("HiiiHeelooo");
	}

	static void LongestSubString(String input)
	{
		char[] charArray=input.toCharArray();
		String longestString=null;
		int longestStringLength=0;
		LinkedHashMap<Character,Integer>lhm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++)
		{
			char ch=charArray[i];
			if(!lhm.containsKey(ch))
			{
				lhm.put(ch, i);
			}
			else
			{
				i=lhm.get(ch);
				lhm.clear();
			}
			if(lhm.size()>longestStringLength)
			{
				longestStringLength=lhm.size();
				longestString=lhm.keySet().toString();
			}
		}
		System.out.print(input);
		System.out.println(longestString);
		System.out.println(longestStringLength);
	}
}
	