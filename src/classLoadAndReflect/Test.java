package classLoadAndReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
	
	public Test() {
		System.out.println("create Test...");
	}
	
	public Test(int a) {
		System.out.println("create Test...with param = " + a);
	}
	
	public Test(Integer a) {
		System.out.println("create Test...with param = " + a);
	}
	
	public void getRes() {
//		System.out.println(this.getClass().getClassLoader().getResource("").toString());
//		System.out.println(this.getClass());
//		System.out.println(this.getClass().getClassLoader());
//		System.out.println(this.getClass().getCanonicalName());
//		System.out.println(this.getClass().getClassLoader().getParent());
//		System.out.println(this.getClass().getClassLoader().getParent().getParent());
//		System.out.println(this.getClass().getClassLoader().getSystemClassLoader());
//		System.out.println(this.getClass().getClassLoader()..loadClass("Test"));
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

//		String str = "hello";
//		System.out.println(str.hashCode());
//		System.out.println(str.hashCode());
//		System.out.println(System.getProperty("java.class.path"));
//		System.out.println(System.getProperty("java.ext.dirs"));
//		System.out.println(System.getenv());
		
//		Test tt = new Test();
//		tt.getRes();
//		try {
//			Class.forName("Test.Test");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
		
		System.out.println(Test.class);
		System.out.println(Class.forName("classLoadAndReflect.Test"));
		Test t = new Test(3);
		System.out.println(t.getClass());
		
		
		Test t2 = Test.class.newInstance();
		Test t3 = (Test)Class.forName("classLoadAndReflect.Test").newInstance();
		Test t4 = t.getClass().newInstance();
		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
//		System.out.println(Class.forName("classLoadAndReflect.Test").getConstructors().length);
//		System.out.println(Class.forName("classLoadAndReflect.Test").getMethods().length);
		int len = Class.forName("classLoadAndReflect.Test").getConstructors().length;
		for (int i = 0; i < len; i++) {
//			System.out.println(Class.forName("classLoadAndReflect.Test").getMethods()[i]);
			System.out.println(Class.forName("classLoadAndReflect.Test").getConstructors()[i]);
		}
		Constructor t5 = Class.forName("classLoadAndReflect.Test").getConstructor(Integer.class);
		Test obj = (Test)t5.newInstance(2);
		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		hs.add(null);
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(null);
//		System.out.println(list);
//		System.out.println(list.get(0));
//		System.out.println(list.contains(null));
	}
		

}
