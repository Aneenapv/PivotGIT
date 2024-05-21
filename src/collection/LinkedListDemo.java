package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("Pivot");
		list.add(25);
		list.add(true);
		list.add("Academy");
		
	// 1. insertion order is preserved
		System.out.println(list);
		
		list.add(2, "Missisauga");
		
		
		
		System.out.println(list.get(4));
		// when I add missisauga to the 2nd position, values in list moves towards right. 
		// so that we are getting list.get(3) as true.
		System.out.println("before");
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list);
		System.out.println("after");
		list.add(2,30);
		System.out.println(list.get(2)); //30
		System.out.println(list.get(3)); //missisauga
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		// duplicates are allowed
		list.add("pivot");
		list.add("academy");
		list.add(25);
		
		System.out.println(list);
		
System.out.println("------------------------------");
		
		// null values are allowed
		list.add("pivot");
		list.add("academy");
		list.add(35);
		list.add(null);
		
		System.out.println(list);
		
		System.out.println("_______________________");
		list.add("pivot");
		list.add("academy");
		list.add(35);
		//list.addFirst("first");
		list.addLast("last");
		
		
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.getFirst());
		
		System.out.print(list.removeFirst() +" ");
		System.out.println(list.removeLast());
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		Object a = list.removeLast();
		System.out.println(a);
		
		
		
		
		
		

	}

}
