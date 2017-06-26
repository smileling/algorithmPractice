package javaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

class R2 implements Comparable {
	int count;
	public R2 (int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "R(count属性：" +count+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == R2.class) {
			R2 r = (R2)obj;
			if (r.count == this.count) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Object obj) {
		R2 r = (R2)obj;
		if (this.count  > r.count) {
			return 1;
		} else if(this.count == r.count) {
			return 0;
		} else {
			return -1;
		}
	}
}
public class TestTreeMap {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(new R2(3), "J2EE");
		tm.put(new R2(-5), "Structs2");
		tm.put(new R2(9), "ROR");
		System.out.println(tm);
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey(new R2(3)));
		System.out.println(tm.lowerEntry(new R2(4)));
		System.out.println(tm.subMap(new R2(-1), new R2(9)));
		System.out.println(tm.subMap(new R2(-1), true, new R2(9), true));
		System.out.println(tm.tailMap(new R2(3)));
		System.out.println(tm.headMap(new R2(3)));
		
		System.out.println(tm);
		HashSet hs = new HashSet();
		hs.addAll(tm.keySet());
//		System.out.println(hs);
//		System.out.println(hs.size());
		R2[] arr = new R2[hs.size()];
		hs.toArray(arr);
		System.out.println(hs);
		System.out.println(Arrays.binarySearch(arr, new R2(3)));
		System.out.println(tm.get(arr[Arrays.binarySearch(arr, new R2(3))]));

	}

}
