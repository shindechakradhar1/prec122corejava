package in.prec.collection.queue.priorityqueue.main;

import java.util.Comparator;
import java.util.PriorityQueue;

import in.prec.collection.queue.priorityqueue.comparators.DevoteeQueueComparator;
import in.prec.collection.queue.priorityqueue.entities.DevoteeQueue;

public class MainDevoteeQueue {

	public static void main(String[] args) {
		
//		Comparator<DevoteeQueue> ageComparator = (obj1, obj2)->obj2.getAge()-obj1.getAge();
		
		PriorityQueue<DevoteeQueue> dQueue = 
				new PriorityQueue<>(DevoteeQueueComparator.ageComparator);
		dQueue.add(new DevoteeQueue(1,"ABC",30,20));
		dQueue.add(new DevoteeQueue(3,"BBC",50,10));
		dQueue.add(new DevoteeQueue(2,"CBC",40,200));
		dQueue.add(new DevoteeQueue(1,"DBC",21,20));
		
		System.out.println(dQueue.poll());
		System.out.println(dQueue.poll());
		System.out.println(dQueue.poll());
		System.out.println(dQueue.poll());
		System.out.println(dQueue.poll());
		
		
		PriorityQueue<DevoteeQueue> vipQueue = 
				new PriorityQueue<>((o1,o2) -> (int)(o2.getFees()-o1.getFees()));
		vipQueue.add(new DevoteeQueue(1,"EBC",30,20));
		vipQueue.add(new DevoteeQueue(3,"FBC",50,10));
		vipQueue.add(new DevoteeQueue(2,"GBC",40,200));
		vipQueue.add(new DevoteeQueue(1,"HBC",21,20));
		
//		for(DevoteeQueue devQueue:vipQueue) {
////			if(devQueue.getAge()==40)
////				devQueue.setAge(45);
//			System.out.println(devQueue);
//		}
		
		vipQueue.remove(new DevoteeQueue(2,"GBC",40,200));
		vipQueue.add(new DevoteeQueue(2,"GBC",40,20));
		
		for(DevoteeQueue devQueue:vipQueue) {
//			if(devQueue.getAge()==40)
//				devQueue.setAge(45);
			if (devQueue.equals(new DevoteeQueue(2, "GBC", 40, 200)))
				System.out.println(devQueue);
		}
		
//		System.out.println(new DevoteeQueue(2,"GBC",40,200).equals(new DevoteeQueue(2,"GBC",40,200)));
		
//		System.out.println(vipQueue.poll());
//		System.out.println(vipQueue.poll());
//		System.out.println(vipQueue.poll());
//		System.out.println(vipQueue.poll());
//		System.out.println(vipQueue.poll());
		
		
	}
}
