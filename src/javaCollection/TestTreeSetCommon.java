package javaCollection;

import java.util.TreeSet;

public class TestTreeSetCommon {

	public static void main(String[] args) {

		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		System.out.println(nums);
		System.out.println(nums.first());
		System.out.println(nums.last());
		System.out.println(nums.headSet(4));
		System.out.println(nums.tailSet(5));
		System.out.println(nums.subSet(2, 5));
		
		
		TreeSet strs = new TreeSet();
		strs.add("abc");
		strs.add("cba");
		strs.add("abc");
		System.out.println(strs);
	}

}
