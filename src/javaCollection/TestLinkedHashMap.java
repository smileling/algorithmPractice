package javaCollection;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap scores = new LinkedHashMap();
//		Hashtable scores = new Hashtable();
		scores.put("语文", 80);
		scores.put("数学", 76);
		scores.put("英语", 90);
		for(Object key : scores.keySet()) {
			System.out.print(key + "---->");
			System.out.print(scores.get(key) + "\n");
		}
	}

}
