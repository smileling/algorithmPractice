package multiThread;

public class DepositThread extends Thread {
	private int i;
	private Account account;
	private double depositAmount;
	public DepositThread(String name, Account account, double depositAmount) {
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}
	
	@Override
	public void run() {
		for (; i < 6; i++) {
			account.deposit(depositAmount);
		}
	}
}
