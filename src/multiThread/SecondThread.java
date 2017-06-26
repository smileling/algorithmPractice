package multiThread;

public class SecondThread implements Runnable {

	private int i;
	@Override
	public void run() {
		for (; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i ==20) {
				SecondThread st = new SecondThread();
				new Thread(st, "theard1").start();
				new Thread(st, "theard2").start();
				Thread.sleep(1);
			}
		}
	}

}
