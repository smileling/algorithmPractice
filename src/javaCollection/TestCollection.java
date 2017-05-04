package javaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list.add("a");
		list2.add("b");
		list2.add("c");
		System.out.println(list);
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list2);
		
		System.out.println(list2.isEmpty());
//		list2.clear();
//		System.out.println(list);
//		System.out.println(list2);
//		System.out.println(list2.isEmpty());
		
		System.out.println(list.contains("b"));
		
		System.out.println(list.containsAll(list2));
		
//		list.remove("a");
//		System.out.println(list);
//		System.out.println(list2);
//		list.removeAll(list2);
//		System.out.println(list);
//		System.out.println(list2);
		list.retainAll(list2);
		System.out.println(list);
		System.out.println(list2);
		
		System.out.println(list.size());
		
		Object[] arr = list.toArray();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(arr[i]);
		}
		
		String[] arr2 = new String[list.size()];
		list.toArray(arr2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(arr2[i]);
		}
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2);
		Integer[] arr3 = new Integer[ll.size()];
		ll.toArray(arr3);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(arr3[i]);
		}
		
		//sample
		Collection c = new ArrayList();
		c.add("java");
		c.add(2);
		System.out.println(c);
		arr = c.toArray();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(arr[i]);
		}
//		c.remove(2);
		System.out.println(c);
		
		//set
		Collection books = new HashSet();
		books.add("java");
		books.add("C++");
//		System.out.println(c.addAll(books));
		System.out.println(books);
		System.out.println(c.contains(books));
		System.out.println(c);
		System.out.println(c.removeAll(books));
		System.out.println(c);
		System.out.println(c.retainAll(books));
		System.out.println(c);
		
		//iterator
		Iterator it = books.iterator();
		while (it.hasNext()) {
//			if(it.next().toString().equals("java")){
//				it.remove();
//			}
			String book = (String)it.next();
			System.out.println(book);
			System.out.println(it.getClass().toString());
			if(book.equals("java")){
//				books.remove("java");//ConcurrentModificationException????
				it.remove();
			}
		}
		
		System.out.println(books);
		
		for( String str : list) {
			System.out.println(str);
		}
	}

}
