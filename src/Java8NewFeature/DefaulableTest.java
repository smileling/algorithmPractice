package Java8NewFeature;

interface Defaulable {
	//default String notRequired(); //the method should have body, or define it as abstract
	default String notRequired() {
		return "Default implementation";
	}
}

class DefaultableImpl implements Defaulable {
	public static void print() {
		System.out.println("DefaultableImpl");
	}
}

class OverridableImpl implements Defaulable {
	@Override
	public String notRequired() {
		return "Overridden implementation";
	}
}

public class DefaulableTest {

	public static void main(String[] args) {
		OverridableImpl oi = new OverridableImpl();
		System.out.println(oi.notRequired());
	}

}
