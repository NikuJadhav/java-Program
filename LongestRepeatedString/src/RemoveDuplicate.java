import java.util.*;
public class Demo
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(7);
		al.add(8);
		al.add(7);
		ListIterator<Integer> lt=al.listIterator();
		while(lt.hasNext())
			System.out.println(lt.next());
		System.out.println("-------------------");
		LinkedHashSet lhs=new LinkedHashSet(al);
		al.clear();
		al.addAll(lhs);
		ListIterator<Integer> lt1=al.listIterator();
		while(lt1.hasNext())
			System.out.println(lt1.next());	
	}
}

/*

	2
	3
	7
	8
	7
----------------
	2
	3
	7
	8