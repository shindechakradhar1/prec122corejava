package in.prec.multithreading.polling.producer;

import in.prec.multithreading.polling.entities.PrintData;

public class ProducerThread implements Runnable {

	private PrintData printData;

	public ProducerThread(PrintData printData) {
		this.printData = printData;
	}
	
	public void producePrintingData() {
		String[] nameArray = {"Ayush","Rushikesh","Ashish","Komal","Sakshi","$"};
		for(String name:nameArray)
			printData.setData(name);
	}

	@Override
	public void run() {
		producePrintingData();
	}

}
