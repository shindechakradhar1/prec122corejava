package in.prec.collection.queue.blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {
	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> intQueue = new LinkedBlockingQueue<>();
		
//		Consumer
		new Thread(()->{
			for(int i=0;i<10;i++) {
				try {
					intQueue.put(i);
					System.out.println("set: " + i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
//		Supplier
		new Thread(()-> {
			for(int i=0;i<10;i++)
				try {
					System.out.println("get: " + intQueue.take());
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}).start();
		
		
	}
}
