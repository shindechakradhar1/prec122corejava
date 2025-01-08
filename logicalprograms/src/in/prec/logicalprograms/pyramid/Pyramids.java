package in.prec.logicalprograms.pyramid;

public class Pyramids {

	int limit;
	
	public Pyramids() {}
	
	public Pyramids(int limit) {
		this.limit=limit;
	}
	
	public void setLimit(int limit) {
		this.limit=limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void printPyramid() {
		int number=1;
		char ch='A';
		// printing rows
		for(int row=1;row<=limit;row++) {
			// printing space
			for(int space=1; space<=limit-row;space++)
				System.out.print("\t");
			
			//printing number
			for(int col=1;col<=row*2-1;col++)
//				System.out.print(
//								(row%2==0)?
//										(ch++ + "\t \t"):
//										(number++ + "\t \t"));
				
//			if(row%2==0)
//				if(col%2==0)
//					System.out.print(number++ + "\t \t");
//				else
//					System.out.print(ch++ + "\t \t");
//			else
//				if(col%2==0)
//					System.out.print(ch++ + "\t \t");
//				else
//					System.out.print(number++ + "\t \t");
				
				System.out.print((row%2==0)?(col%2==0)?number++ + "\t" : ch++ + "\t":(col%2==0)?ch++ + "\t":number++ + "\t");
			
			System.out.println("\n");
		}
	}
}
