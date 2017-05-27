package multiThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private final Lock lock = new ReentrantLock();
	private final Condition cond = lock.newCondition();
	private String accountNo;
	private double balance;
	private boolean flag = false;
	public Account() {}
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
//	public synchronized void draw(double drawAmount) {
//		try {
//			if(!flag) {
//				wait();
//			} else {
//				System.out.println(Thread.currentThread().getName() + " 取钱：" + drawAmount);
//				balance -= drawAmount;
//				System.out.println("账户余额为：" + balance);
//				flag = false;
//				notifyAll();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
	public void draw(double drawAmount) {
		lock.lock();
		try {
			if(!flag) {
				cond.await();
			} else {
				System.out.println(Thread.currentThread().getName() + " 取钱：" + drawAmount);
				balance -= drawAmount;
				System.out.println("账户余额为：" + balance);
				flag = false;
				cond.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
//	public synchronized void deposit(double depositAmount) {
//		try {
//			if(flag) {
//				wait();
//			} else {
//				System.out.println(Thread.currentThread().getName() + " 存款：" + depositAmount);
//				balance += depositAmount;
//				System.out.println("账户余额为：" + balance);
//				flag = true;
//				notifyAll();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
	public void deposit(double depositAmount) {
		lock.lock();
		try {
			if(flag) {
				cond.await();
			} else {
				System.out.println(Thread.currentThread().getName() + " 存款：" + depositAmount);
				balance += depositAmount;
				System.out.println("账户余额为：" + balance);
				flag = true;
				cond.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
