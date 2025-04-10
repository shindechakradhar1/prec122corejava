package in.prec.multithreading.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoServiceDemo {
	public static void main(String[] args) {
		new Thread(()->print()).start();
		new Thread(()->print()).start();
		new Thread(()->print()).start();
		new Thread(()->print()).start();
		new Thread(()->print()).start();
		
		ExecutorService services = Executors.newFixedThreadPool(3);
		for(int i=0;i<5;i++)
			services.execute(()->print());
		
		services.shutdown();
		
	}
	
	public static void print() {
		System.out.println(Thread.currentThread().getName());
	}
}
