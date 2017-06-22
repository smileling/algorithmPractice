package Test;

import java.util.Map;
import java.util.HashMap;

public class CharToString {
	
	public static int maxCount(char[] arr) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int max = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < arr.length; i++) {
			String str = String.valueOf(arr[i]);
			if(!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				int val = map.get(str);
				map.put(str, val+1);
				if(max < val +1) max = val +1;
			}
		}
		return max;
	}
	
	public static void moveZeroEnd(int[] arr) {
		if(arr == null || arr.length == 0) {
			return;
		}
		
		int i = 0;
		int len = arr.length;
		while( i < arr.length) {
			while(i < len && arr[i] != 0) i++;
			if(i >= len) break;
			int j = i + 1;
			while(j < len && arr[j] == 0) j++;
			if(j >= len) break;
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
		}
		
	}
	
	public static void reverseList(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = tmp;
		}
	}
	
	public static void printList(int[] arr) {
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length - 1) 
				System.out.print(",");
		}
	}
	

	private static final int HashMap = 0;

	public static void main(String[] args) {

		char[] arr = new char[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('a' + i);
		}
		for (int i = 0; i < arr.length/2; i++) {
			arr[i] = 'a';
		}
		for (int i = arr.length/2; i < arr.length; i++) {
			arr[i] = 'b';
		}
		
		System.out.println(arr);
		System.out.println(maxCount(arr));
		
		int[] list = {3,5,9,7,0,5,0,6,0};
		printList(list);
		moveZeroEnd(list);
//		reverseList(list);
		System.out.println();
		printList(list);
		
	}

}
