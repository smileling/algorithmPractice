package Java8NewFeature;

import java.util.function.Supplier;

public class InterfaceStaticMethodTest {

	private interface DefaulableFactory {
		static Defaulable create(Supplier<Defaulable> supplier) {
			return supplier.get();
		}
	}
	
	public static void main(String[] args) {
		Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.notRequired());
		
		defaulable = DefaulableFactory.create( OverridableImpl::new );
	    System.out.println( defaulable.notRequired() );
	}

}
