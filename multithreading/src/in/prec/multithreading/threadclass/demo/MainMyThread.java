package in.prec.multithreading.threadclass.demo;

public class MainMyThread {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1,2,3,4);
		MyThread thread2 = new MyThread(5,6,7,8);
//		thread1.printArray();
//		thread2.printArray();
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		try {
			thread1.sleep(200);
			System.out.println(thread1.getState());
		}catch(InterruptedException e) {
			e.printStackTrace();
//			Thread.currentThread().interrupt();
		}
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		System.out.println(thread2.getState());
		
	}
}
