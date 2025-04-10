package in.prec.multithreading.deadlock;

public class DeadLockDemo {
	public static void main(String[] args) {
		Object resource1 = new Object();
		Object resource2 = new Object();
		
		new Thread(()->{
			synchronized(resource1) {
				System.out.println("Thread 1 - Acquires Resource 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(resource2) {
					System.out.println("Thread 1 - Acquires Resource 2");
				}
			}
		}).start();
		
		new Thread(()->{
			synchronized(resource2) {
				System.out.println("Thread 2 - Acquires Resource 2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(resource1) {
					System.out.println("Thread 2 - Acquires Resource 1");
				}
			}
		}).start();
	}
}
