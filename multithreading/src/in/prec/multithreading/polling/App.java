package in.prec.multithreading.polling;

import in.prec.multithreading.polling.consumer.ConsumerThread;
import in.prec.multithreading.polling.entities.PrintData;
import in.prec.multithreading.polling.producer.ProducerThread;

public class App {
	public static void main(String[] args) {
		PrintData printData = new PrintData();
		
		Thread consumer = new Thread(new ConsumerThread(printData));
		Thread producer = new Thread(new ProducerThread(printData));
		
		consumer.start();
		producer.start();
	}
}
