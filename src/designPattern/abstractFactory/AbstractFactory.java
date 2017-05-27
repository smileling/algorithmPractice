package designPattern.abstractFactory;

public interface AbstractFactory {
	public CPUApi createCPUApi();
	public MainboardApi createMainboardApi();
}
