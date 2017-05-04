package javaCollection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet books = new LinkedHashSet();
		books.add("Struts2");
		books.add("J2EE");
		System.out.println(books);
		books.remove("Struts2");
		books.add("Struts2");
		System.out.println(books);
	}

}
