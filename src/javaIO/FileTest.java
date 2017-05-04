package javaIO;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile().getParent());
		File tmpFile = File.createTempFile("aaa", ".txt", file);
		tmpFile.deleteOnExit();
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("Is newFile object exist? " + newFile.exists());
		newFile.createNewFile();
		System.out.println("Is newFile object exist? " + newFile.exists());
		newFile.mkdir();
		newFile.deleteOnExit();
		String[] fileList = file.list();
		System.out.println("=========当前路径下所有文件和路径如下========");
		for(String fileName : fileList) {
			System.out.println(fileName);
		}
//		File[] roots = File.listRoots();
		File[] roots = file.listFiles();
		System.out.println("=========系统所有跟路径如下========");
		for(File root : roots) {
			System.out.print("Is dir? " + root.isDirectory() + ", is file? " + root.isFile() + ", ");
			System.out.println(root);
		}
		
	}

}
