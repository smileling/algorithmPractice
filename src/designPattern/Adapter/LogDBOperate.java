package designPattern.Adapter;

import java.util.List;

public class LogDBOperate implements LogDBOperateApi {
	public void createLog(LogModel lm) {
		System.out.println("Now in LogDBOperate createLog, lm=" + lm);
	}
	public void updateLog(LogModel lm) {
		System.out.println("Now in LogDBOperate updateLog, lm=" + lm);
		
	}
	public void removeLog(LogModel lm) {
		System.out.println("Now in LogDBOperate removeLog, lm=" + lm);
	}
	public List<LogModel> getAllLog() {
		System.out.println("Now in LogDBOperate getAllLog");
		return null;
	}
}
