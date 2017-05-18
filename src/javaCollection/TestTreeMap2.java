package javaCollection;

import java.util.Comparator;
import java.util.TreeMap;

public class TestTreeMap2 {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap(new Comparator() {
			public int compare(Object o1, Object o2) {
			int a = (int)o1;
			int b = (int)o2;
			if (a > b) return -1;
			else if(a == b) return 0;
			else return 1;
			}
		});
		
		tm.put(-9, "J2EE");
		tm.put(2, "ROR");
		tm.put(10, "C++");
		tm.put(1, "Python");
		System.out.println(tm);
		
	}

}
