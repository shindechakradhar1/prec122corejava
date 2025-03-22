package in.prec.collection.queue.priorityqueue.entities;

public class DevoteeQueue implements Comparable<DevoteeQueue> {
	private int queueId;
	private String name;
	private int age;
	private float fees;

	public DevoteeQueue() {
	}

	public DevoteeQueue(int queueId, String name, int age, float fees) {
		this.queueId = queueId;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}

	public int getQueueId() {
		return queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public int compareTo(DevoteeQueue dQueue) {
		return dQueue.name.compareTo(this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		DevoteeQueue temp = (DevoteeQueue) obj;

		return this.getName().equals(temp.getName()) && this.getQueueId() == temp.getQueueId();

	}

	@Override
	public String toString() {
		return "DevoteeQueue [queueId=" + queueId + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}

}
