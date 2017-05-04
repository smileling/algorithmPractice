package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			String filename = "/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/BufferedReaderTest.java";
			FileReader fr = new FileReader(filename); 
			br = new BufferedReader(fr);
			String buffer = null;
			while ((buffer = br.readLine()) != null) {
//				if (buffer.equals("exit")) {
//					System.exit(1);
//				}
//				System.out.println("输入内容为： " + buffer);
				System.out.println(buffer);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
