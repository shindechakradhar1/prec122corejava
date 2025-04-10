package in.prec.multithreading.polling.consumer;

import in.prec.multithreading.polling.entities.PrintData;

public class ConsumerThread implements Runnable {

	PrintData printData;

	public ConsumerThread(PrintData printData) {
		this.printData = printData;
	}
	
	public void consumePrintingData() {
		String data=null;
		do {
			data=printData.getData();
			System.out.println("Get: " + data);
		}while(!data.equals("$"));
	}

	@Override
	public void run() {
		consumePrintingData();	
	}
	

}
