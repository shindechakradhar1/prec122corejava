package in.prec.collection.queue.blockingqueue.restaurant.entities;

public class ServiceCalls {
	private int callerId;
	private String callerName;

	public ServiceCalls() {}

	public ServiceCalls(int callerId, String callerName) {
		this.callerId = callerId;
		this.callerName = callerName;
	}

	public int getCallerId() {
		return callerId;
	}

	public void setCallerId(int callerId) {
		this.callerId = callerId;
	}

	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}

	@Override
	public String toString() {
		return "ServiceCalls [callerId=" + callerId + ", callerName=" + callerName + "]";
	}

}
