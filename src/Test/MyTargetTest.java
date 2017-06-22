package Test;

public class MyTargetTest {

	@MyTarget(
		id = 2868724,
		synopsis = "Enable time-travel",
		engineer = "Mr.Peabody",
		date = "4/1/3007"
			)
	public static void doSomething() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		doSomething();
	}

}
