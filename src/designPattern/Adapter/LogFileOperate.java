package designPattern.Adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
	private String logFilePathName = "AdapterLog.log";
	
	public LogFileOperate(String logFilePathName) {
		if(logFilePathName != null && logFilePathName.trim().length()>0) {
			this.logFilePathName = logFilePathName;
		}
		System.out.println("logFilePathName=" + logFilePathName);
	}
	
	public List<LogModel> readeLogFile() {
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		try {
			File f = new File(logFilePathName);
			if(f.exists()) {
				oin = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(f)));
				list = (List<LogModel>)oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oin != null) {
					oin.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void writeLogFile(List<LogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(f)));
			oout.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oout != null) {
					oout.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
