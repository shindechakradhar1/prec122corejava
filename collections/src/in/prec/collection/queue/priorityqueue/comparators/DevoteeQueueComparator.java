package in.prec.collection.queue.priorityqueue.comparators;

import java.util.Comparator;

import in.prec.collection.queue.priorityqueue.entities.DevoteeQueue;

public interface DevoteeQueueComparator {
	 Comparator<DevoteeQueue> ageComparator = 
			(obj1, obj2)->obj2.getAge()-obj1.getAge();
}
