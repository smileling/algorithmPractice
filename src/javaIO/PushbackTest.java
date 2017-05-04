package javaIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackTest {

	public static void main(String[] args) {

		PushbackReader pr = null;
		try {
			String filename = "/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/PushbackTest.java";
			pr = new PushbackReader(new FileReader(filename), 64);
			char[] buf = new char[32];
			String lastContent = "";
			int hasRead = 0;
			while ((hasRead = pr.read(buf)) > 0) {
				String content = new String (buf, 0, hasRead);
				int targetIndex = 0;
				if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
					System.out.println();
					System.out.println("++++++++++" + lastContent + "++++++++");
					System.out.println("++++++++++" + content + "++++++++");
					System.out.println("++++++++++" + buf + "++++++++");
					pr.unread((lastContent + content).toCharArray());
					pr.read(buf, 0, targetIndex);
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				} else {
					System.out.print(lastContent);
					lastContent = content;
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (pr != null) {
					pr.close();
				} 
			} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}

}
