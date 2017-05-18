package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {

	public static void main(String[] args) {

		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		Collections.shuffle(nums);
		System.out.println(nums);
		Collections.sort(nums, new Comparator() {
			public int compare(Object o1, Object o2) {
			int a = (int)o1;
			int b = (int)o2;
			if (a > b) return -1;
			else if(a == b) return 0;
			else return 1;
			}
		});
		System.out.println(nums);
		
	}

}
