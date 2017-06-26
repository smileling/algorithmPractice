package designPattern.Adapter;

import java.util.List;

public class TwoDirectAdapter implements LogFileOperateApi,LogDBOperateApi{
	private LogFileOperateApi fileLog;
	private LogDBOperateApi dbLog;
	
	public TwoDirectAdapter(LogFileOperateApi fileLog, LogDBOperateApi dbLog) {
		this.fileLog = fileLog;
		this.dbLog = dbLog;
	}
	
	//以下是把DB操作的方式适配成文件实现方法接口
	@Override
	public List<LogModel> readeLogFile() {
		return dbLog.getAllLog();
	}
	@Override
	public void writeLogFile(List<LogModel> list) {
		for(LogModel lm : list) {
			dbLog.createLog(lm);
		}
	}
	
	//以下是把文件操作的方式适配成DB实现方法接口
	@Override
	public void createLog(LogModel lm) {
		List<LogModel> list = fileLog.readeLogFile();
		list.add(lm);
		fileLog.writeLogFile(list);
	}
	@Override
	public void updateLog(LogModel lm) {
		List<LogModel> list = fileLog.readeLogFile();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getLogId().equals(lm.getLogId())) {
				list.set(i, lm);
				break;
			}
		}
		fileLog.writeLogFile(list);
	}
	@Override
	public void removeLog(LogModel lm) {
		List<LogModel> list = fileLog.readeLogFile();
		list.remove(lm);
		fileLog.writeLogFile(list);
	}
	@Override
	public List<LogModel> getAllLog() {
		return fileLog.readeLogFile();
	}
	
	
}
