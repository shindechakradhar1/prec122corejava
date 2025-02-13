package in.prec.arrays.objectarray.main;

import java.util.Scanner;

import in.prec.arrays.objectarray.Student;

public class MainStudentRecord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number records to be Stored?");
		System.out.println(": ");
		int arraySize = scanner.nextInt();
		Student[] studentArray = new Student[arraySize];
		
		System.out.println("Enter Student record:");
		int rollNo;
		String name;
		for(int i=0;i<arraySize;i++) {
			
			System.out.println("Enter Student " + (i+1) + " Roll Number: ");
			rollNo = scanner.nextInt();
			System.out.println("Enter Student " + (i+1) + " Name: ");
			scanner.nextLine();
			name=scanner.nextLine();
			studentArray[i] = new Student();
			studentArray[i].setRollNo(rollNo);
			studentArray[i].setName(name);
			
		}
		
		for(int i=0;i<arraySize;i++)
			System.out.println(studentArray[i]);
		
		System.out.println("Enter A Roll Number to Find a Record: ");
		int key = scanner.nextInt();
		
		int result=binarySearch(studentArray, key);
		if(result>=0)
			System.out.println(studentArray[result]);
		else
			System.out.println("Record Not Found:");
		
		scanner.close();
	}
	
	public static int binarySearch(Student[] studentArray, int key) {
		int left=0;
		int right=studentArray.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(key==studentArray[mid].getRollNo())
				return mid;
			else if(key>studentArray[mid].getRollNo())
				left=mid+1;
			else
				right=mid;
		}
		
		return -1;
	}
}
