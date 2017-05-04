package javaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException  {

		FileInputStream fis = new FileInputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/FileInputStreamTest.java");
		int len = 10;
		byte[] bbuf = new byte[len];
		int hasRead = 0;
		int i = 0;
		while ((hasRead = fis.read(bbuf)) > 0 ) {
			i++;
			System.out.println("=====read "+i +": =======");
			System.out.println(new String(bbuf, 0, hasRead));
		}
		fis.close();
	}

}
