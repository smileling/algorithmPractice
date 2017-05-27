package Java8NewFeature;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
		System.out.println("a".compareTo("b"));
		Arrays.asList("a", "b", "c").sort((e1,e2) -> e1.compareTo(e2));
	}

}
