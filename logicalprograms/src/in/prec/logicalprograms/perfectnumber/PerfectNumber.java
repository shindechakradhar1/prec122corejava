package in.prec.logicalprograms.perfectnumber;

public class PerfectNumber {

	int number;
	public PerfectNumber() {}
	public PerfectNumber(int number) {
		this.number=number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public boolean isPerfectNumber() {
		if(number<=1) 
			return false;
		int sum=0;
		for(int i=1;i<=number/2;i++)
			if(number%i==0)
				sum+=i;
		
		return number==sum;
	}
}
