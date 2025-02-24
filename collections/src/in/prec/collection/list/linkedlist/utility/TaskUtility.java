package in.prec.collection.list.linkedlist.utility;

import java.util.LinkedList;
import java.util.ListIterator;

import in.prec.collection.list.linkedlist.entities.Tasks;

public class TaskUtility {
	LinkedList<Tasks> taskList=new LinkedList<>();
	
	public void addTask(Tasks task) {
		taskList.addFirst(task);
	}
	
	public void removeTask() {
		taskList.removeFirst();
	}
	
	public Tasks getTask() {
		return taskList.peek();
	}
	
	public void printTasks() {
		ListIterator<Tasks> taskIterator = taskList.listIterator(taskList.size());
		while(taskIterator.hasPrevious())
			System.out.println(taskIterator.previous());
	}
}	
