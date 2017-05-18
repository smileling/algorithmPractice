package Test;

public class A3 {
    public static int D = 1;
    private static A3 a3 = new A3();
    private A3() {
    	System.out.println("this is the construct");
    	try{
    		Thread.sleep(1);
    	}catch (Exception e){
    		//
    	}
    }
    public void C(){
    	System.out.println("This is C");
//    	return a3;
    }
    
    public static void main(String[] args) {
		System.out.println(A3.D);
	}
}
	