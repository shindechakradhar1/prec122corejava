package in.prec.collection.queue.blockingqueue.restaurant.entities;

public class OPDRecords implements Comparable<OPDRecords>{
	private int patientId;
	private String patientName;
	private String disease;
	private int severness;

	public OPDRecords() {}

	public OPDRecords(int patientId, String patientName, String disease, int severness) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.severness = severness;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getSeverness() {
		return severness;
	}

	public void setSeverness(int severness) {
		this.severness = severness;
	}

	@Override
	public int compareTo(OPDRecords obj) {
//		if(this.severness>obj.severness)
//			return 1;
//		if(this.severness==obj.severness)
//			return 0;
//		
//		return -1;
		return obj.severness-this.severness;
	}
	
	@Override
	public String toString() {
		return "OPDManagement [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease
				+ ", severness=" + severness + "]";
	}

}
