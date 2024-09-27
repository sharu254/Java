package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList();
		list1.add("Sharu");
		list1.add("34");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());

		System.out.println("Non Generic");
		ArrayList l2= new ArrayList();
		l2.add("Abc");
		l2.add("Sample");
		System.out.println(l2);

		
		System.out.println("Generic");
		ArrayList<String> l3= new ArrayList<String>();
	    l3.add("def");
		l3.add("45");
		System.out.println(l3);
		
		l3.remove("Sample");
		l3.add(null);
		l3.add(null);
		l3.add(0, "32");
		
		System.out.println("For loop");
		for(int i=0;i<l2.size();i++)
				{
					System.out.println(l3.get(i));
				}
	
System.out.println("Foreach loop");
for(String i:l3)
{
	System.out.println(i);
	
}

System.out.println("Iterator");
Iterator<String> it=l2.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
}


it.remove();
System.out.println(l3);
System.out.println("Contains Method");

System.out.println(l3.contains("def"));


}
}
