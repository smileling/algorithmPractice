package Test;

import java.util.ArrayList;
import java.util.List;

class Final {
	public final int ff = 1;
	
	public final void print() {
		System.out.println("This is Final.print, ff = " + ff);
	}
	
	public void print2() {
		System.out.println("This is Final.print2, ff = " + ff);
	}
	
	private void privateFun() {
		System.out.println("Final.privateFun");
	}
	
	protected void protectedFun() {
		System.out.println("Final.protectedFun");
	}
}

class Final2 extends Final {
	public int ff2 = 2;
		
	@Override
	public void print2() {
		System.out.println("This is Final2.print2, ff = " + ff);
	}
	
	@Override
	protected void protectedFun() {
		System.out.println("Final.protectedFun");
	}
}

class Final3 extends Final2 {
	public int ff3 = 3;
	public int ff = 111;
	
	@Override
	protected void protectedFun() {
		System.out.println("Final3.protectedFun");
	}
	
	@Override
	public void print2() {
		System.out.println("This is Final3.print2, ff = " + ff);
	}
	
}

public class FinalTest {

	private final String S = "final实例变量S";
	private final int A = 100;
	public final int B = 90;
	
	public static final int C =80;
	private static final int D = 70;
	
	public final int E;
	
	public FinalTest(int x) {
		E = x;
	}
	
	private void test() {
		System.out.println(new FinalTest(1).A);
		System.out.println(FinalTest.C);
		System.out.println(FinalTest.D);
	}
	
	private int sum(final List<Integer> list) {
		int s = 0;
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			l.add(list.get(i) + i);
		}
//		list = l;
		for (int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		System.out.println(list);
		return s;
	}
	
	public static void main(String[] args) {

//		Final f = new Final2();
//		f.print();
//		f.print2();
//		
//		Final f3 = new Final3();
//		f3.print();
//		f3.print2();
//		f3.protectedFun();
	
		FinalTest ft = new FinalTest(2);
		System.out.println(ft.A);
		System.out.println(ft.B);
		System.out.println(FinalTest.C);
		System.out.println(FinalTest.D);
		System.out.println(FinalTest.C);
		System.out.println(FinalTest.D);
		System.out.println(ft.E);
		
		FinalTest ft2 = new FinalTest(3);
		System.out.println(ft2.E);
		ft.test();
		
//		int[] list = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(list.length);
//		System.out.println(new FinalTest(1).sum(list));
//		System.out.println(list.length);
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(new FinalTest(1).sum(list));
		System.out.println(list);
		
	}

}
