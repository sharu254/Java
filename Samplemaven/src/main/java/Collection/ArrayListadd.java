package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer");
		ArrayList<Integer>l1= new ArrayList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		ArrayList<Integer> l2= new ArrayList<Integer>();
		
		l2.add(1);
		l2.add(2);
		System.out.println(l1);
		l2.addAll(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
			l2.set(1,20);
			System.out.println(l2.get(1));
		System.out.println(l2);
		
		

	}

}
