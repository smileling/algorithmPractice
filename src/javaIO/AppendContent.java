package javaIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendContent {

	public static void main(String[] args) {

		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/out.txt", "rw");
			raf.seek(raf.length());
			raf.write("追加的内容！\r\n".getBytes());
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(raf != null) {
					raf.close();
				} 
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
