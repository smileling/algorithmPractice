package classLoadAndReflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ObjectPoolFactory {
	
	private Map<String, Object> objectPool = new HashMap<String, Object>();
	
	private Object createObject(String clazzName) 
			throws ClassNotFoundException, InstantiationException, 
			IllegalAccessException {
		Class<?> clazz = Class.forName(clazzName);
		return clazz.newInstance();
	}
	
	public void initPool(String fileName)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			Properties props = new Properties();
			props.load(fis);
			for (String name : props.stringPropertyNames()) {
				objectPool.put(name, createObject(props.getProperty(name)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Object getObject(String name) {
		return objectPool.get(name);
	}
	
	public void getObjects() {
		for(String name:objectPool.keySet()) {
			System.out.println(name + "=" + objectPool.get(name));
		}
	}
	
	public static void main(String[] args) throws Exception {
		ObjectPoolFactory pf = new ObjectPoolFactory();
		pf.initPool("/Users/ling/eclipse/workspace/JavaPractice/src/classLoadAndReflect/obj.txt");
		System.out.println(pf.getObject("a"));
		pf.getObjects();
		System.out.println();
		
		Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
		Constructor ctor = jframeClazz.getConstructor(String.class);
		Object obj = ctor.newInstance("测试窗口");
		System.out.println(obj);
		
	}

}
