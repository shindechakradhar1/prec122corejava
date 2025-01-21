package in.prec.recursion.operations;

public class Operations {
	
	public int calculateSum(int no) {
		if(no<0)
			return 1;
		return no + calculateSum(no-1);
	}
	
	public int calculateFactorial(int no) {
//		if(no<=0)
//			return 1;
//		else
//			return no*calculateFactorial(no-1);
		return (no<=0) ? 1 : no*calculateFactorial(no-1); 
	}
	
	
	public int calculatePower(int base, int exp) {
//		if(exp<=1)
//			return base;
//		else
//			return base * calculatePower(base, exp-1);
		return (exp<=1) ? 
				base 
				: 
				base * calculatePower(base, exp-1);
	}
	
	public boolean isPrime(int number, int factor) {
		if(number<2)
			return false;
		if(factor*factor>number)
			return true;
		if(number%factor==0)
			return false;
		else
			return isPrime(number, factor+1);
		
	}
}
