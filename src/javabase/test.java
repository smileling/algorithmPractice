package javabase;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Random r = new Random();
////		System.out.println(r.nextInt());
////		System.out.println(r.nextInt(1));
////		System.out.println(r.nextFloat());
//		for(int i = 0; i < 100; i++)
//			System.out.println(r.nextInt(100)+1);
//		
//		
//		String a = "adbdf";
//		char[] c = new char[a.length()];
//		c = a.toCharArray();
//		for(int i = 0; i < a.length(); i++) {
//			System.out.println(c[i]);
//		}
		
		
		String a = "adpifjro";
		System.out.println(a.substring(0, 1));
		System.out.println(a.substring(0, 1).equals("a"));
		List<String> list = new ArrayList<String>();
		
		
		int num = 123;
		System.out.println(Integer.toBinaryString(num).toCharArray()[0]);
		
		int n = 3;
		int m = 1;
		int count = 0;
		
		while(n != m){
			n = n >> 1;
			m = m >> 1;
			count++;
		}
		System.out.println(n << count);
//		System.out.println(num1 >> 1 );
//		System.out.println(num1 >> 1 << 1);
		
		String s = "a  bc   dpeior  dijfer aa";
		s.trim();
		int len = s.split("\\s+").length;
		//if(len ==0) return null;
		String[] s2 = new String[len];
		s2 = s.split("\\s+");
		for (int i = 0; i < len; i++) {
			System.out.println(s2[i]);
		}
		for(int i =0; i < len/2; i++) {
			String tmp = s2[i];
			s2[i] = s2[len - i - 1];
			s2[len - i - 1] = tmp;
		}
		System.out.println(String.join(" ", s2));
		
		String s3 = "   ";
		System.out.println(s3.split("\\s+").length);
	}
	
	

}
