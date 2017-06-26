package classLoadAndReflect;

import java.util.Enumeration;

public class ClassLoaderPropTest {

	public static void main(String[] args) {
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("系统类加载器：" + systemLoader);
		System.out.println("扩展类加载器：" + systemLoader.getParent());
		System.out.println("resource：" + systemLoader.getResource(""));
		System.out.println("扩展类加载器的加载路径：" + System.getProperty("java.ext.dirs"));
		System.out.println("系统类加载器的加载路径：" + System.getProperty("java.class.path"));
//		Enumeration<URL> em1 = systemLoader.getResources("");
		
	}

}
