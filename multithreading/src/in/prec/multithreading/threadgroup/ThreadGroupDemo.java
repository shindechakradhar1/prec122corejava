package in.prec.multithreading.threadgroup;

public class ThreadGroupDemo implements Runnable{
	public static void main(String[] args) {
		ThreadGroupDemo rThread1 = new ThreadGroupDemo();
		ThreadGroupDemo rThread2 = new ThreadGroupDemo();
		ThreadGroup group1 = new ThreadGroup("myGroup");
		Thread thread1 = new Thread(group1,rThread1);
		Thread thread2 = new Thread( group1,rThread2);
		System.out.println(group1.activeCount());
		thread1.start();
		thread2.start();
		group1.setMaxPriority(7);
		group1.list();
	}
	
	public void run() {
		System.out.println("Hello");
	}
}
