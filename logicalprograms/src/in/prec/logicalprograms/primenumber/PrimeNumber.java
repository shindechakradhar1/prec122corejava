package in.prec.logicalprograms.primenumber;

public class PrimeNumber {

	int number;
	public PrimeNumber() {}
	public PrimeNumber(int number) {
		this.number=number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public boolean isPrime() {
		for(int i=2;i*i<=number;i++)
			if(number%i==0)
				return false;
		
		return true;	
	}
	
}
