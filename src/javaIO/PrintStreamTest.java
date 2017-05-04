package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/test.txt");
			ps = new PrintStream(fos);
			ps.println("普通字符串");
			ps.println(new PrintStreamTest());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			ps.close();
		}
	}

}
