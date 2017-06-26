package multiThread;

public class DrawThread extends Thread {
	private int i;
	private Account account;
	private double drawAmount;
	public DrawThread(String name, Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
//	public DrawThread(Account account, double drawAmount) {
//		this.account = account;
//		this.drawAmount = drawAmount;
//	}
	
	@Override
	public void run() {
		for (; i < 6; i++) {
			account.draw(drawAmount);
		}
	}
}
