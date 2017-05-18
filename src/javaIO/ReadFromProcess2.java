package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess2 {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			Process p = Runtime.getRuntime().exec("java ReadStandard2");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String buff = null;
			while((buff = br.readLine()) != null) {
				System.out.println(buff);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				} 
			} catch (IOException ioe) {
					ioe.printStackTrace();
			}
		}
	}

}

class ReadStandard2 {
	public static void main(String[] args) throws Exception {
		System.out.println("hello, this is ReadStandard2~");
		System.out.println("bye");
	}
}

