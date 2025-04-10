package in.prec.multithreading.threadclass.demo;

public class MyThread extends Thread {
	int[] intArray;
	
	public MyThread(int... intArray) {
		this.intArray=intArray;
	}
	public void printArray() {
		for(int no:intArray) {
//			try {
				System.out.println(no);
//				Thread.sleep(2000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public void run() {
		printArray();
	}
}
