package javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTeacher {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/teacher.txt"));
			Teacher t1 = (Teacher)ois.readObject();
			Teacher t2 = (Teacher)ois.readObject();
			Person p = (Person)ois.readObject();
			Teacher t3 = (Teacher)ois.readObject();
			System.out.println("t1的student引用和p是否相同：" + (t1.getStudent() == p));
			System.out.println("t2的student引用和p是否相同：" + (t2.getStudent() == p));
			System.out.println("t2和t3是否是同一个对象：" + (t2 == t3));
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
