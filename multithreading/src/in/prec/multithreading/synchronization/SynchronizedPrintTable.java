package in.prec.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedPrintTable {
	private final Lock lock = new ReentrantLock();
	public /*synchronized*/ void printTable(int no) {
//		synchronized(this) {
		lock.lock();
		for(int i=1;i<=10;i++)
			System.out.println(no + "x" + i + "= " + no*i);
//		}
		lock.unlock();
	}
}
