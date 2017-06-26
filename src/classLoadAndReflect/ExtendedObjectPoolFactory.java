package classLoadAndReflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ExtendedObjectPoolFactory {
	
	private Map<String, Object> objectPool = new HashMap<String, Object>();
	
	private Properties config = new Properties();
	
	public void init(String fileName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			config.load(fis);
		} catch (IOException ex) {
			System.out.println("读取"+fileName+"异常");
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private Object createObject(String clazzName) 
			throws ClassNotFoundException, InstantiationException, 
			IllegalAccessException {
		Class<?> clazz = Class.forName(clazzName);
		return clazz.newInstance();
	}
	
	public void initPool() 
			throws ClassNotFoundException, InstantiationException, 
			IllegalAccessException {
		for (String name : config.stringPropertyNames()) {
			if (!name.contains("%")) {
				objectPool.put(name, createObject(config.getProperty(name)));
			}
		}
	}
	
	public Object getObject(String name) {
		return objectPool.get(name);
	}
	
	public void initProperty() 
			throws NoSuchMethodException, SecurityException, IllegalAccessException, 
			IllegalArgumentException, InvocationTargetException {
		for (String name : config.stringPropertyNames()) {
			if (name.contains("%")) {
				String[] objAndProp = name.split("%");
				Object target = getObject(objAndProp[0]);
				String mtdName = "set"
						+ objAndProp[1].substring(0, 1).toUpperCase() 
						+ objAndProp[1].substring(1);
				Class<?> targetClass = target.getClass();
				Method mtd = targetClass.getMethod(mtdName, String.class);
				mtd.invoke(target, config.getProperty(name));
			}
		}
	}

	public void getObjects() {
		for(String name:objectPool.keySet()) {
			System.out.println(name + "=" + objectPool.get(name));
		}
	}
	
	public static void main(String[] args) throws Exception {
		ExtendedObjectPoolFactory epf = new ExtendedObjectPoolFactory();
		epf.init("/Users/ling/eclipse/workspace/JavaPractice/src/classLoadAndReflect/extObj.txt");
		epf.initPool();
//		epf.initProperty();
		System.out.println(epf.getObject("a"));
//		epf.getObjects();
	}

}
