package javaCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FixedSizeList {

	public static void main(String[] args) {

		List fixedList = Arrays.asList("Structs2", "ROR");
		System.out.println(fixedList.getClass());
		for(int i = 0; i < fixedList.size(); i++) {
			System.out.println(fixedList.get(i));
		}
//		fixedList.add("ROR"); //java.lang.UnsupportedOperationException
//		fixedList.remove("ROR");//java.lang.UnsupportedOperationException
		
		Iterator it = fixedList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
