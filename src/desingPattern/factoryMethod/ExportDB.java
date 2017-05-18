package desingPattern.factoryMethod;

public class ExportDB implements ExportFileApi {
	public boolean export (String data) {
		System.out.println("Export data " + data + " to database backup file.");
		return true;
	}

}
