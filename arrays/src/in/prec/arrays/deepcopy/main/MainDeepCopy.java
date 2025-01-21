package in.prec.arrays.deepcopy.main;

import in.prec.arrays.deepcopy.ShalowCopy;

public class MainDeepCopy {

	public static void main(String[] args) {
		ShalowCopy copy = new ShalowCopy();
		copy.setVariable(100);
		System.out.println(copy.getVariable());
		
//		copyObject(copy);
		
		ShalowCopy copy1 = copy;
		copy1.setVariable(1234);
		
		System.out.println(copy.getVariable());
		
	}
	
	public static void copyObject(ShalowCopy copy1) {
		copy1.setVariable(200);
		
	}
}
