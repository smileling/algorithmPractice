package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List books = new ArrayList();
		books.add(new String("J2EE"));
		books.add(new String("Structs2"));
		books.add(new String("Ajax"));
		System.out.println(books);
		books.add(1, new String("ROR"));
		System.out.println(books);
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		System.out.println(books.indexOf(new String("Structs2")));
		System.out.println(books.indexOf("Ajax"));
		System.out.println(books.subList(1, 2));
		books.add(0, "abc");
		System.out.println(books);
		System.out.println(books.indexOf("abc"));
	}
}
