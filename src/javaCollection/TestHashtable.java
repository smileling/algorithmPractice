package javaCollection;

import java.util.Hashtable;

class AA {
	int count;
	public AA(int count) {
		this.count = count;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == AA.class) {
			AA a = (AA)obj;
			if(this.count == a.count) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.count;
	}
}
class B {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
public class TestHashtable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new AA(60000), "Struts2");
		ht.put(new AA(87563), "J2EE");
		ht.put(new AA(1232), new B());
		System.out.println(ht);
		System.out.println(ht.containsValue("测试字符串")); //true
		System.out.println(ht.containsKey(new AA(87563)));
		ht.remove(new AA(1232));
//		System.out.println(ht.keySet());
		for(Object key: ht.keySet()) {
			System.out.print(key + "---->");
			System.out.print(ht.get(key) + "\n");
		}
		
		System.out.println(ht.containsValue("测试字符串")); //false
	}

}
