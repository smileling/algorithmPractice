package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectOut {

	public static void main(String[] args) {

		PrintStream ps = null;
		try {
			String filename = "/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/RedirectOut.txt";
			ps = new PrintStream(new FileOutputStream(filename));
			System.setOut(ps);
			System.out.println("普通字符串");
			System.out.println(new RedirectOut());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

}
