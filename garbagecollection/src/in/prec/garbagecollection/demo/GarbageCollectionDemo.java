package in.prec.garbagecollection.demo;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
		List<GarbageCollectorMXBean> gcs= ManagementFactory.getGarbageCollectorMXBeans();
		
		for(GarbageCollectorMXBean bean:gcs) {
			System.out.println(bean.getName());
			System.out.println(bean.getClass());
		}
	}
}
