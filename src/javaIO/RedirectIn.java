package javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RedirectIn {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			String filename = "/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/RedirectIn.java";
			fis = new FileInputStream(filename);
			System.setIn(fis);
			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("\n");
			while(sc.hasNext()) {
				System.out.println("键盘输入的内容是：" + sc.next());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}

}
