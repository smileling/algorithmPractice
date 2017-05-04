package javaCollection;

import java.util.HashSet;
import java.util.Iterator;

class R {
	int count;
	public R(int count) {
		this.count = count;
	}
	
	public String toString() {
		return "R(count 属性：" + count + ")";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof R) {
			R r = (R)obj;
			if(r.count == this.count) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return this.count;
	}
}

public class TestHashSet2 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//打印HashSet集合，集合元素没有重复
		System.out.println(hs);
		//取出第一个元素
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//为第一个元素的count属性赋值
		first.count = -3;
		//再次输出HashSet集合，集合元素有重复元素
		System.out.println(hs);
		//删除count为－3的R对象
		hs.remove(new R(-3));
		//可以看到被删除了一个R元素
		System.out.println(hs);
		
		System.out.println("hs是否包含count为-3的R对象？" + hs.contains(new R(-3)));
		
		System.out.println("hs是否包含count为-2的对象？" + hs.contains(new R(-2)));
		
		
		HashSet hs2 = new HashSet();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println(hs2);
		Iterator it2 = hs2.iterator();
		int ff = (int)it.next();
		ff = 6;
		System.out.println(hs2);
		
	}

}
