package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToProcess {

	public static void main(String[] args) {

		PrintStream ps = null;
		try {
			Process p = Runtime.getRuntime().exec("java ReadStandard");
			ps = new PrintStream(p.getOutputStream());
			ps.println("普通字符串");
			ps.println(new WriteToProcess());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}

}

class ReadStandard {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(
				new FileOutputStream("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/out.txt"));
		sc.useDelimiter("\n");
		while(sc.hasNext()) {
			ps.println("键盘输入的内容是："+ sc.next());
		}
		ps.close();
		sc.close();
	}
}
