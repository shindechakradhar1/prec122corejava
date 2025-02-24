package in.prec.collection.list.linkedlist.entities;

public class Tasks {
	private String task;
	private int priority;

	public Tasks() {}

	public Tasks(String task, int priority) {
		this.task = task;
		this.priority = priority;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Tasks [task=" + task + ", priority=" + priority + "]";
	}

}
