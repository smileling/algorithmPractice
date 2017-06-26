package desingPattern.factoryMethod;

public class ExportDB implements ExportFileApi {
	@Override
	public boolean export (String data) {
		System.out.println("Export data " + data + " to database backup file.");
		return true;
	}

}
