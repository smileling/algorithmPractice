package multiThread;

public class TestDraw {

	public static void main(String[] args) {

		Account acct = new Account("1234567", 0);
		new DrawThread("取钱者", acct, 800).start();
		new DepositThread("存款者甲", acct, 800).start();
		new DepositThread("存款者乙", acct, 800).start();
//		new DepositThread("存款者丙", acct, 800).start();
		
//		Account acct2 = new Account("1234568", 0);
//		new DrawThread("取钱者2", acct2, 800).start();
//		new DepositThread("存款者乙", acct2, 800).start();
	}

}
