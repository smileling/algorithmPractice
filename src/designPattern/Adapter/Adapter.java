package designPattern.Adapter;

import java.util.List;

public class Adapter implements LogDBOperateApi {
	
	private LogFileOperateApi adaptee;
	public Adapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}
	
	public void createLog(LogModel lm) {
		List<LogModel> list = adaptee.readeLogFile();
		list.add(lm);
		adaptee.writeLogFile(list);
	}
	public void updateLog(LogModel lm) {
		List<LogModel> list = adaptee.readeLogFile();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getLogId().equals(lm.getLogId())) {
				list.set(i, lm);
				break;
			}
		}
		adaptee.writeLogFile(list);
	}
	public void removeLog(LogModel lm) {
		List<LogModel> list = adaptee.readeLogFile();
		list.remove(lm);
		adaptee.writeLogFile(list);
	}
	public List<LogModel> getAllLog() {
		return adaptee.readeLogFile();
	}
}
