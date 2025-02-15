package in.prec.exception.service;

import in.prec.exception.customexceptions.InvalidAgeException;
import in.prec.exception.customexceptions.InvalidNameException;
import in.prec.exception.dao.StudentDao;
import in.prec.exception.entities.Student;

public class StudentService {
	public String intsert(Student student) throws InvalidAgeException,InvalidNameException, Exception{	
		if(student.getAge()<=18) {
			throw(new InvalidAgeException("Invalid Age.."));
		}
		
		if(!student.getName().matches("[A-Z][a-z]{1,15}"))
			throw(new InvalidNameException("Invalid Name"));
		
		StudentDao studentDao = new StudentDao();
		return studentDao.insert(student);
	}
}
