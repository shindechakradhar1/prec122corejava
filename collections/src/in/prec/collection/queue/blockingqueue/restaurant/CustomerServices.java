package in.prec.collection.queue.blockingqueue.restaurant;

import java.util.concurrent.LinkedBlockingQueue;

import in.prec.collection.queue.blockingqueue.restaurant.entities.ServiceCalls;

public class CustomerServices {
	public static void main(String[] args) {
		ServiceCalls[] callArray = { new ServiceCalls(1, "Krushna"), new ServiceCalls(2, "Rushikesh"),
				new ServiceCalls(3, "Navnath"), new ServiceCalls(4, "Vivek"), new ServiceCalls(5, "Sakshi"),
				new ServiceCalls(6, "Komal"), new ServiceCalls(7, "Nikita"), new ServiceCalls(8, "Mansi"),
				new ServiceCalls(9, "Krutika"), new ServiceCalls(10, "Poonam"), };

		LinkedBlockingQueue<ServiceCalls> callQueue = new LinkedBlockingQueue<>();
		Thread caller = new Thread(() -> {
			try {
				for (int i = 0; i < callArray.length; i++) {
					callQueue.put(callArray[i]);
					System.out.println("Ongoing call: " + callArray[i]);
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});

		Thread customerServiceRepresentative1 = new Thread(() -> {
			try {
				for (int i = 0; i < callArray.length; i++) {
					System.out.println("Processed call: " + callQueue.take());
					Thread.sleep(1500);
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		Thread customerServiceRepresentative2 = new Thread(() -> {
			try {
				for (int i = 0; i < callArray.length; i++) {
					System.out.println("Processed call: " + callQueue.take());
					Thread.sleep(1500);
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		caller.start();
		customerServiceRepresentative1.start();
		customerServiceRepresentative2.start();
	}
}
