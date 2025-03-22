package in.prec.collection.queue.blockingqueue.restaurant;

import java.util.concurrent.PriorityBlockingQueue;

import in.prec.collection.queue.blockingqueue.restaurant.entities.OPDRecords;

public class OPDManagement {
	public static void main(String[] args) {
		OPDRecords[] opdRecords = {
				new OPDRecords(1, "Krushna", "Fever", 3),
				new OPDRecords(2, "Rushikesh", "Cold", 3),
				new OPDRecords(3, "Navnath", "Covid", 7),
				new OPDRecords(4, "Vivek", "Cough", 4),
				new OPDRecords(5, "Sakshi", "Cancer", 6),
				new OPDRecords(6, "Komal", "Fracture", 8),
				new OPDRecords(7, "Nikita", "Accident", 10),
				new OPDRecords(8, "Poonam", "Dengue", 5),
				new OPDRecords(9, "Anushka", "Heart Attack", 10),
				new OPDRecords(9, "Anushka", "Brain Tumor", 9)		
		};
		
		PriorityBlockingQueue<OPDRecords> patientProcessing = 
				new PriorityBlockingQueue<>(1, (obj1,obj2)->obj2.getPatientName().compareTo(obj1.getPatientName()));
		
		Thread patient = new Thread(()->{
			try {
				for(OPDRecords records:opdRecords) {
					patientProcessing.put(records);
					System.out.println("Patient Admitted: " + records);
					Thread.sleep(100);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		Thread doctor = new Thread(()->{
			try {
				for(int i=0;i<opdRecords.length;i++) {
					System.out.println("Patient Discharged:" + patientProcessing.take());
					Thread.sleep(2000);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		patient.start();
		doctor.start();
	}
}
