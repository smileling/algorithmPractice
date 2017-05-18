package desingPattern.factoryMethod;

public class ExportTxtFileOperate extends ExportOperate {
	protected ExportFileApi factoryMethod() {
		return new ExportTxtFile();
	}

}
