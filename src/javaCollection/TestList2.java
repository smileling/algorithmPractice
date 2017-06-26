package javaCollection;

import java.util.ArrayList;
import java.util.List;

class A {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
public class TestList2 {

	public static void main(String[] args) {

		List books = new ArrayList();
		books.add(new String("J2EE"));
		books.add(new String("Structs2"));
		books.add(new String("Ajax"));
		System.out.println(books);
		//删除集合中A对象，将导致第一个元素被删除
		books.remove(new A());
		System.out.println(books);
		//删除集合中A对象，再次删除集合中的第一个元素
		books.remove(new A());
		System.out.println(books);
	}

}
