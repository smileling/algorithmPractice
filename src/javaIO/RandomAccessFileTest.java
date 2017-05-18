package javaIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {

		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("/Users/ling/eclipse/workspace/JavaPractice/src/javaIO/RandomAccessFileTest.java", "r");
			System.out.println("RandomAccessFilede文件指针的初始位置：" + raf.getFilePointer());
			raf.seek(300);
			System.out.println("RandomAccessFilede文件指针的位置：" + raf.getFilePointer());
			byte[] bbuf = new byte[1024];
			int hasRead = 0;
			while((hasRead = raf.read(bbuf)) > 0) {
				System.out.print(new String(bbuf, 0, hasRead));
			}
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
