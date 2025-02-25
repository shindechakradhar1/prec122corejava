package in.prec.collection.list.stack.utility;

import java.util.Enumeration;
import java.util.Stack;

public class UtilityOperation {
	private int size;
	private Stack<Integer> intStack;
	private int index;
	
	public UtilityOperation(int size) {
		this.size=size;
		intStack = new Stack<>();
	}
	
	public void redo() {
		if(index<size) {
		intStack.push((int)(Math.random()*100));
		index++;
		}else
			System.out.println("Stack is full");
	}
	
	public void undo() {
		if(index>0) {
			System.out.println(intStack.pop());
			index--;
		}else {
			System.out.println("Stack is Empty");
		}
	}
	
	public void printStack() {
		Enumeration<Integer> intEnumeration= intStack.elements();
		while(intEnumeration.hasMoreElements())
			System.out.println(intEnumeration.nextElement());
	}
	
}
