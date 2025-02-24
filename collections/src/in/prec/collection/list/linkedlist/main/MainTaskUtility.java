package in.prec.collection.list.linkedlist.main;

import in.prec.collection.list.linkedlist.entities.Tasks;
import in.prec.collection.list.linkedlist.utility.TaskUtility;

public class MainTaskUtility {
	public static void main(String[] args) {
		TaskUtility util = new TaskUtility();
		
		util.addTask(new Tasks("Java Session", 10));
		util.addTask(new Tasks("Pre Placement Talk", 1));
		util.addTask(new Tasks("Pre Placement Talk", 4));
		util.addTask(new Tasks("Traditional Day", 1));
		util.addTask(new Tasks("Rest", 1));
		
		util.printTasks();
		
	}
}
