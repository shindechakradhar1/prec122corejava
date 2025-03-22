package in.prec.collection.map.hashmap;

import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCount {
	public static void main(String[] args) {
//		String name="I am in Loni, "
//					+ "i am at, PREC; Loni BK, " 
//					+ "dist. A. Nagar, Maharashtra "
//					+ "at post Loni";
//		TreeMap<String, Integer> wordCount = new TreeMap<>();
//		String[] msgs = name.split("[,;. ]+");
//		for(String msg:msgs)
//			if(wordCount.putIfAbsent(msg.toLowerCase(), 1)!=null)
//				wordCount.compute(msg.toLowerCase(), (k,v)->v+1);
//		
//		wordCount.forEach((k,v)->System.out.println(k + " -> " + v));
		
		
		String name="I am in Loni, "
				+ "i am at, PREC; Loni BK, " 
				+ "dist. A. Nagar, Maharashtra "
				+ "at post Loni";
	TreeMap<String, Integer> wordCount = new TreeMap<>();
	StringTokenizer tokens = new StringTokenizer(name, "[,;. ]+");
	while(tokens.hasMoreTokens()) {
		String temp=tokens.nextToken();
		if(wordCount.putIfAbsent(temp.toLowerCase(), 1)!=null)
			wordCount.compute(temp.toLowerCase(), (k,v)->v+1);
	}
	wordCount.forEach((k,v)->System.out.println(k + " -> " + v));
		
		
		
	}
}
