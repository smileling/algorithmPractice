package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/object.txt"));
			Person per = new Person("孙悟空", 500);
			oos.writeObject(per);
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
