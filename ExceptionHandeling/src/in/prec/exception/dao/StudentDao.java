package in.prec.exception.dao;

import in.prec.exception.entities.Student;

public class StudentDao {
	public String insert(Student student) throws Exception{
		
		Integer intVar=10;
		Object objInt = intVar;
//		try {
//			Double result = (Double)objInt;
//		}catch(ClassCastException e) {
//			throw(new Exception("Casting issue",e));
//		}
//		NumberFormatException
		try {
			int result = Integer.parseInt("123");
		}catch(NumberFormatException e) {
			throw(new Exception(e.getMessage(), e));
		}
		
		
		return "Successfully inserted..";
	}
}
