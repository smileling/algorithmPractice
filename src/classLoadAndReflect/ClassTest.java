package classLoadAndReflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

@SuppressWarnings(value="unchecked")
@Deprecated
public class ClassTest {
	
	public int num;
	String str;
	public Set<String> set;
	public Map<String, Integer> map;
	
	private ClassTest() {
	}
	
	public ClassTest(String name) {
		System.out.println("执行有参数的构造器");
	}
	
	public void info() {
		System.out.println("执行无参数的info方法");
	}
	
	public void info(String str) {
		System.out.println("执行有参数的info方法" + ", str = " + str);
	}
	
	class Inner {}
	
	public static void main(String[] args) throws Exception {

		Class<ClassTest> clazz = ClassTest.class;
//		Class<ClassTest> clazz = (Class<ClassTest>) Class.forName("classLoadAndReflect.ClassTest");
		
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest的全部构造器如下：");
		for(Constructor c : ctors) {
			System.out.println(c);
		}
		Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest的全部public构造器如下：");
		for(Constructor c : publicCtors) {
			System.out.println(c);
		}
		
		Method[] mtds = clazz.getDeclaredMethods();
		System.out.println("ClassTest的全部方法如下：");
		for(Method md : mtds) {
			System.out.println(md);
		}
		
		Method[] publicMtds = clazz.getMethods();
		System.out.println("ClassTest的全部public方法如下：");
		for(Method md : publicMtds) {
			System.out.println(md);
		}
		
		Annotation[] anns = clazz.getAnnotations();
		System.out.println("ClassTest的全部Annotation如下：");
		for(Annotation an : anns) {
			System.out.println(an);
		}
		System.out.println(clazz.getAnnotation(SuppressWarnings.class));
		
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest的全部的内部类如下：");
		for(Class c : inners) {
			System.out.println(c);
		}
		
		Class inClazz = Class.forName("classLoadAndReflect.ClassTest$Inner");
		System.out.println(inClazz.getDeclaringClass());
		System.out.println(clazz.getDeclaringClass());
		
		System.out.println(clazz.getPackage());
		System.out.println(clazz.getSuperclass());
		
		Class<?> clazz2 = Class.forName("classLoadAndReflect.ClassTest");
		System.out.println(clazz2.getMethod("info", String.class));
		Method mtd = clazz2.getMethod("info", String.class);
		mtd.invoke(clazz2.newInstance(), "hello");
		
		//通过反射来获取范型信息
		Field a = clazz.getField("num");
		Class<?> aType = a.getType();
		System.out.println(a);
		System.out.println(aType);
		System.out.println(clazz.getDeclaredField("str").getType());
		System.out.println(clazz.getField("set"));
		System.out.println(clazz.getField("set").getType());
		System.out.println(clazz.getField("set").getGenericType());
		
		System.out.println(clazz.getField("map"));
		System.out.println(clazz.getField("map").getType());
		System.out.println(clazz.getField("map").getGenericType());
		
		Field f = clazz.getField("map");
		Class<?> type = f.getType();
		Type gType = f.getGenericType();
		if(gType instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType)gType;
			Type rType = pType.getRawType();
			Type[] tArgs = pType.getActualTypeArguments();
			for(int i = 0; i < tArgs.length; i++) {
				System.out.println("第" + i + "个泛型类型是" + tArgs[i]);
			}
		} else {
			System.out.println("获取泛型类型出错");
		}
	}

}
