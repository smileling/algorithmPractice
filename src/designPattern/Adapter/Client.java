package designPattern.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		//use LogFileOperateApi interface
//		LogModel lm1 = new LogModel();
//		lm1.setLogId("001");
//		lm1.setOperateUser("admin");
//		lm1.setOperateTime("2017-06-05 16:36:20");
//		lm1.setLogContent("This is a test.");
//		
//		List<LogModel> list = new ArrayList<LogModel>();
//		list.add(lm1);
//		LogFileOperateApi api = new LogFileOperate("/Users/ling/eclipse/workspace/JavaPractice/src/designPattern/Adapter/AdapterLog.log");
//		api.writeLogFile(list);
//		
//		List<LogModel> readLog = api.readeLogFile();
//		System.out.println("readLog=" + readLog);
		
		//use adapter way
//		LogModel lm1 = new LogModel();
//		lm1.setLogId("001");
//		lm1.setOperateUser("admin");
//		lm1.setOperateTime("2017-06-05 16:36:20");
//		lm1.setLogContent("This is a test.");
//		LogFileOperateApi logFileApi = new LogFileOperate("/Users/ling/eclipse/workspace/JavaPractice/src/designPattern/Adapter/AdapterLog.log");
//
//		LogDBOperateApi adapter = new Adapter(logFileApi);
//		adapter.createLog(lm1);
//		
//		List<LogModel> readLog = adapter.getAllLog();
//		System.out.println("readLog=" + readLog);
		
		//use TwoDirectAdapter way
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2017-06-05 16:36:20");
		lm1.setLogContent("This is a test.");
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);
		
		LogFileOperateApi fileLogApi = new LogFileOperate("/Users/ling/eclipse/workspace/JavaPractice/src/designPattern/Adapter/AdapterLog.log");
		LogDBOperateApi dbFileApi = new LogDBOperate();
		
		TwoDirectAdapter dbLogApi2 = new TwoDirectAdapter(fileLogApi, dbFileApi);
		dbLogApi2.createLog(lm1);
		List<LogModel> allLog = dbLogApi2.getAllLog();
		System.out.println("allLog=" + allLog);
		
		TwoDirectAdapter fileLogApi2 = new TwoDirectAdapter(fileLogApi, dbFileApi);
		fileLogApi2.writeLogFile(list);
		List<LogModel> readLog = fileLogApi2.readeLogFile();
		System.out.println("readLog=" + readLog);
		
	}

}
