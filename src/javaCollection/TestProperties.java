package javaCollection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws Exception {

		String filename = "/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/a.ini";
		Properties props = new Properties();
		props.setProperty("username", "yeeku");
		props.setProperty("password", "123456");
		props.store(new FileOutputStream(filename), "comment line");
		Properties props2 = new Properties();
		props2.setProperty("gender", "male");
		props2.load(new FileInputStream(filename));
		System.out.println(props2);
		props2.setProperty("username", "ling");
		System.out.println(props2);
		props2.setProperty("aaa", "bbb");
		System.out.println(props2);
	}

}
