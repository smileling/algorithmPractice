package javaCollection;

import java.util.IdentityHashMap;

public class TestIdentityHashMap {

	public static void main(String[] args) {

		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(new String("语文"), 89);
		ihm.put(new String("语文"), 78);
		ihm.put("java", 93);
		ihm.put("java", 98);
		System.out.println(ihm);
		
	}

}
