package javaCollection;

import java.util.TreeSet;
import java.util.Comparator;

class M {
	int age;
	public M(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "M对象(age:" + age+ ")";
	}
}
public class TestTreeSet3 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				M m1 = (M)o1;
				M m2 = (M)o2;
				if (m1.age > m2.age){
					return -1;
				} else if (m1.age == m2.age) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
		System.out.println(ts.first());
		
	}

}
