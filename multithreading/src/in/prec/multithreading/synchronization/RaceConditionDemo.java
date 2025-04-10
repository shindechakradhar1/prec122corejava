package in.prec.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionDemo {
	float balance = 1000;
	private final Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		RaceConditionDemo demo = new RaceConditionDemo();
		Runnable runnable1 = () -> demo.credit(800);

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable1);

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(demo.getBalance());
	}

	public /* synchronized */ void credit(int amount) {
		System.out.println(Thread.currentThread().getName());
		
		lock.lock();
//		synchronized(this){
		if (balance > amount) {
			balance -= amount;
			System.out.println("Amount Credited: " + amount);
		} else {
			System.out.println("InSufficient Balance");
		}
//		}
		lock.unlock();

	}

	public float getBalance() {
		return balance;
	}
}
