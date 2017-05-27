package designPattern.abstractFactory;

public class MSIMainboard implements MainboardApi {
	private int cpuHoles = 0;
	public MSIMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}
	public void installCPU() {
		System.out.println("now in MSIMainboard, cpuHoles = " + cpuHoles);
	}
}
