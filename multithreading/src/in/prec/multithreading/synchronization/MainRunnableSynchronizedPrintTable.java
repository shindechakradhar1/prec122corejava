package in.prec.multithreading.synchronization;

public class MainRunnableSynchronizedPrintTable {
	public static void main(String[] args) {
		SynchronizedPrintTable table = new SynchronizedPrintTable();
		
		
		
		new Thread(new RunnableSynchronizedPrintTable(table,1)).start();
		new Thread(new RunnableSynchronizedPrintTable(table,2)).start();
		new Thread(new RunnableSynchronizedPrintTable(table,3)).start();
		new Thread(new RunnableSynchronizedPrintTable(table,4)).start();
		new Thread(new RunnableSynchronizedPrintTable(table,5)).start();
		
		
	}
}
