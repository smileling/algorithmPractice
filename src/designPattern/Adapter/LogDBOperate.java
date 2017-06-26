package designPattern.Adapter;

import java.util.List;

public class LogDBOperate implements LogDBOperateApi {
	@Override
	public void createLog(LogModel lm) {
		System.out.println("Now in LogDBOperate createLog, lm=" + lm);
	}
	@Override
	public void updateLog(LogModel lm) {
		System.out.println("Now in LogDBOperate updateLog, lm=" + lm);
		
	}
	@Override
	public void removeLog(LogModel lm) {
		System.out.println("Now in LogDBOperate removeLog, lm=" + lm);
	}
	@Override
	public List<LogModel> getAllLog() {
		System.out.println("Now in LogDBOperate getAllLog");
		return null;
	}
}
