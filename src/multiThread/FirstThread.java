package multiThread;

public class FirstThread extends Thread {
	private int i;
	
	public void run() {
		for (; i < 10 ; i++) {
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 5) {
				FirstThread ft = new FirstThread();
				ft.setName("thread0");
				ft.start();
				new FirstThread().start();
			}
		}
	}

}
