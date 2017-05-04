package javaCollection;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}
public class EnumSetDemo {

	public static void main(String[] args) {

//		EnumSet es1 = EnumSet.allOf(Season.class);
//		System.out.println(es1);
//		EnumSet es2 = EnumSet.noneOf(Season.class);
//		System.out.println(es2);
//		es2.add(Season.WINTER);
//		es2.add(Season.SPRING);
//		System.out.println(es2);
//		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
//		System.out.println(es3);
//		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
//		System.out.println(es4);
//		EnumSet es5 = EnumSet.complementOf(es4);
//		System.out.println(es5);
		
		
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		System.out.println(c);
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("Struts2");
		c.add("J2EE");
		System.out.println(enumSet);
		enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
	}

}
