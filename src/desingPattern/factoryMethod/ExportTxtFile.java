package desingPattern.factoryMethod;

public class ExportTxtFile implements ExportFileApi {
	public boolean export (String data) {
		System.out.println("Export data " + data + "to TXT file.");
		return true;
	}
}
