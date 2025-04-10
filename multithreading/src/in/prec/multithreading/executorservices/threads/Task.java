package in.prec.multithreading.executorservices.threads;

public class Task implements Runnable{

	@Override
	public void run() {	
		int table = (int)(Math.random()*10);
		for(int i=1;i<=10;i++)
			System.out.println(table*i);
	}
}
