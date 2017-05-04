package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			br = new BufferedReader(reader);
			String buffer = null;
			while ((buffer = br.readLine()) != null) {
				if (buffer.equals("exit")) {
					System.exit(1);
				}
				System.out.println("输入内容为： " + buffer);
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
