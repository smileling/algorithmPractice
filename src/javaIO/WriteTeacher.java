package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTeacher {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/teacher.txt"));
			Person per = new Person("孙悟空", 500);
			Teacher t1 = new Teacher("唐僧", per);
			Teacher t2 = new Teacher("菩提祖师", per);
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(oos != null) 
					oos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
