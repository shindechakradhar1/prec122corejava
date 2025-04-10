package in.prec.multithreading.executorservices;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import in.prec.multithreading.executorservices.threads.CustomFactory;

public class PrintingMessages {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService eService = Executors.newFixedThreadPool(3, new CustomFactory());
		ExecutorService eService = Executors.newSingleThreadExecutor();
		
//		for(int i=0;i<5;i++)
//			eService.execute(()->System.out.println((int)(Math.random()*10)));
		
		Callable<Double> doubleRandom= Math::random;
		for(int i=0;i<10;i++) {		
			Future<Double> doubleResult=eService.submit(doubleRandom);
			int table=(int)(doubleResult.get()*10);
			for(int j=1;j<=10;j++) {
				System.out.println(table + "*" + j + "=" + table*i);
			}
		}
		eService.shutdown();
	}
}
