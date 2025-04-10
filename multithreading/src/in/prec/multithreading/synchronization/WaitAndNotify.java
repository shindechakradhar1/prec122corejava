package in.prec.multithreading.synchronization;

public class WaitAndNotify {
	public static void main(String[] args) {
		WaitAndNotify obj1 = new WaitAndNotify();
//		obj2.printArray("ABC","BBC","CBC","DBC","EBC");
//		obj1.printArray(1,2,3,4,5);
		Runnable runnable1 = ()->obj1.printArray(1,2,3,4,5);
		Runnable runnable2 = ()->obj1.printArray("ABC","BBC","CBC","DBC","EBC");
		new Thread(runnable1).start();
		new Thread(runnable2).start();
//		obj1.notifyMe(runnable1);
		
	}
	
	
	public synchronized <T>void printArray(T... tArray){
		for(T element:tArray) {
			System.out.println(element);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
//	public synchronized void notifyMe(Runnable runnable) {
//		runnable.notifyAll();
//	}

}
