package Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Setexample {
	
	public static void main(String[] args)
	{
	
	Set<Integer> s1= new HashSet<Integer>();
	s1.add(20);
	s1.add(30);
	s1.add(40);
	System.out.println(s1);
	
	HashSet<Integer> s2 = new HashSet<Integer>();
	s2.add(7);
	s2.add(9);
	System.out.println(s2);

	Iterator<Integer> i=s2.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
		s2.remove(7);
		System.out.println(s2);
		s2.add(89);
		s2.add(78);
		s1.addAll(s2);
		System.out.println(s1);
		s1.removeAll(s2);
		System.out.println(s2);
		System.out.println(	s2.contains(78));
System.out.println(s1.size())
;
		
		
	}
}
