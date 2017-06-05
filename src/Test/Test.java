package Test;

import java.io.File;

public class Test {
	
	public void getRes() {
		System.out.println(this.getClass().getClassLoader().getResource("").toString());
		System.out.println(this.getClass());
		System.out.println(this.getClass().getClassLoader());
		System.out.println(this.getClass().getCanonicalName());
		System.out.println(this.getClass().getClassLoader().getParent());
		System.out.println(this.getClass().getClassLoader().getParent().getParent());
		System.out.println(this.getClass().getClassLoader().getSystemClassLoader());
	}

	public static void main(String[] args) {

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
		
		File appDir = new File()

}
