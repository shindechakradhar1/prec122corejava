package in.prec.collection.queue.blockingqueue.restaurant;

import java.util.concurrent.ArrayBlockingQueue;

import in.prec.collection.queue.blockingqueue.restaurant.entities.Orders;

public class OrderManagement {
	public static void main(String[] args) {
		ArrayBlockingQueue<Orders> orderQueue = new ArrayBlockingQueue<>(3);
		Orders[] ordersArray = { new Orders(1, "Masala Papad"), new Orders(2, "Chicken Biryani"),
				new Orders(3, "Paneer  Masala"), new Orders(4, "Paneer  Tika Masala"), new Orders(5, "Paneer  Kofta"),
				new Orders(6, "Veg Kolhapur"), new Orders(7, "Kaju Masala"), new Orders(8, "Shev Bhaji"),
				new Orders(9, "Sabudana Khichdi"), new Orders(10, "Dal Tadka") };

		Thread waiter = new Thread(() -> {
			try {
				for (Orders order : ordersArray) {
					orderQueue.put(order);
					System.out.println("Order Placed: " + order);
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread chef = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("Order completed: " + orderQueue.take());
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		waiter.start();
		chef.start();
	}
}
