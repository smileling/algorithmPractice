package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPerformance {

	public static void main(String[] args) {

		int len = 90000;
		String[] tst1 = new String[len];
		for (int i = 0; i < len; i++) {
			tst1[i] = String.valueOf(i);
		}
		
		ArrayList al = new ArrayList();
		for(int i = 0; i < len; i++) {
			al.add(tst1[i]);
		}
		
		LinkedList ll = new LinkedList();
		for (int i = 0; i < len; i++) {
			ll.add(tst1[i]);
		}
		
		//访问LinkedList集合的所有元素，并输出迭代时间
		//迭代LinkedList集合元素的时间：3
		long start = System.currentTimeMillis();
		for(Iterator it = ll.iterator(); it.hasNext() ; ) {
			it.next();
		}
		System.out.println("迭代LinkedList集合元素的时间：" + (System.currentTimeMillis() - start));
		
		//使用get遍历LinkedList集合元素的时间：3498
//		start = System.currentTimeMillis();
//		for(int i = 0; i < len; i++) {
//			ll.get(i);
//		}
		System.out.println("使用get遍历LinkedList集合元素的时间：" + (System.currentTimeMillis() - start));
				
		//访问ArrayList集合的所有元素，并输出迭代时间
		//迭代ArrayList集合元素的时间：3
		start = System.currentTimeMillis();
		for(Iterator it = al.iterator(); it.hasNext() ; ) {
			it.next();
		}
		System.out.println("迭代ArrayList集合元素的时间：" + (System.currentTimeMillis() - start));
		
		//使用get遍历ArrayList集合元素的时间：1
		start = System.currentTimeMillis();
		for(int i = 0; i < len; i++) {
			al.get(i);
		}
		System.out.println("使用get遍历ArrayList集合元素的时间：" + (System.currentTimeMillis() - start));
		
	}

}
