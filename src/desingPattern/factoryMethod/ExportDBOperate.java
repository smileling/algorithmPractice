package desingPattern.factoryMethod;

public class ExportDBOperate extends ExportOperate {
	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportDB();
	}
}
