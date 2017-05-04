package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/FileReaderTest.java");
			int len = 10;
			char[] cbuf = new char[10];
			int hasRead = 0;
			int i = 0;
			while((hasRead = fr.read(cbuf)) > 0) {
				i++;
				System.out.println("===========" + i + "===========");
				System.out.println(new String(cbuf, 0, hasRead));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
	}

}
