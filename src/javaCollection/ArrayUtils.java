package javaCollection;

public class ArrayUtils {
	
	public static int search(String[] arr, String ele) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].equals(ele)) {
				index = i;
				break;
			}
		}
		return index;
	}

}
