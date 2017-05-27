package designPattern.abstractFactory;

public class ComputerEngineer {
	private CPUApi cpu = null;
	private MainboardApi mainboard = null;
	public void makeComputer(AbstractFactory schema) {
		prepareHardwares(schema);
	}
	
	private void prepareHardwares(AbstractFactory schema) {
		this.cpu = schema.createCPUApi();
		this.mainboard = schema.createMainboardApi();
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}

	public static void main(String[] args) {
		//Client
		ComputerEngineer engineer = new ComputerEngineer();
		AbstractFactory schema = new Schema1();
		engineer.makeComputer(schema);

	}

}
