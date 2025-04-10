package in.prec.multithreading.synchronization;

public class RunnableSynchronizedPrintTable implements Runnable {

	private SynchronizedPrintTable pTable;
	private int no;

	public RunnableSynchronizedPrintTable(SynchronizedPrintTable pTable, int no) {
		this.pTable = pTable;
		this.no = no;
	}

	@Override
	public void run() {
		pTable.printTable(no);
	}

}
