package javaCollection;

import java.util.WeakHashMap;

public class TestWeakHashMap {

	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		whm.put(new String("语文"), new String("良好"));
		whm.put(new String("数学"), new String("及格"));
		whm.put(new String("英文"), new String("中等"));
		whm.put("java", new String("中等"));
		System.out.println(whm);
		whm.put("英文", new String("良好"));
		System.out.println(whm);
		//通知系统立即进行垃圾回收
		System.gc();
		System.runFinalization();
		System.out.println(whm);

		System.out.println("java" == new String("java"));
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1 == s2); //false,比较的两个对象是否指向同一地址
		System.out.println(s1.equals(s2)); //true
		
	}

}
