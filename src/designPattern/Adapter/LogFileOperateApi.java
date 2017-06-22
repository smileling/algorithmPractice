package designPattern.Adapter;

import java.util.List;

public interface LogFileOperateApi {
	public List<LogModel> readeLogFile();
	public void writeLogFile(List<LogModel> list);
}
