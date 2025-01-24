package Set1;

import java.util.HashSet;//hashset is present in other package so it needs to be imported.
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr.remove();
	System.out.println(set);
		
	}

}
