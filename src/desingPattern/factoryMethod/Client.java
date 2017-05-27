package desingPattern.factoryMethod;

public class Client {
	public static void main(String[] args) {
		ExportOperate operate = new ExportDBOperate();
		System.out.println(operate.export("TestData"));
		
		ExportOperate2 operate2 = new ExportOperate2();
		operate2.export(1, "TestData2");
	}
}
