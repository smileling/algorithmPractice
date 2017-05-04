package javaCollection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList books = new LinkedList();
		books.offer("Structs2");
		books.push("J2EE");
		books.offerFirst("ROR");
		for(int i = 0; i< books.size(); i++) {
			System.out.println(books.get(i));
		}
		
		System.out.println(books.peekFirst());
		System.out.println(books.peek());
		System.out.println(books.peekLast());
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.pollLast());
		System.out.println(books);
	}

}
