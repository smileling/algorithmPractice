package javaCollection;

import java.util.Stack;

public class TestVector {

	public static void main(String[] args) {

		Stack v = new Stack();
		v.push("Structs");
		v.push("J2EE");
		v.push("ROR");
		System.out.println(v);
		System.out.println(v.peek());
		System.out.println(v);
		System.out.println(v.pop());
		System.out.println(v);
	}

}
