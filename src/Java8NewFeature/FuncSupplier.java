package Java8NewFeature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FuncSupplier {

	public static FuncSupplier create(final Supplier<FuncSupplier> supplier) {
		return supplier.get();
	}
	
	public static void collide(final FuncSupplier fs) {
		System.out.println("Collided " + fs.toString());
	}
	
	public void follow (final FuncSupplier another) {
		System.out.println("Following the " + another.toString());
	}
	
	public void repair() {
		System.out.println("Repaired " + this.toString());
	}
	
	public static void main(String[] args) {

		//构造器引用，Class::new
		final FuncSupplier fs = FuncSupplier.create(FuncSupplier::new);
		final FuncSupplier fs2 = FuncSupplier.create(FuncSupplier::new);
		final List<FuncSupplier> fss = Arrays.asList(fs,fs2);
		
		//静态方法引用，Class::static_method
		fss.forEach(FuncSupplier::collide);
		
		//特定类的任意对象的方法引用，Class::method
		fss.forEach(FuncSupplier::repair);
		
		//特定对象的方法引用，instance::method
		final FuncSupplier police = FuncSupplier.create(FuncSupplier::new);
		fss.forEach(police::follow);
		
		
	}

}
