package com.ot9.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//duplicate keys are not allowed
//values can be duplicate
//key,value can any data type
//Hashmap will not follow insertion order and linkedhashmap will follow insertion order 
//treeset will follow sorting order based keys
public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(123,"suresh");
		map.put(55,"naresh");
		map.put(4,"rajesh");
		map.put(87,"mahesh");
		map.put(123,"hitesh");
		map.put(9001,"kumar");
		map.put(432,"qwerty");
		map.put(333,"noel");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		
		Iterator<Integer> itr=keys.iterator();
		
		while (itr.hasNext()) {
			int key=itr.next();
			System.out.println(key+" "+map.get(key));
			
		}
		
		System.out.println("********************************");
		Set<Entry<Integer, String>> entries=map.entrySet();
		
		Iterator<Entry<Integer, String>> itr1=entries.iterator();
		
		while (itr1.hasNext()) {
			Entry<Integer, String> entry=itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
//		System.out.println(map.get(432));
//		map.remove(432);
//		System.out.println(map);
//		System.out.println(map.containsKey(123));
//		System.out.println(map.containsValue("sandeep"));
//		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
//		map1.put(222,"sandeep");
//		map1.put(999,"pavan");
//		map1.put(888,"somesh");
//		map1.put(1212,"nihasvi");
//		map1.putAll(map);
//		System.out.println(map1);
		
		
	}

}
