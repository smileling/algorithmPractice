package javaArrays;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {

		int[] a = new int[]{3,4,5,6};
		int[] a2 = new int[]{3,4,5,6};
		System.out.println("a=a2? " + Arrays.equals(a, a2));
//		System.out.println(a);
//		System.out.println(a2);
//		int[] a3 = a;
//		System.out.println(a3);
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("a=b? " + Arrays.equals(a, b));
		System.out.println("b: " + Arrays.toString(b));
		Arrays.fill(b, 2, 4, 1);
		System.out.println("b: " + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("b: " + Arrays.toString(b));
	}

}
