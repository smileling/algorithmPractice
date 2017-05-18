package javaCollection;

import java.util.EnumMap;

//enum Season {
//	SPRING, SUMMER, FALL, WINTER
//}

public class TestEnumMap {

	public static void main(String[] args) {

		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER, "夏日炎炎");
		enumMap.put(Season.SPRING, "春暖花开");
		System.out.println(enumMap);
	}

}
