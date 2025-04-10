package in.prec.multithreading.executorservices.threads;

import java.util.concurrent.ThreadFactory;

public class CustomFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread thread1 = new Thread(r);
		thread1.setPriority(7);
		return thread1;
	}

	
}
