package desingPattern.factoryMethod;

public class ExportDBOperate extends ExportOperate {
	protected ExportFileApi factoryMethod() {
		return new ExportDB();
	}
}
