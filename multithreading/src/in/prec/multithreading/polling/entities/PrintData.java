package in.prec.multithreading.polling.entities;

public class PrintData {
	private String data;
	private boolean isReady;

	public synchronized String getData() {
		while(!isReady)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		isReady=false;
		notify();
		return data;
	}

	public synchronized void setData(String data) {
		while(isReady)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		isReady=true;
		notify();
		this.data = data;
		System.out.println("Set: " + data);
	}
	
	
}
