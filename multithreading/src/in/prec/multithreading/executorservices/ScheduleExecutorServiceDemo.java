package in.prec.multithreading.executorservices;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import in.prec.multithreading.executorservices.threads.Task;

public class ScheduleExecutorServiceDemo {
	public static void main(String[] args) {
		ScheduledExecutorService sEService = Executors.newScheduledThreadPool(2);
		
		sEService.scheduleAtFixedRate(new Task(), 1, 2, TimeUnit.SECONDS);
		
		sEService.schedule(()->{
			System.out.println("ShutDown services");
			sEService.shutdown();
		}, 10, TimeUnit.SECONDS);
	}
}
